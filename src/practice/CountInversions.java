package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountInversions {
	
	public static int inversioncount(int a [], int low , int high) {
		int count = 0;
		if(low < high) {
			int mid =low + (high - low) / 2;
			count += inversioncount(a,low ,mid);
			count += inversioncount(a,mid+1,high);
			count += merge(a,low,mid,high);
		}
		return count;
	}

	private static int merge(int[] a, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int l [] = new int[n1];
		for(int i = 0 ; i< n1 ; i++) {
			l[i] = a[low + i];
		}
		int r [] = new int[n2];
		for(int j = 0 ; j < n2; j++) {
			r[j] = a[mid + 1 + j];
		}
		
		int i = 0 ,j = 0 , k= low;
		int invcount = 0;
		while(i < n1 && j < n2 ) {
			if(l[i] <= r[j]) {
				a[k++]= l[i++];
			} else {
				a[k++] = r[j++];
				invcount += l.length - i;
			}
		}
			while(i < n1) a[k++] = l[i++];
			while(j < n2) a[k++] = r[j++];
		return invcount;
	}

public static void main(String []args) {
	int a [] = {2,4,1,3,5};
System.out.println(inversioncount(a,0,a.length - 1));
}
}
