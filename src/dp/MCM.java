package dp;

public class MCM { // Matrix Chain Multiplication
	
	public static int minSteps(int arr []) {
		Integer dp [][] = new Integer[arr.length][arr.length];
		return helper(arr,1,arr.length - 1,dp);
	}

	private static int helper(int[] arr, int i, int j,Integer dp [][]) {
	if(i == j) return 0;
	if(dp[i][j] != null) return dp[i][j];
	int min = Integer.MAX_VALUE;
	for(int k = i ; k < j ; k++) {
		int steps = arr[i-1] * arr[k] * arr[j] + helper(arr,i,k,dp) + helper(arr,k +1,j,dp);
		min = Math.min(min, steps);
	}
	return dp[i][j] =  min;
}
	
	public static int mcm(int arr []) {
		int n = arr.length;
		int dp [][] = new int [n][n];
		for(int i = 0 ; i < n ; i++) dp[i][i] = 0;
		for(int i = n-1 ; i >=1; i--) {
			for(int j = i + 1; j <n ; j++ ) {
				int min = Integer.MAX_VALUE;
				for(int k = i ; k < j ; k++) {
					int steps = (arr[i-1] * arr[k] * arr[j]) + dp[i][k] + dp[k+1][j];
					min = Math.min(min, steps);
				}
				dp[i][j] = min;
			}
		}
		return dp[1][n-1];
	}

	public static void main(String[] args) {
		int arr [] = {10, 20 , 30 , 40 , 50};
        System.out.println(minSteps(arr));
	}

}
