package questions;

public class MinimumLightsToActivate {
	
	    public static  int solve(int[] A, int B) {
	        int count = 0;
	        int n = A.length;
	        int i = 0 ;
	        while(i < n){
	         int right = Math.min(i + B -1, n-1);
	         int left  = Math.max(i - B + 1,0);
	         boolean found = false;
	         while(right >= left){
	            if(A[right] == 1){
	                found = true;
	                break;
	            }
	            right --;
	         }
	         if(found == false) return -1;
	         count ++;
	         i  = right + B;

	        }
	        return count;
	    }

	public static void main(String[] args) {
		

	}

}
