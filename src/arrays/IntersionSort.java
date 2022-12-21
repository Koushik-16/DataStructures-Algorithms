package arrays;

public class IntersionSort {
	
	public static int [] insertionSort(int a []) {
		for(int i = 1; i < a.length ; i++) {
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		return a;
	}
	
	
	public static int [] sort(int arr []) {
		int n = arr.length ;
		for(int i = 1; i < n ; i++ ) {
			for(int j = i-1 ; j >= 0 ; j--) {
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}else break;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}


	public static void main(String[] args) {
		int a [] = { 4,2, 9, 5,1,3};
        int ans [] = sort(a);
        for(int val : a) {
        	System.out.print(val + " ");
        }
	}

}
