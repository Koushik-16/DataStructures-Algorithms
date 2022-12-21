package digitDp;

import java.util.Scanner;

public class Beginer {
	static Integer dp [][][] = new Integer[100][101][2];
	
	public static  int solve(String num, int n , int x , int tight) {
		if(x < 0) return 0;
		int ub = tight == 1 ? num.charAt(num.length() - n) - '0' : 9;
		if(n == 1) {
			if(x >= 0 && x <= ub) return 1;
			return 0;
		}
		if(dp[n][x][tight] != null) return dp[n][x][tight];
		int ans = 0;
		for(int dig = 0; dig <= ub ; dig ++) {
			int f = dig == ub ? 1 : 0;
			ans += solve(num, n-1 , x -dig,tight&f);
		}
		return dp[n][x][tight] =  ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int x = sc.nextInt();
		int ans = solve(s,n,x,1);
		System.out.println(ans);

	}

}
