package maths;

public class ExtendedEuclideanAlgorihtm {
	
	public static class Pair{
		long x;
		long y;
		long gcd;
		
		Pair(long x, long y , long gcd){
			this.x = x;
			this.y = y;
			this.gcd = gcd;
		}
		
		
	}
	
	public static Pair euclid(long a , long b) {
		if(b == 0) return new Pair(1,0,a);
		Pair dash = euclid(b,a%b);
		return new Pair(dash.y,dash.x - (a/b) * dash.y,dash.gcd);
	}

	public static void main(String[] args) {
		

	}

}
