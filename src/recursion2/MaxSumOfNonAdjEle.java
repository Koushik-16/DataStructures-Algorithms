package recursion2;

import java.util.ArrayList;

public class MaxSumOfNonAdjEle {
	
	public static int sum(int a []) {
		int dp [] = new int[a.length + 2];
		for(int i = dp.length - 3; i >= 0; i--) {
			int fs = a[i] + dp[i+2];
			int ss = dp[i+1];
			dp[i] = Math.max(fs, ss);
		}
		return dp[0];
	}
	
	
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
			int iplush1 = 0;
	        int iplush2 = 0;
			for(int i = nums.size() - 1; i >= 0; i--) {
				int fs = nums.get(i) + iplush2;
				int ss = iplush1;
				int curi = Math.max(fs, ss);
	            iplush2 = iplush1;
	            iplush1 = curi;
			}
			return iplush1;
		}

	public static void main(String[] args) {
		int a [] = {1, 9, 4, 8, 100, 2};
       System.out.println(sum(a));
	}

}
