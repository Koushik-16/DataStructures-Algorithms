package binarySearch;

import java.util.Scanner;

public class MagicPowerder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int needed [] = new int[n];
		for(int i = 0; i < n; i++) needed[i] = sc.nextInt();
		int has [] = new int[n];
		for(int i =0 ;i < n ;i++) has[i] = sc.nextInt();
		int low = 0;
		int high = 0;
		for(int i =0 ;i < n; i++) {
			int curr = (has[i] + k) / needed[i];
			high = Math.max(high, curr);
		}
		int ans = 0;
		while(low <= high) {
		   int mid = (low + high)/2;
		   if(isPossible(needed,has,k,mid)) {
			   ans = mid;
			   low = mid + 1;
		   }else {
			   high = mid - 1;
		   }
		}
		
		System.out.println(ans);

	}

	public  static boolean isPossible(int[] needed, int[] has, int k, int mid) {
		for(int i = 0 ; i < has.length ; i++) {
			int req = needed[i] * mid;
			if(has[i] >= req) {
				continue;
			}else {
				if(k <= 0) return false;
				k -= req - has[i];
			}
		}
		return k >= 0;
	}

}
