package arrays;

import java.util.Arrays;

public class Wavearray {
	
	static void swap (int [] a, int b, int c) {
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	public static void main(String[] args) { 
		 int arr[] = {10, 90, 49, 2, 1, 5, 23, 7}; 
	        int n = arr.length; 
	        wiggleSort(arr); 
	        for (int i : arr) 
	            System.out.print(i + " "); 
	    } 
	
	public static void  wiggleSort(int arr []) {
		int n = arr.length;
		for(int i = 0 ; i < n -1; i++) {
			if(i%2 == 1) {
				 if(arr[i] < arr[i+1]) swap(arr,i,i+1);
			}else {
				 if(arr[i] > arr[i+1]) swap(arr,i,i+1);
			}
		}
	}
	static void sortinwave(int [] arr, int n) {
		for(int i = 0 ; i< n ; i+=2) {
			if(i > 0 && arr[i-1] > arr[i])  swap(arr, i-1,i);
			
			if(i < n-1 && arr[i] < arr[i+1]) swap(arr , i, i+1);
		}
		
	}

}
