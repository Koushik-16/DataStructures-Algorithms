package recursion;

import java.util.Scanner;

public class Factorial {
	
	static long factorial(long n) {
		if(n == 0) {
			return 1;
		}
		return n*factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("enter number");
		System.out.println(factorial(x));

	}

}
