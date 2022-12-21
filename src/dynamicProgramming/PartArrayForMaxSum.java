package dynamicProgramming;

public class PartArrayForMaxSum {
	
	public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp [] = new int[arr.length + 1];
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            int max = 0;
            for(int j = i ; j < Math.min(arr.length,i + k); j++){
                max = Math.max(max,arr[j]);
                dp[i] = Math.max(dp[i],dp[j+ 1] + max * (j-i + 1));
            }
        }
        return dp[0];
    }
	
	
	public int maxSumPart(int nums [] , int k) {
		int n = nums.length;
		return helper(0,nums,k);
	}

	public  int helper(int i, int[] nums, int k) {
		if(i == nums.length) return 0;
		int max = Integer.MIN_VALUE;
		int sum = Integer.MIN_VALUE;
		int len = 0;
		for(int j = i; j < Math.min(nums.length, i + k); j++) {
			max = Math.max(max, nums[j]);
			len++;
			sum = Math.max(sum, max*len + helper(j+1,nums,k));
		}
		return sum;
	}


	public static void main(String[] args) {
		

	}

}
