package dynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinChangeCombination {
	
	public static int ways(int a [], int target) {
		int dp [] = new int[target+1];
		dp[0] = 1;
		for(int i = 0  ; i < a.length; i++) {
			for(int j = a[i]; j < dp.length; j++) {
				dp[j] += dp[j - a[i]];
			}
		}
		return dp[target];
	}

	public static void main(String[] args) {
		int a [] = {1,2 ,3};
		int target = 5;
	    System.out.println(ways(a,target));
	}

}
