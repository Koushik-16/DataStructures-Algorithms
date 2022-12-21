package dynamicProgramming;

public class EditDistances {
	
	public static int distances(String s1 , String s2) {
		return helper(s1,s2,0,0);
	}
	
	public static int helper(String s1 ,String s2, int i , int j) {
		if(i == s1.length() && j == s2.length()) return 0;
		if(i == s1.length()) return s2.length()- j;
		if(j == s2.length()) return s1.length() - i;
		if(s1.charAt(i)== s2.charAt(j)) {
			helper(s1,s2,i+1,j+1);
		}
		int insert = 1 + helper(s1,s2,i,j + 1);
		int remove =1 + helper(s1,s2,i + 1,j);
		int replace = 1+ helper(s1,s2,i+1,j+1);
		return Math.min(Math.min(remove, insert), replace);
	}
	
	public static int editDistamce(String s1 , String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		int dp[][] = new int[len1 + 1][len2 + 1];
		for(int i = 0 ; i < dp.length ; i++) {
			for(int j = 0 ; j < dp[0].length ; j++) {
				if(i == 0 && j == 0) dp[i][j] = 0;
				else if(i == 0 && j != 0) dp[i][j] = j;
				else if(j == 0 && i != 0) dp[i][j] = i;
				else if(s1.charAt(i -1) == s2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
				else {
					int insert = dp[i][j-1];
					int delete = dp[i-1][j];
					int replace = dp[i-1][j-1];
					dp[i][j] = 1 + Math.min(Math.min(delete, insert), replace);
				}
			}
		}
		return dp[len1][len2];
		
	}

	public static void main(String[] args) {
		System.out.println(distances("horse","ros"));
         
	}

}
