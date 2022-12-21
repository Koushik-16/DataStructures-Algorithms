package practice;

public class SearchInfinite {
	
	public static int searchInfinite(int a [] , int key) {
		int low = 0;
		int high = 1;
		while(high < key) {
			low = high;
			high = high * 2;
		}
		return binarySearch(a,low, high, key);
	}
	
	public static int binarySearch(int a [],int low , int high, int key) {
		int ans = -1;
		while(low <= high) {
			int mid = low + (high - low ) / 2;
			if(a[mid] == key) {
				return mid;
			} else if(a[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}	
		}
		return ans;
	}

	public static void main(String[] args) {
		int a [] = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10, 11, 12, 13};
           System.out.println(searchInfinite(a,11));
	}

}
