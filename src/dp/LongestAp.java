package dp;

import java.util.HashMap;

public class LongestAp {
	
	public static int longestAp(int arr []) {
		int n = arr.length;
		if(n == 1) return 1;
		int res = 2;
		HashMap<Integer,Integer> [] dp = new HashMap[n];
		for(int i = 0 ; i < n ; i++) {
			dp[i] = new HashMap<>();
			for(int j = 0 ; j < i ; j++) {
				int d = arr[i] - arr[j];
				dp[i].put(d, dp[j].getOrDefault(d, 1) + 1 );
				res = Math.max(res, dp[i].get(d));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
