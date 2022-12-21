package dynamicProgramming;

public class MaximumSumSquareSubMatrix {
	// B length
	public static int solve(int[][] A, int B) {

        int row = A.length;
        int col = A[0].length;
        int [][] dp = new int[row + 1][col+ 1];
        int maxsum = Integer.MIN_VALUE;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1;j < dp[0].length ;j++){
                dp[i][j] = A[i-1][j-1] + dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1];
            }
        }

        for(int i = 1; i< dp.length ; i++){
            for(int j = 1;j < dp[0].length; j++){
                int sum = Integer.MIN_VALUE;
                if(i-B>= 0 && j-B >= 0){
                    sum = dp[i][j] - dp[i-B][j] - dp[i][j-B] + dp[i-B][j-B];
                    maxsum = Math.max(maxsum,sum);
                }
            }
        }
 

       return maxsum;
        
    }

	public static void main(String[] args) {
		

	}

}
