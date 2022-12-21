package dp;

public class EggDropping {
	
public int superEggDrop(int k, int n) {
        
        int dp [][] = new int [k+ 1][n + 1];
        
        for(int i = 1; i <= k ; i++){
            for(int j = 1; j <= n ; j++){
                if(i == 1) dp[i][j] = j;
                else if(j == 1) dp[i][j] = 1;
                else{
                    int ans = Integer.MAX_VALUE;
                    for(int a = 0 ; a < j; a++){
                        int bre = dp[i-1][a];
                        int sur = dp[i][j-a -1];
                        int curr = Math.max(bre,sur);
                        ans = Math.min(ans,curr);
                    }
                    dp[i][j] = ans + 1;
                }
            }
        }
        return dp[k][n];
    }
	
	
	public static void main(String[] args) {
		

	}

}
