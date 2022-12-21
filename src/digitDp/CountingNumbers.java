package digitDp;

import java.util.Scanner;

public class CountingNumbers {
	
	static Long dp [][][][];

	
	public static long countNumbers(String num , int n ,int prev, int leading , int tight) {
		if(n == 0) return 1;
		if(prev != -1 && dp[n][prev][leading][tight] != null) return  dp[n][prev][leading][tight];
		int lb = 0;
		int ub = tight == 1 ? num.charAt(num.length() - n) - '0' : 9;
		long ans = 0;

		for(int dig = lb ; dig <= ub ; dig++) {
			if(leading == 0 && dig == prev) continue;
			int f = dig == ub ? 1 : 0;
			int z = dig == 0 ? 1  : 0;
			ans += countNumbers(num, n-1,dig,leading&z,tight&f);
		}
		return dp[n][prev][leading][tight] =  ans;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		a--;
		String A = Long.toString(a);
		String B = Long.toString(b);
		dp = new Long[20][10][2][2];
		long x = countNumbers(B,B.length(),0,1,1);
		dp = new Long[20][10][2][2];
		long y = countNumbers(A,A.length(),0,1,1);
		System.out.println(x - y);
		
		

	}

}
