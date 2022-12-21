package practice;

import java.util.Arrays;

public class AgressiveCows {
	
	public static int AgressiveCows(int a [] , int n) {
		int res = 0;
		Arrays.sort(a);
		int low = 1;
		int high = a[a.length -1] - a[0];
		while( low <= high) {
			int mid = (low + high) / 2; 
			if(canPlace(a,mid,n)) {
				res= mid;
			    low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return res;
	}

	public static boolean canPlace(int[] a, int mid, int n) {
		int count = 1;
		int co_ord = a[0];
		for(int i =  1; i < a.length ;  i ++) {
			if(a[i] - co_ord >= mid) {
				count++;
				co_ord = a[i];
			}
			if(count == n) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
