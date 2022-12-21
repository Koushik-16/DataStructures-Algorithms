package dpBitmask;

import java.util.Scanner;

public class TShirt {
	boolean valid [][] = new boolean[101][101];
	
	public long ways(int arr [][], int n) {
		Long dp [][] = new Long[101][1025];
		return numWays(dp,1,0,n);
	}

	private long numWays(Long[][] dp, int shirt, int mask, int n) {
		if(mask == (1<<n)-1) return 1;
		if(shirt > 100) return 0;
		if(dp[shirt][mask] != null) return dp[shirt][mask];
		long ans = 0;
		for(int i = 1; i <= n ; i++) {
			if( (mask&(1<<i-1)) != 0) continue;
			if(valid[i][shirt]) {
				int temp = (mask|(1<<(i-1)));
				ans += numWays(dp,shirt+1,temp,n) ;
			}
		}
		ans += numWays(dp,shirt + 1,mask,n);
		return dp[shirt][mask] = ans;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0) {
				
			}
			
		}catch(Exception e) {
			return ;
		}
	}

}
