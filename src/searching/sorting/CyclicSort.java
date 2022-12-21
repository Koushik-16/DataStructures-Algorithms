package searching.sorting;

public class CyclicSort {
	
	public static void CyclicSort(int a[]) {
		if(a.length <= 1) return;
		
		int i = 0 ;
		while(i < a.length) {
			if(a[i] != i+1) {
				int index = a[i] -1;
				int x = a[i];
				a[i] = a[index];
				a[index] = x;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int a [] = {3, 4, 2, 1, 5};
         CyclicSort(a);
         for(int val : a) {
        	 System.out.print(val + " ");
         }
	}

}
