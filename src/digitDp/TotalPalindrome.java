package digitDp;

import java.util.Scanner;

public class TotalPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer dp [][][][][][][];
		try {
			int t = sc.nextInt();
			while(t -- > 0) {
				dp = new Integer[20][2][2][12][12][2][2];
				String a = sc.next();
				String b = sc.next();
				long x = helper(0,b,0,0,11,11,1,1,dp);
				dp = new Integer[20][2][2][12][12][2][2];
				long y = helper(0,a,0,0,11,11,1,1,dp);
				System.out.println(x - y);
				
				
			}
			
		}catch(Exception e) {
			return ;
		}

	}
	
	public static int helper(int ind , String s , int even , int odd , int prev , int pp , int leading , int tight,Integer dp [][][][][][][]) {
		int n = s.length();
		if(ind == n) {
			if(even == 1 && odd == 1) return 1;
			return 0;
		}
		if(dp[ind][even][odd][prev][pp][leading][tight] != null) return dp[ind][even][odd][prev][pp][leading][tight];
		int ans = 0;
		int lb = 0;
		int e = 0;
		int o =0;
		int ub = tight == 1 ? s.charAt(ind) - '0' : 9;
		for(int i = lb ; i <= ub ; i++) {
			int t = i == ub ? 1 :0;
			int l = i == 0 ? 1 : 0;
			if(prev == i || even == 1) e = 1;
			else e = 0;
			if(pp == i || odd == 1) o = 1;
			else o = 0;
			ans += helper(ind + 1, s, e , o, (leading&l) == 1 ? 11 : i, leading == 1 ? 11 : prev  , leading&l, tight&t,dp);
		}
		return dp[ind][even][odd][prev][pp][leading][tight] = ans;
		
	}

}
