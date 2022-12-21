package dynamicProgramming;

public class StoneGame {
	
	 public boolean stoneGame(int[] piles) {
	     int sum = 0;
	        for(int val : piles) sum +=  val;
	        int n = piles.length;
	        Integer dp [][] = new Integer[n][n];
	        for(int gap = 0; gap < n ; gap++){
	            for(int i = 0 , j = gap; j < n; i++, j++){
	                if(gap == 0) dp[i][j] = piles[i];
	                else if(gap == 1) dp[i][j] = Math.max(piles[i],piles[j]);
	                else {
	                    int p1 = piles[i] + Math.min(dp[i +2][j],dp[i+1][j-1]);
	                    int p2 = piles[j] + Math.min(dp[i+ 1][j - 1],dp[i][j - 2]);
	                    dp[i][j] = Math.max(p1,p2);
	                }
	            }
	        }
	      int r = sum - dp[0][n-1];
	        return dp[0][n-1] > r;
	    }

	public static void main(String[] args) {
		

	}

}
