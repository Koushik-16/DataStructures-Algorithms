package searching.sorting;

public class MergeSort {
	
	public static void MergeSort(int [] a,int l,int r) {
		if(l < r) {
			int mid = (l+r)/2;
			MergeSort(a,l,mid);
			MergeSort(a,mid+1,r);
			Merge(a,l,mid,r);	
		}
		
	}
		public static void Merge(int [] a, int l, int mid , int r) {
		int i = l;
		int j = mid +1;
		int k = l;
		int b [] = new int[a.length];
		while(i <= mid && j <= r) {
			if(a[i] < a[j]) {
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
			while(j <= r) {
				b[k] = a[j];
				k++;
				j++;
			}
		
			while(i <= mid) {
				b[k] = a[i];
				k++;
				i++;
			}
		
	for(k = l; k <= r; k++) {
		a[k] = b[k];
	}
	}
		public static void printarray(int [] a) {
			for(int x = 0 ; x < a.length;x++) {
				System.out.print(a[x] +" ,");
			}
		}
	public static void main(String[] args) {
		int [] a = {9,4,7,6,3,1,5};
		int r = a.length -1;
		MergeSort(a,0,r);
		printarray(a);

	}
}
