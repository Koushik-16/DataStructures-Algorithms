package dp;

public class BooleanExpressionTrue {
	static long mod = 100000007;
	public static int ways(String exp) {
		int n = exp.length();
	    Long dp [][][] = new Long[n][n][2];
	    return (int)(helper(exp,0,n- 1,1,dp) % mod);
	}

	public static long helper(String s, int i, int j, int isTrue, Long[][][] dp) {
		if(i > j) return 0;
		if(i == j) {
			if(isTrue == 1) return s.charAt(i) == 'T' ? 1 : 0;
			else return s.charAt(i) == 'F' ? 1 : 0;
		}
		long ways = 0;
		for(int  k = i + 1; k < j ; k+= 2) {
			long lt = helper(s,i,k-1,1,dp);
			long lf = helper(s,i,k-1,0,dp);
			long rt = helper(s,k+ 1,j,1,dp);
			long rf = helper(s,k+ 1,j,0,dp);
			char ch = s.charAt(k);
			
			if(ch == '|') {
			   if(isTrue == 1)	ways  = (lt * rt) + (lt * rf) + (lf * rt);
			   else ways = (lf* rf);
			}else if(ch == '&') {
				if(isTrue == 1) ways =  lt * rt;
				else ways = (lt*rf) + (lf*rt) + (lf*rf);
			}else if(ch == '^') {
				if(isTrue == 1) ways = (lt * rf) + (lf * rt);
				else ways = (lt * rt) + (lf*rf);
			}
		}
		return ways;
	}

	public static void main(String[] args) {
		

	}

}
