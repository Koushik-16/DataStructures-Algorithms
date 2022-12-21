package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	
	 public static  List<Integer> largestDivisibleSubset(int[] nums) {
	        Arrays.sort(nums);
	        List<Integer>  ans = new ArrayList<>();
	        int dp [] = new int[nums.length];
	        Arrays.fill(dp,1);
	        int max = 1;
	        for(int i = 1 ; i < dp.length ; i++){
	            for(int j = 0 ; j < i ; j++){
	                if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]){
	                    dp[i] = dp[j] + 1;
	                   max = Math.max(max,dp[i]);
	                }
	            }
	            
	        }
	        int prev = -1;
	        for(int i = dp.length - 1; i >= 0 ; i--){
	            if(dp[i] == max && (prev % nums[i] == 0 || prev == -1)){
	                ans.add(nums[i]);
	                max = max - 1;
	                prev = nums[i];
	            }
	        }
	        return ans;
	    }

	public static void main(String[] args) {
	

	}

}
