package dp;

public class MaxSumOf2NonOverlapingSubarray {
	
	public static int maxSum(int nums [], int len1 , int len2) {
		int n = nums.length;
		int dp1 [] = new int[n];
		int dp2  [] = new int[n];
		int i = 0;
		int sum1 = 0;
		for(i = 0 ; i < n ; i++) {
			if(i < len1) {
				sum1 += nums[i];
				dp1[i] = sum1;
			}else {
				sum1 += nums[i] - nums[i-len1];
				dp1[i] = Math.max(dp1[i-1], sum1);
			}
		}
		int sum2 = 0;
		for( i = n-1; i >= 0 ;i --) {
			if(i + len2 >= n) {
				sum2 += nums[i];
				dp2[i] = sum2;
			}else {
				sum2 += nums[i] - nums[i + len2];
				dp2[i] = Math.max(dp2[i+1],sum2);
			}
		}
		int ans = 0;
		for(i = len1 - 1; i < n- len2 ; i++) {
			ans = Math.max(ans, dp1[i] + dp2[i+1]);
		}
		
		return ans;
	}
	
	public static int solution(int nums [], int len1 , int len2) {
		return Math.max(maxSum(nums,len1,len2), maxSum(nums,len2,len1));
	}

	public static void main(String[] args) {
		

	}

}
