package searching.sorting;

public class Ap {
	
	public static int missing(int [] a,int low, int high,int diff) {
			int mid = (low + high )/2;
			if (a[mid + 1] - a[mid] != diff)
		        return (a[mid] + diff);
			if (mid > 0 && a[mid] - 
	                   a[mid - 1] != diff)
	        return (a[mid - 1] + diff);
			if (a[mid] == a[0] + mid * diff)
		        return missing(a, mid + 1, 
		                               high, diff);
			
			return missing(a, low, mid - 1, diff);
	}

	static int missinginap(int [] a, int n) {
		int diff = (a[n - 1] - a[0]) / n;
		return missing(a, 0, n - 1, diff);
	}
	
	public static void main(String[] args) {
		int [] a = {2,4,8,10,12,14,16,18,20};
		int n = a.length;
		System.out.println(missinginap(a,n));
	}

}
