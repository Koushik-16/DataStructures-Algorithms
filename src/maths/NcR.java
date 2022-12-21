package maths;

public class NcR {
	
	static int nCr(int n, int r) {
	       long mod = 1000000007;
	       long pro = 1;
	       int k = n;
	       for(int i = 0 ; i < r ; i++){
	           pro = ((pro % mod) * (k % mod)) % mod ;
	           System.out.println(k);
	          k--;
	       }
	       System.out.println(pro);
	       long fr = (long)fact(r,(int)mod);
	       long ans = (pro / fr);
	       return (int)ans;
	       
	    }
	    public static int fact(int r , int mod){
	        int dp [] = new int[r + 1];
	        dp[0] = 1;
	        dp[1] = 1;
	        for(int i = 2; i <= r ; i++){
	            dp[i] = ((dp[i-1] % mod) * (i % mod)) % mod;
	        }
	        return dp[r];
	    }

	public static void main(String[] args) {
		System.out.println(nCr(16,9));

	}

}
