package userInput;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-- != 0){
		        int t1 = sc.nextInt();
		        int t2 = sc.nextInt();
		        int r1 = sc.nextInt();
		        int r2 = sc.nextInt();
		        
		        int c  = (int) Math.pow(3, 6);
		        System.out.println(c);
		        long a = t1*t1*r2*r2*r2;
		        long b = t2*t2*r1*r1*r1;
		        System.out.println(a);
		        System.out.println(b);
		        if(a==b) System.out.println("Yes");
		        else System.out.println("No");
		    }

	}

}
