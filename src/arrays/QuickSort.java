package arrays;

public class QuickSort {
	static void swap(int [] a , int b , int c) {
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	public static int partition(int [] a,int l, int h) {	
		int pivet = a[l];
		int i = l;
		int j = h;
		while(i < j) {
			while( a[i] <= pivet) i++;
			while(a[j] > pivet) j--;
			if( i < j ) {
				swap(a,i,j);
			}
		}
		swap(a,j,l);
		return j;
	}
	static void QuickSort( int [] a ,int l, int h) {
		if(l < h) {
			int pi = partition(a, l, h);
			QuickSort(a,l,pi-1);
			QuickSort(a, pi+1,h);
		}
	}
	static void printArray(int[] arr, int size)	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	    System.out.println();
	}

	public static void main(String[] args) {
		int [] a = {4, 6, 2, 5, 7, 2, 1};
		int l = 0;
		int h = a.length - 1;
		QuickSort(a,l,h);
		printArray(a,a.length);
	}

}
