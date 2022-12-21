package dp;

public class RepeatingSubsequence {
	
	 public static int anytwo(String A) {
	        int dp [][]  =  new int[A.length() + 1][A.length() + 1];
	        for(int i = 0 ; i < dp.length ; i++){
	            for(int  j = 0; j < dp[0].length; j++){
	                if(i == 0 || j == 0) dp[i][j] = 0;
	                else if(A.charAt(i - 1) == A.charAt(j-1) && i != j) dp[i][j] = 1+ dp[i-1][j-1];
	                else  {
	                    dp[i][j] = Math.max(dp[i-1][j] ,dp[i][j-1]);
	                }
	            }
	        }
	        int length = dp[dp.length - 1][dp[0].length -1];
	        return length >= 2 ? 1 : 0;
	    }
	

	public static void main(String[] args) {
		

	}

}
