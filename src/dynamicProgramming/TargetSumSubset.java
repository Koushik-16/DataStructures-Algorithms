package dynamicProgramming;

public class TargetSumSubset {
	
	public static boolean isPossible(int a [], int target) {
		boolean dp [][] = new boolean[a.length + 1][target+1];
		for(int i = 0 ; i < dp.length ; i++) {
			for(int j = 0 ;  j < dp[0].length ; j++) {
				if(i == 0 && j ==0) { 
					dp[i][j] = true;
				} else if(i == 0) {
					dp[i][j] = false;
				} else if( j ==0) {
					dp[i][j] = true;
				} else {
					if(dp[i-1][j] == true) {
						dp[i][j] = true;
					} else {
						int val = a[i-1];
						if(j >= val) {
							if(dp[i- 1][j - val] == true) {
								dp[i][j] = true;
							}
						}
					}
					
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

	public static void main(String[] args) {
		int a [] = {5, 4, 2, 3, 1, 7};
		System.out.println(isPossible(a,10));

	}

}
