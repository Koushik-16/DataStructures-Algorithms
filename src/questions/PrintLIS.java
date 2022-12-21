package questions;

import java.util.ArrayList;

public class PrintLIS {
	
	public int lengthOfLIS(int nums []) {
		int dp [] = new int[nums.length];
		int hash [] = new int[nums.length];
		int lastInd = 0;
		int max = 1;
		for(int i = 0 ; i < nums.length ; i++) {
			hash[i] = i;
			for(int j = 0; j < i ; j++) {
				if(nums[j] < nums[i] && dp[i] < dp[j] +1) {
					dp[i] = 1 + dp[j];
					hash[i] = j;
				}
			}
			if(dp[i] > max) {
				max = dp[i];
				lastInd = i;
			}
		}
		ArrayList<Integer> lis = new ArrayList<>();
		lis.add(nums[lastInd]);
		while(hash[lastInd] != lastInd) {
			lastInd = hash[lastInd];
			lis.add(nums[lastInd]);
		}
		
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
