package dp;

import java.util.HashMap;

public class ClosestSubsequenceSum {
	
	 public int minAbsDifference(int[] nums, int goal) {
	        HashMap<Integer,Integer> dp [] = new HashMap[nums.length + 1];
	        return helper(nums,0,0,goal,dp);
	    }
	 public int helper(int nums [], int ind , int sum , int goal,HashMap<Integer,Integer> dp [] ){
	        if(ind >= nums.length) return Integer.MAX_VALUE;
	     if(dp[ind].containsKey(sum)) return dp[ind].get(sum) ;
	        //pick
	        int s = sum + nums[ind];
	        int abs1 = Math.abs(goal - s);
	        int p = Math.min(abs1,helper(nums,ind + 1,s,goal,dp));
	        //not pick
	        int abs2 = Math.abs(goal - sum);
	        int np = Math.min(abs2,helper(nums,ind + 1,sum,goal,dp));
	        int ans = Math.min(p,np);
	        dp[ind].put(sum,ans);
	       return ans;
	    }

	public static void main(String[] args) {

		

	}

}
