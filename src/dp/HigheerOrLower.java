package dp;

import java.util.Arrays;

public class HigheerOrLower {
	
	public int getMoneyAmount(int min, int max, int [][] dp){
	    if(min >=max)return 0;
	    if(dp[min][max]!=-1)return dp[min][max];
	    int res = Integer.MAX_VALUE;
	    for(int i = min; i <=max;i++){
	        int higher = i+getMoneyAmount(i+1, max,dp);
	        int lower = i+getMoneyAmount(min,i-1,dp);
	        res = Math.min(res,Math.max(higher,lower));
	    }
	    dp[min][max]= res;
	    return res;
	}
	
	public int getMoneyAmount(int n) {
		int [][] dp = new int[n+1][n+1];
		for(int [] row: dp){
		Arrays.fill(row,-1);
		}
		return getMoneyAmount(1,n,dp);
	}
		

	public static void main(String[] args) {
		

	}

}
