package bitmanipulation;

public class Totalsetbits {
	
	public static int solution(int n ) {
		if( n == 0) {
			return 0;
		}
		int x = lp0f2range(n);
		int bitstill2resx = x*(1<< (x-1)); // set bits till 2^x = 2^(x-1)*x
		int msbfrom2resxton = n - (1 << x) +1; // max bits from lp0f2range to given range 
		// n * 2^x +1
		int rest = n - (1<< x) ; // remaining set bits
		int ans = bitstill2resx + msbfrom2resxton + solution(rest); // recursive call 
		return (int)(ans%1000000007);
	}
	public static int lp0f2range(int n) {
		//least power of 2 till range
		int x = 0;
		while((1<< x) <= n) {
			x++;
		}
		return x-1;
	}
		
	public static void main(String[] args) {
		System.out.println(solution(13));
		
  
	}

}
