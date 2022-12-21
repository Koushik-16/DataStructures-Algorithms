package searching.sorting;

public class SearchInfinite {
	
	public static int SearchInfinite(int [] a, int key) { 
		int low = 0 ; 
		int high = 1;
		while(high < key) {
			low = high ;
			high = high *2;
		}
		return binarySearch(a,low,high,key);
	}
	public static int binarySearch(int [] a, int low, int high, int key) {
		while(low <= high) {
			int mid = (low + high )/2;
			if(key == a[mid]) return mid;
			else if(key < a[mid]) high = mid-1;
			else low = mid+1;
		}
		return -1;	
	}
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
		System.out.println(SearchInfinite(a,11));
		

	}

}
