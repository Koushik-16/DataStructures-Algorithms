package dp;

public class MaxSumNonAdjacentElements {
	
	public static int maxSum(int arr []) {
		int dp []= new int [arr.length];
		dp[0] = arr[0];
		for(int i = 1; i < arr.length ; i++) {
			int take = arr[i] ;
			if(i > 1)take += dp[i-2];
			int nottake = dp[i-1];
			dp[i] = Math.max(take, nottake);
		}
		return dp[dp.length -1];
	}
	
	public static int max(int arr []) {
		int prev = arr[0];
		int prev2 = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			int take = arr[i] + prev2;
			int nottake = prev;
			int curr = Math.max(take, nottake);
			prev2 = prev;
			prev = curr;
		}
		return prev;
	}

	public static void main(String[] args) {
		

	}

}
