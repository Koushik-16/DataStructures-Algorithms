package maths;

public class Pow {
	
	public static long pow(long x, long n, long d) {
		if(n == 0 ) return 1 % d;
		if(x < 0) return pow(x + d, n , d);
		if(n == 1) return x % d;
		long ans = 1;
		while(n > 0 ){
			if(n % 2 == 0){
				x = x * x % d;
				n = n /2;
			}else {
				ans  = (ans * x) % d;
				n = n -1;
			}
		}
		return ans % d;
	}



	public static void main(String[] args) {
		System.out.println(pow(2,12547,1000000007));
	}

}
