package searching.sorting;

public class WiggleSort {
	
	public static  void wiggleSort(int arr []) {
		for(int i =0 ; i < arr.length - 1 ; i++) {
			if(i % 2 == 0) {
				if(arr[i+1] < arr[i]) swap(arr,i,i+1);
			}else {
				if(arr[i+1] > arr[i]) swap(arr,i,i+1);
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	public static void main(String[] args) {
		

	}

}
