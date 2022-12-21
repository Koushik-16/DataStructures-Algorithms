package practice;

public class MaxDistance {
	
	 public static int maximumGap(final int[] A) {
	        int n = A.length;
			int [] left = new int [n];
			int [] right = new int [n];
			left[0] = A[0];
			right[n-1] = A[n-1];
			for(int i = 1; i<n; i++) {
				left [i] = Math.min(left[i-1],A[i] );
			}
			for(int i = n-2; i>=0; i--) {
				right[i] = Math.max(right[i+1], A[i]);
			}
			int ans = 0;
			int x = 0 ;
			int y = 0;
			while(x < n && y < n) {
				if(right[y] >= left[x]) {
					ans = Math.max(ans, y-x);
					y++;
				} else x++;
			}
			return ans;
	    }

	public static void main(String[] args) {
		

	}

}
