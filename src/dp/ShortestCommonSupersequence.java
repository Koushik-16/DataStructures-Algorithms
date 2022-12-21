package dp;

public class ShortestCommonSupersequence {
	
	public static int lcs(String s1, String s2) { // Longest common subsequence
		int n = s1.length();
		int m = s2.length();
		 int dp [][] = new int[n + 1][m + 1];
		 int max = 0;
		 for(int i = 1; i < dp.length ; i++) {
			 for(int j =1 ; j < dp[0].length; j ++) {
			     if(s1.charAt(i-1) == s2.charAt(j -1)) dp[i][j] = dp[i-1][j-1] + 1;
				 else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				 max = Math.max(max, dp[i][j]);
			 }
		 }
		 int i = n ;
		 int j = m ;
		 StringBuilder sb = new StringBuilder();
			while(i > 0 && j > 0) {
				if(s1.charAt(i -1) == s2.charAt(j -1)) {
					sb.append(s1.charAt(i -1));
					i--;
					j--;
				}else  if(dp[i-1][j] > dp[i][j-1]){
					sb.append(s1.charAt(i-1));
					i--;
				}else {
					sb.append(s2.charAt(j-1));
					j--;
				}
			}
			while(i > 0) {
				sb.append(s1.charAt(i-1));
				i--;
			}
			while(j > 0) {
				sb.append(s2.charAt(j-1));
				j--;
			}
			String s = sb.reverse().toString();
			System.out.println(s);
		 int scslength = n + m - max;
		 return scslength;
	}
	
	public static int scs(String s1 , String s2) {
		return lcs(s1,s2);
	}
	
	

	public static void main(String[] args) {
		scs("brute","groot");

	}

}
