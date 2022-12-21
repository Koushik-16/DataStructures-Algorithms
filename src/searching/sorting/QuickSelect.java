package searching.sorting;

import java.util.Arrays;

public class QuickSelect {
	
	public static int quickSelect(int arr [], int low , int high , int k) {
		int pivot = arr[high];
		int pi = partition(arr,low,high,pivot);
		if(k > pi) {
			return  quickSelect(arr,pi + 1,high,k);
		}else if(k < pi) {
			return quickSelect(arr,low,pi -1,k);
		}else {
			return arr[pi];
		}
	}
	
	public static int partition(int arr [] ,int low , int high, int pivot) { // returns pivot index
		// 0 -> j -1 <= pivot
		// j -> i -1 > pivot
		// i -> end unknown
		int i =low ;
		int j= low;
		while(i <= high) {
			if(arr[i] > pivot) i++;
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return j -1;
	}
	
	public static void swap(int arr [] , int i , int j) {
		int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	}
	
	public static void quickSort(int arr[] , int lo , int hi) {
		if(lo >= hi) return;
		int pivot = arr[hi];
		int pi = partition(arr,lo,hi,pivot);
		quickSort(arr,lo,pi -1);
		quickSort(arr,pi + 1,hi);
		
	}

	public static void main(String[] args) {
		 int arr [] = {7,4,1,9,2,8,5};
		 int k = 5;
//		 System.out.println(quickSelect(arr,0,arr.length - 1,k -1));
//		 quickSort(arr,0,arr.length - 1);
//		 System.out.println(Arrays.toString(arr));
		 
		 String s = "6";
		 String t = "8";
		 System.out.println(t.compareTo(s));

	}

}
