package dp;

public class ChampaneTower {
	
	static double waterOverflow(int K, int R, int C) {
        double dp [][] = new double[R+ 1][C +1];
        dp[0][0] = K;
      int i = 0;
      while(i < R +1){
          int j =0;
          while(dp[i][j] > 1.0){
              double extra = dp[i][j] - 1.0;
              dp[i+1][j] = extra/2.0;
              dp[i+1][j+1] = extra/2.0;
              j++;
          }
          i++;
      }
      return dp[R-1][C-1];
    }

	public static void main(String[] args) {
		System.out.println(waterOverflow(3,2,1));

	}

}
