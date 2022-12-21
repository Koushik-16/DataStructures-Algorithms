package dynamicProgramming;

public class LongestBitonicSubsequence {
	
	 public int longestSubsequenceLength(final int[] A) {
	        int lis [] = new int[A.length];
	        for(int i = 0 ; i < A.length ; i++){
	            int max = 0;
	            for(int j = 0 ; j < i ; j++){
	                if(A[i] > A[j] && lis[j] > max) max = lis[j];
	            }
	            lis[i] = max + 1;
	        }
	        int lds [] = new int[A.length];
	        for(int i = A.length - 1 ; i>= 0; i--){
	            int max = 0;
	            for(int j = A.length - 1 ; j > i ; j--){
	                
	                if(A[i] > A[j] && lds[j] > max ) max = lds[j];
	            }
	            lds[i] = max + 1;
	        }

	        int ans  = 0;
	        for(int i = 0 ; i < A.length ; i++){
	         ans = Math.max(lis[i] + lds[i] - 1, ans);
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		

	}

}
