package dynamicProgramming;

public class MinJumps {
	
	public static int climbStairsWithMinMoves(int a []) {
		int n = a.length;
		Integer dp [] = new Integer [n+1];
		dp[n] = 0;
		for(int i = n - 1 ; i >= 0; i--) {
			if(a[i] > 0) {
				int min =  Integer.MAX_VALUE;
				for(int j = 1 ; j <= a[i] && i + j < dp.length; j++) {
					if(dp[i + j] != null) {
					min = Math.min(dp[i+j] ,min );
					}
				}
				if(min != Integer.MAX_VALUE) {
					dp[i] = min + 1;
				}
			}
		}
		return dp[0];
	}

	public static void main(String[] args) {
		int a []  = {3, 2, 4, 2, 0 , 2, 3, 1,2,2};
		int ans = climbStairsWithMinMoves(a);
		System.out.println(ans);
	}

}
