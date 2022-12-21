package digitDp;

public class SumOfSumOfDigits {
	
	static Long dp [][] ;
	
	public static  long solve(String num , int n , int tight) {
		if(n == 0) return 0;
		int ub = tight == 1 ? num.charAt(num.length() - n) - '0' : 9;
		long ans = 0;
		for(int i = 0; i <= ub ; i++) {
			int f = i == ub ? 1 : 0;
			ans += (i * count(num,n-1,tight&f)) + solve(num,n-1,tight&f);
		}
		return ans;
	}

	private static  long count(String num, int n, int tight) {
		if(tight == 0) return (long)Math.pow(10, n);
		if(n == 0) return 1;
		long ans = 0;
		int ub = num.charAt(num.length() - n) - '0' ;
		for(int i = 0 ;  i <= ub ; i++ ) {
			int f = i == ub ? 1 : 0;
			ans += count(num,n-1,tight&f);
		}
		return ans;
	}

	public static void main(String[] args) {
		long l = 28;
		long r = 31;
		if(l != 0) l--;
		String L = Long.toString(l);
		String R = Long.toString(r);
		dp = new Long[20][2];
		long a = solve(R,R.length(),1);
		dp = new Long[20][2];
		long b = solve(L,L.length(),1);
		System.out.println(a - b);
		

	}

}
