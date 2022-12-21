package dynamicProgramming;

import java.util.HashMap;

public class DeleteAndEarn {
	
	 public static int deleteAndEarn(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int max = 0;
	        for(int val : nums){
	            map.put(val,map.getOrDefault(val,0) + 1);
	            max = Math.max(max,val);
	        }
	        int dp [] = new int[max + 1];
	        dp[1] = 1 * map.getOrDefault(1,0);
	        for(int i = 2 ; i < dp.length ; i++){
	            dp[i] = Math.max(dp[i-1],dp[i-2] + i * map.getOrDefault(i,0));
	        }
	        return dp[max];
	    }

	public static void main(String[] args) {
		

	}

}
