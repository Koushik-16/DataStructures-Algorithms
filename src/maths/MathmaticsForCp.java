package maths;

import java.util.Arrays;
import java.util.Scanner;

public class MathmaticsForCp {
	
	static boolean [] seiveOfEratoSthenes(int n) {
		boolean isPrime[] = new boolean [n+1];
		Arrays.fill(isPrime , true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i*i<= n; i++ ) {
			for(int j = 2*i; j<= n; j+=i) {
				isPrime[j] = false;
			}
		}
		
		return isPrime;
	}
	public static void main(String[] args) {
//		
		 Scanner sc = new Scanner(System.in);
		int x =  sc. nextInt();
		boolean isPrime [] = seiveOfEratoSthenes (x);
		for(int i = 0; i<= x; i++) {
			System.out.println(i + " " + isPrime[i]);
		}	
	}
}
//class dog {
//	static int a = 5;
//	static int b = 7;
//	 public static void main(String[] args) {
//		 System.out.println(a+b);
//	 }
//	 
// }
