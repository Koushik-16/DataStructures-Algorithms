package arrays;

public class SelectionSort {
	
	public static int [] selectionSort(int a []) {
		for(int i = 0; i < a.length -1 ; i++) {
			int min = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			if(min != i) {
				swap(a,min,i);
			}
		}
		return a;
	}

	private static void swap(int[] a, int min, int i) {
		int temp = a[min];
		a[min] = a[i];
		a[i] = temp;
	}

	public static void main(String[] args) {
		

	}

}
