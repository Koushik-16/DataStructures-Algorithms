package digitDp;

public class Boaringnumber {
	
     static Long dp [][][][] ;
	
	public static  long solve(String num , int n, int even ,int leading,int tight) {
		if(n == 0) return 1;
		if(dp[n][even][leading][tight] != null) return dp[n][even][leading][tight];
		if(even == 1) {
			long ans = 0;
			int ub = tight == 1 ? num.charAt(num.length() - n) - '0' : 9;
			int arr [] = {0,2,4,6,8};
			for(int dig : arr) {
				int f = dig == ub ? 1 : 0;
				if(dig <= ub) {
					ans += solve(num,n-1,0,0,tight&f);
				}
			}
			return  dp[n][even][leading][tight] = ans;
		}else {
			long ans = 0;
			int arr [] = {1,3,5,7,9};
			int ub = tight == 1 ? num.charAt(num.length() - n) - '0' : 9;
			if(leading == 1) {
				ans += solve(num,n-1,0,1,0);
			}
			for(int dig : arr) {
				int f = dig == ub ? 1 : 0;
				if(dig <= ub) {
					ans += solve(num,n-1,1,0,tight&f);
				}
			}
			return dp[n][even][leading][tight] = ans;
		}
	}

	public static void main(String[] args) {
		long l = 779;
		long r = 783;
		l--;
		String R = Long.toString(r);
		String L = Long.toString(l);
		dp =   new Long [20][2][2][2];
		long a = solve(R,R.length(),0,1,1);
		dp =  new Long [20][2][2][2];
		long b =   solve(L,L.length(),0,1,1);
		System.out.println(a -b);

	}

}
