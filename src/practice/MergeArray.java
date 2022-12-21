package practice;

import java.util.Arrays;

public class MergeArray {
	
	public static void mergeArray(int a [], int m , int b [], int n) {
		if(m == 0) {
			for(int i = 0 ; i < b.length ; i++) {
				a[i] = b[i];
			}
			return;
		}
		if(n == 0) return ;
		int i = m-1;
		int j = n-1;
		int k = a.length - 1;
		while(i >= 0 && j >= 0) {
			
			if(a[i] >= b[j]) {
				a[k] = a[i];
				i--;
				k--;
			} else {
				a[k] = b[j];
				j--;
				k--;
			}
		}
		if(i < 0) {
			while(j >= 0) {
				a[k] = b[j];
				j--;
				k--;
			}
		}
		if(j < 0) {
			while(i >= 0) {
				a[k] = a[i];
				i--;
				k--;
			}
		}
	}

	public static void main(String[] args) {
		int a [] = {0};
        int m = 0;
        int b [] = {1};
        mergeArray(a,m,b,b.length);
        System.out.println(Arrays.toString(a));
	}

}
