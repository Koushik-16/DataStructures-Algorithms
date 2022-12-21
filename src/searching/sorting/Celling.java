package searching.sorting;

public class Celling {
	
	public static int celling(int a [] , int b) {
		if(b > a[a.length - 1]) return -1;
		int n = a.length;
		int low = 0;
		int high = n-1;
		int res = 0;
		while(low <= high) {
		int mid = (low + high) >> 1;
		if(a[mid] == b) {
			return a[mid];
		}else if(a[mid] > b) {
			high = mid - 1;
			res = a[mid];
		} else {
			low = mid + 1;
		}
		}
		return res;
	}

	public static void main(String[] args) {
		int a [] = {2, 3, 5, 9, 14, 16 , 18};
         int b = 17;
         System.out.println(celling(a,b));
	}

}
