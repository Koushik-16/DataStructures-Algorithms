package binarySearch;

public class LowerBound {
	
	public static int lowerBound(int arr [],int low, int high, int key) {
		while(low <= high) {
			int mid = (low + high) /2;
			 if(arr[mid] >= key) high = mid - 1;
			else low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		int  arr [] = {1,2,2,2,2,2,3,4,5};
        System.out.println(lowerBound(arr,0,arr.length -1,4));
	}

}
