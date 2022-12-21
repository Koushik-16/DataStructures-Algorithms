package dynamicProgramming;

import java.util.Arrays;

class Bridge{
	 int n ;
	 int s ;
	 
	 Bridge(){};
	 Bridge(int n , int s){
		 this.n = n;
		 this.s = s;
	 }
}

public class MaxNonOverlappingBridge {
	
	public static int maxBridge(Bridge[] bdgs) {
		Arrays.sort(bdgs,(a,b) -> {if(a.n == b.n) return a.s - b.s; else return a.n - b.n;});
		int dp [] = new int[bdgs.length];
		int ans =0; 
		for(int i = 0 ; i < dp.length ; i++) {
			int max = 0;
			for(int j = 0 ; j < i ; j++) {
				if(bdgs[j].s <= bdgs[i].s && dp[j] > max) max = dp[j];
			}
			dp[i] = max + 1;
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		
	}

}
