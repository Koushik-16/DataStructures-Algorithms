package maths;

import java.util.BitSet;

public class MathmaticsGCD {

	public static void main(String[] args) {
		
		
		
	}
	
	static int gcd (int a , int b) {
		if(b == 0 ) return a;
		return gcd(b, a%b);
	}
	
	

}
