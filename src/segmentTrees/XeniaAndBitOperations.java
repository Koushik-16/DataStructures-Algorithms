package segmentTrees;

import java.util.Scanner;

public class XeniaAndBitOperations {
	
	public static  void build(int ind , int low , int high , int arr [] , int seg [] , boolean or) {
		if(low == high) {
			seg[ind] = arr[low];
			return ;
		}
		int mid = (low + high)/2;
		build(2 * ind + 1, low , mid , arr,seg, !or);
		build(2 * ind + 2, mid + 1 , high , arr,seg, !or);
		if(or == true) {
			seg[ind] = seg[2 * ind + 1] | seg[2 * ind + 2];
		}else {
			seg[ind] = seg[2 * ind + 1] ^ seg[2 * ind + 2];
		}
		
	}
	
	static void  update(int ind , int low , int high ,int seg[], int i , int val, boolean or) {
		if(low == high) {
			seg[ind] = val;
			return;
		}
		int mid = (low + high)/2;
		if(i <= mid) update(2 * ind  + 1,low , mid , seg , i , val,!or);
		else update(2 * ind  + 2,mid + 1 , high , seg , i , val,!or);
		if(or == true) {
			seg[ind] = seg[2 * ind + 1] | seg[2 * ind + 2];
		}else {
			seg[ind] = seg[2 * ind + 1] ^ seg[2 * ind + 2];
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int arr [] = new int[1<<n];
		for(int i = 0 ; i < arr.length; i++) arr[i] = sc.nextInt();
		int seg [] = new int[4 * arr.length];
		if(n % 2 == 0) {
			build(0,0,arr.length - 1,arr,seg,false);
		}else {
			build(0,0,arr.length - 1,arr,seg,true);
		}
		while(q -- > 0) {
			int i = sc.nextInt();
			int val = sc.nextInt();
			i--;
			if(n % 2 == 0) {
				update(0,0,arr.length - 1, seg,i,val,false);
			}else {
				update(0,0,arr.length - 1, seg,i,val,true);
			}
			System.out.println(seg[0]);
		}
		

	}

}
