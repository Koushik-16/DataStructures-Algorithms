package practice;

public class MergeSort {
	
	public static void MergeSort(int a [], int low,int high) {
		if(low < high ) {
			int mid = low +(high - low) /2;
		MergeSort(a,low,mid);
		MergeSort(a,mid+1,high);
		Merge(a,low,mid , high);
		}
	}

	public static void Merge(int[] a, int low, int mid, int high) {
		int n1 = mid - low +1;
		int n2 = high - mid;
		int left []= new int[n1];
		int right []= new int[n2];
		for(int i = 0 ; i < n1 ; i++) {
			left[i] = a[low + i];
		}
		for(int j = 0 ; j < n2; j++) {
			right[j] = a[mid+1 + j];
		}
		int i = 0 ;
		int j = 0;
		int k = low;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < n2) {
			a[k] = right[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		
     int a [] = {9 , 4, 7 , 3, 1, 2, 5};
     
        MergeSort(a,0,a.length - 1);
        
     for(int val : a) {
    	 System.out.print(val + " ,");
     }
  }

}
