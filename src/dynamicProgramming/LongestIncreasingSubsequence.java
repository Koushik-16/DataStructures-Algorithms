package dynamicProgramming;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
	
	public static int lengthOfLIS(int a []) {
		int dp [] = new int[a.length];
		int ans  = 0;
		for(int i = 0; i < a.length ; i++) {
			int max = 0;
			for(int j  = 0 ; j < i ; j++) {
				if(dp[j] > max && a[j] < a[i]) max = dp[j];
			}
			dp[i] = max + 1;
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}
	
	 public int lengthOfLIS2(int[] nums) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(nums[0]);
	        for(int i = 1; i < nums.length ;i++){
	            int lastItem = list.get(list.size() - 1);
	            if(lastItem  < nums[i]){
	              list.add(nums[i]);
	            }else {
	                int index = nextGraterItem(list,nums[i]);
	                list.set(index,nums[i]);
	            }
	        }
	        return list.size();
	    }
	    
	    public int nextGraterItem(ArrayList<Integer> list, int ele){
	        int low = 0;
	        int high = list.size() - 1;
	        while(low  < high){
	            int mid = (low + high)/ 2;
	            if(list.get(mid) < ele) low = mid + 1;
	            else high = mid;
	            
	}
	        return low;
	}
	    
	    
	   

	public static void main(String[] args) {
		int a [] = {10 , 22, 9 , 33, 21, 50 , 41, 60, 80 , 3};
          System.out.println(lengthOfLIS(a));
	}

}
