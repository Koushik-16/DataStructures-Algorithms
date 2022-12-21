package dp;

public class JumpGame7 {
	
	public boolean canReach(String s , int min , int max) {
		int n = s.length();
	    boolean dp [] = new boolean[n];
	    char ch [] = s.toCharArray();
	    dp[0] = ch[0] =='0';
	    int reachable = 0;
	    for(int i = 1; i < n ; i++) {
	    	if(i >= min) reachable += dp[i - min] ? 1 : 0;
	    	if(i > max) reachable += dp[i - max + 1] ? 1 : 0;
	    	dp[i] = reachable > 0 && ch[i] == 0;
	    }
	    return dp[n-1];
	}

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		ans.append(sb.reverse());
	}

}
