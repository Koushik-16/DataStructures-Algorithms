package dpBitmask;

import java.util.ArrayList;

public class CountingTiling {
	static long mod = 1000000007;
	
	public static long count(int n,int m) {
		Long dp [][] = new Long[1001][1<<11];
		return solve(0,0,dp,n,m);
	}

	private static long solve(int col, int mask, Long[][] dp, int n, int m) {
		if(col == m) {
			if(mask == 0) return 1;
			return 0;
		}
		
		if(dp[col][mask] != null) return dp[col][mask];
		ArrayList<Integer> masks = new ArrayList<>();
		long ans = 0;
		generateMasks(mask,0,0,n,masks);
		for(int msk : masks) {
			ans += (solve(col + 1,msk,dp,n,m)) % mod;
		}
		return dp[col][mask] = ans;
	}

	private static void generateMasks(int mask, int i, int nextMask, int n, ArrayList<Integer> masks) {
		if(i == n) {
			masks.add(nextMask);
			return;
		}
		
		if((mask&(i<<i)) != 0) generateMasks(mask,i+1,nextMask,n,masks);
		if(i != n-1) {
			if((mask&(1<<i)) == 0 && (mask&(i<<(i+1))) == 0) generateMasks(mask,i+2,nextMask,n,masks);
		}
		if((mask&(1<<i)) == 0) generateMasks(mask,i+1,nextMask + (1<<i),n,masks);
		
	}

	public static void main(String[] args) {
		

	}

}
