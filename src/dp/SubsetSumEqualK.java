package dp;

public class SubsetSumEqualK {
	
	public static boolean subsetSumToK(int n, int k, int arr[]){
        boolean dp[][] = new boolean [n][k+1];
        for(int i = 0 ; i < n ; i++) dp[i][0] = true;
       if(arr[0] <= k) dp[0][arr[0]] = true;
        for(int i = 1; i < n ; i++){
            for(int j = 1; j <= k ; j++){
                boolean np = dp[i -1][j];
                boolean p = false;
                if(arr[i] <= j ) p = dp[i -1][j-arr[i]];
                dp[i][j] =  p|np;
            }
        }
            return dp[n-1][k];
	}

	public static void main(String[] args) {
		

	}

}
