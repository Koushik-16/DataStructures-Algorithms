package dynamicProgramming;

import java.util.ArrayList;

public class BurstBaloons {
	
	public static  int maxPoint(int a []) {
		int dp [][] = new int [a.length][a.length];
		for(int g = 0 ; g < a.length ; g++) {
			for(int i=0 , j = g ;j < dp.length ; i++,j++) {
				int max = Integer.MIN_VALUE;
				for(int k = i ; k <= j ; k++) {
					int left = k == i ? 0 : dp[i][k-1];
					int right = k == j ? 0 : dp[k+1][j];
					int val  = (i == 0 ? 1 : a[i-1]) * a[k] * (j == a.length -1 ? 1 : a[j+1]);
					int total = left + right + val;
					max = Math.max(max, total);
				}
				dp[i][j] = max;
			}
		}
		return dp[0][a.length - 1];
	}
	
	public static int burst(int a []) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		for(int i =0 ; i <a.length ; i++) list.add(a[i]);
		list.add(1);
		Integer dp [][] = new Integer[list.size() + 1][list.size() + 1];
		return helper(list,1,a.length,dp);
	}

	private static int helper(ArrayList<Integer> list, int i, int j, Integer[][] dp) {
		if(i > j) return 0;
		if(dp[i][j] != null) return dp[i][j];
		int max = Integer.MIN_VALUE;
		for(int ind = i; ind <= j ; ind++) {
			int cost = list.get(i-1) * list.get(ind) * list.get(j + 1) + helper(list,i,ind-1,dp) + helper(list,ind + 1,j,dp);
			max = Math.max(max, cost);
		}
		return dp[i][j] = max;
	}

	public static void main(String[] args) {
		

	}

	
	
	
	
	
	
	
	
	
	
}
