package dynamicProgramming;

public class LargestSquareSubmatrix {
	public static int largestSquare(int [][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int max = 0;
		
		int [][] dp  = new int [n][m];
		for(int i = n - 1 ; i >= 0 ; i --) {
			for(int j = m - 1 ; j >= 0 ;  j --) {
				if(matrix[i][j] == 0) {
					dp[i][j] = 0;
				}else {
					if(i == n - 1 && j == m - 1) {
						dp[i][j] =  1;
					}
					else if(i == n -1 ) {
						dp[i][j] =  1;
					}else if (j == m - 1) {
						dp[i][j] =  1;
					}else {
						dp[i][j] = 1+Math.min(dp[i+1][j], Math.min(dp[i+1][j+1],dp[i][j+1]));
					}
					
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		

	}

}
