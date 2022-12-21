package arrays;

public class BinarySearch {
	
	 static int binarySeach(int [] a, int n, int x) {
		
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = (low + high )/2;
			if(x == a[mid]) return mid;
			else if(x < a[mid]) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}
	public static void main(String [] args) {
		int [] a = {1, 2, 3, 4 , 5, 6};
		System.out.println(binarySeach(a,a.length,3));
	}

}
