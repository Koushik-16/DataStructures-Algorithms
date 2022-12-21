package dynamicProgramming;

public class LongestCommonSubstring {
	
	public static int lengthOfLCS(String s1 , String s2) {
		int max = 0;
		int dp[][] = new int[s1.length() + 1][s2.length() + 1];
		for(int i= 1; i < dp.length  ;i++) {
			for(int j = 1; j < dp[0].length; j++) {
				if(s1.charAt(i- 1)== s2.charAt(j -1)) dp[i][j] = 1 + dp[i-1][j-1];
				else dp[i][j] = 0;
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String a = "ABCDGH";
		String b = "ACDGHR";
		 System.out.println(lengthOfLCS(a,b));

	}

}
