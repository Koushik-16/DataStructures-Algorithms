package searching.sorting;

public class BinarySearch {

	public static  int index(int arr [], int low , int high , int key) {
		if(low <= high) {
			int mid = (low + high)/2;
			if(arr[mid] == key) return mid;
			else if(arr[mid] < key) return index(arr,mid +1,high,key);
			else return index(arr,low,mid -1,key);
		}else return -1;
	}
	
	public static void main(String[] args) {
		int arr [] = {1,2,4,6,8,9};
	  System.out.println(index(arr,0,arr.length -1,8));
	}

}
