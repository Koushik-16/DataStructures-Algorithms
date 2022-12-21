package recursion2;

public class StoneGame4 {
	
	public static boolean winnerSquareGame(int n) {
	       int dp [] = new int [n+ 1];
	        for(int i  = 0 ; i <= n ; i++){
	            for(int j = 1 ; j*j <= i ; j++){
	               if(dp[i-j*j] == 0) dp[i] = 1;
	            }
	        }
	         return dp[n] == 1 ? true : false;
	    }
	
	
	public static void main(String[] args) {
		System.out.println(winnerSquareGame(8));
	}

}
