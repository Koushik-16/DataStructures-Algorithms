package practice;

public class KthElementIn2SortedArrays {
	
	public static int KthElement(int a [] , int b [] , int n ,int m, int k) {
		if(m < n) {
				return KthElement(b , a , m , n , k);
		}
		int low = Math.max(0,k- m);
		int high = Math.min(k, n);
		while(low <= high ) {
			int cut1 = (low + high ) >> 1;
	        int cut2 = k - cut1;
	        int l1 = cut1 == 0? Integer.MIN_VALUE: a[cut1-1];
	        int l2 = cut2 == 0? Integer.MIN_VALUE: b[cut2 - 1];
	        int r1 = cut1 == n? Integer.MAX_VALUE: a[cut1];
	        int r2 = cut2 == m? Integer.MAX_VALUE: b[cut2];
	        if(l1 <= r2 && l2 <= r1) {
	        	return Math.max(l1, l2);
	        } else if (l1 > r2 ) {
	        	high = cut1 - 1;
	        } else {
	        	low = cut1 + 1;
	        }
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}

}
