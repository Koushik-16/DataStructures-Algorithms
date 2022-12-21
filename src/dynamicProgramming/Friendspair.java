package dynamicProgramming;

public class Friendspair {
	// recursive
	public static int pair(int n) {
		if(n <= 0) return 0;
		if(n == 1) return 1;
		if(n == 2 ) return 2;
		return pair(n-1) + (n-1) * pair(n-2);
	}
	
	// memorization
	public static int pairUp(int n, Integer dp []) {
		if(n <= 0) return 0;
		if(n == 1) return 1;
		if(n == 2 ) return 2;
		if(dp[n] != null) return dp[n];
		return dp[n] = pairUp(n-1,dp) + (n-1) * pairUp(n-2,dp);
	}
	//tabulation
	public static int Pair(int n) {
		int dp [] = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i = 3 ; i<= n ;i++) {
		 dp[i] = dp[i -1] + (i-1) * dp[i-2];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		int n = 4;
		Integer dp [] = new Integer[n+2];
		System.out.println(Pair(n));
		
	}

}
