package recursion;

public class PrintStairPaths {
	
	public static void PrintStairPaths(int n , String path) {
		if(n < 0) {
			return ;
		}
		if(n == 0) {
			System.out.println(path);
			return ;
		}
		PrintStairPaths(n-1, path + "1");
		PrintStairPaths(n-2, path + "2");
		PrintStairPaths(n-3, path + "3");
	}
	
	public static int countPaths(int n) {
		if(n == 0) return 1;
		if(n < 0) return 0;
		return countPaths(n - 1) + countPaths(n - 2) + countPaths(n - 3);
	}
	
	public static int countPathsTab(int n) {
		int dp [] = new int [n+1];
		dp[0] = 1;
		for(int i = 1 ;i <= n ;i ++) {
			if(i == 1) {
				dp[i] = dp[i- 1];
			} else if (i ==2) {
				dp[i] = dp[i- 1] + dp[i - 2];
			} else {
				dp[i] = dp[i- 1] + dp[i - 2] + dp[i - 3];
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(countPathsTab(6));

	}	

}
