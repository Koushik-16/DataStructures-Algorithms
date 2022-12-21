package whileLoops;

import java.util.Scanner;

public class Test {
	 public static int search(final int[] A, int B) {
	        int l = 0 ;
	        int h = A.length -1;
	        int mid = l + (h - l) / 2;
	        if(A[0] < A[mid]) h = mid-1;
	        else l = mid +1;
	        while(l <= h ) {
	            int m = l + (h-l) / 2;
	            if(B == A[m]) return m;
	            else if (B < A[m]) h = m -1;
	            else l = m + 1;
	        }
	        return -1;
	        
	    }

	public static void main(String[] args) {
		int [] a = {7, 8, 0, 1, 2, 3, 4 , 5, 6};
		int b = 5;
		System.out.println(search(a,1));

	}

}
