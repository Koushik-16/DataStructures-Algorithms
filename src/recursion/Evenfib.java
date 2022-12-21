package recursion;

public class Evenfib {
	
	static long Evenfib(long n) {
		if(n < 1)
			return n;
		if(n == 1)
			return 2;
		return ((4 * Evenfib(n -1)) + Evenfib(n -2));
	}
	public static void main(String[] args) {
		
		System.out.println(Evenfib(3));
	}
}
