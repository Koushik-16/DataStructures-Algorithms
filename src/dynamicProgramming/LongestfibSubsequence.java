package dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class LongestfibSubsequence {
	
	 public int lenLongestFibSubseq(int[] arr) {
	       int n = arr.length;
	       int dp [][] = new int[n][n];
	        int ans = 0;
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i = 0 ; i < n ; i++){
	            map.put(arr[i],i);
	            Arrays.fill(dp[i],2);
	        }
	        for(int i = 0 ; i < n ; i++){
	            for(int j = i+ 1; j < n ; j++){
	                int sum = arr[i] + arr[j];
	                if(!map.containsKey(sum)) continue;
	                int k = map.get(sum);
	                dp[j][k] = dp[i][j] + 1;
	                ans = Math.max(ans,dp[j][k]);
	            }
	        }
	        return ans > 2 ? ans : 0;
	    }
	public static void main(String[] args) {
		

	}

}
