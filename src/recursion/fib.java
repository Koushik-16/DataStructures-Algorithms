package recursion;

public class fib {

	static long fib(long n) {
		if (n <= 1) 
		       return n; 
		    return fib(n-1) + fib(n-2); 
	}
	public static void main(String[] args) {
		
	int x = 5;
	
	
	System.out.println(fib(10));	
	}
}
