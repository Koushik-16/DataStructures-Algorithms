package dp;

public class PaintFence {
	
	public static int ways(int n , int k) {
		Integer dp [][][] = new Integer[n][k+1][3];
		return helper(0,n,k,0,0,dp);
	}

	public static  int helper(int fence, int n, int k, int repeat,int prev,Integer [][][]dp) {
		if(fence >= n) return 1;
		int ways = 0;
		if(dp[fence][prev][repeat]!= null) return dp[fence][prev][repeat];
		for(int i = 1; i<=k ; i++) {
			if(i == prev && repeat == 2) {
				continue;
			}
			else if(i == prev && repeat == 1) {
				ways += helper(fence+1,n,k,2,i,dp);
			}else {
				ways += helper(fence+1,n,k,1,i,dp);
			}
		}
		return dp[fence][prev][repeat] =  ways;
	}
	
	public static int numWays(int n , int k) {
		int same = k;
		int diff = k*(k-1);
		int total = same + diff;
		for(int i = 3 ; i <= n ; i++) {
			same = diff;
			diff = total * (k-1);
			total = same + diff;
		}
		return total;
		
	}

	public static void main(String[] args) {
		System.out.println(numWays(5,3));

	}

}
