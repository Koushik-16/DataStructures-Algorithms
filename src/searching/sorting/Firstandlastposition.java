package searching.sorting;

public class Firstandlastposition {
	
	public static int firstposition(int [] a, int x) {
		int index = -1;
		int start = 0;
		int end = a.length -1;
		while(start <= end) {
		int mid  =( start + end ) / 2;
		if(a[mid] >= x) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		if(a[mid] == x ) {
			index = mid ;
		}
		}
		return index;
	}

	public static int lastposition(int [] a, int x) {
		int index = -1;
		int start = 0;
		int end = a.length -1;
		while(start <= end) {
		int mid  =( start + end ) / 2;
		if(a[mid] <= x) {
			start = mid+1;
		} else {
			end = mid - 1;
		}
		if(a[mid] == x ) {
			index = mid ;
		}
		}
		return index;
	}
	public static void main(String[] args) {
		
		int [] a = {1, 2, 2, 2, 4};
		int x = 2;
		System.out.println(firstposition(a, x));
		System.out.println(lastposition(a, x));

	}

}
