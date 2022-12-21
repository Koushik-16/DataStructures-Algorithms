package searching.sorting;

public class CountInversion {
	
	public static int [] CountInversion(int [] arr, int low , int high) {
		if(low == high) {
			int [] ba = new int[low];
			return ba;
		}
		int mid = (low + high) / 2;
		int left [] = CountInversion(arr,low,mid);
		int right [] = CountInversion(arr, mid+1 ,high);
		int merged [] = count(arr, left, right);
		return merged;
	}
       static int count = 0;
	private static int[] count(int[] arr,int[] left, int[] right) {
		int i = 0 ;
		int j = 0;
		int k = 0;
		int [] merged = new int [left.length + right.length];
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				merged[k] = left[i];
				i++;
				k++;
			} else {
				count += (left.length - i);
				k++;
				j++;
			}
		}
		while(i < left.length) {
			merged[k] = left[i];
			i++;
			k++;
		}
		while(j < right.length) {
			merged[k] = right[j];
			j++;
			k++;
		}
		return merged;
	}
	public static void main(String[] args) {
		int a [] = {5, 4, 3, 2, 1};
		CountInversion(a,0,a.length - 1);
		System.out.println(count);
	}
}
