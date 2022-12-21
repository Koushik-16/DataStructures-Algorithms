package practice;

import java.util.Arrays;

public class SortestUnsortedArray {
	
	public static int length(int a []) {
		int max = a[0];
		int end = -1;
		int start  = 0;
		int min = a[a.length - 1];
		for(int i = 1; i < a.length ; i++) {
			if(a[i] < max) {
				end = i;
			} else {
				max =a[i];
			}
		}
		for(int i = a.length - 2; i >= 0; i --) {
			if(a[i] > min ) {
				start = i;
			} else {
			   min = a[i];
			}
		}
		return end - start + 1;
	}
	
	    public static int[] subUnsort(int[] A) {
	        int max = A[0];
	        int start = 0;
	        int end = -1;
	        int min = A[A.length -1];
	        for(int i = 0 ; i < A.length ; i++){
	               if(A[i] < max){
	                   end = i;
	               }else {
	                   max = A[i];
	               }
	        }
	        for(int i = A.length - 2 ; i >= 0 ; i--){
	            if(A[i]  > min){
	                start = i;
	            }else {
	                min = A[i];
	            }
	        }
	       if(end - start + 1 == 0) return new int [] {-1};
	       else {
	           int a [] = new int[2];
	           a[0] = start;
	           a[1] = end;
	           return a;
	       }
	    }

	public static void main(String[] args) {
		int a []= {1,2,3,10,4,2,3,5};
		int ans [] = subUnsort(a);
		System.out.println(Arrays.toString(ans));

	}

}
