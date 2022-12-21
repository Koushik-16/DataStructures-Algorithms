package loops;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 
		 int sum = 0;
		 
		 if(x % 2 == 0 ) {
			 for(int i = x + 1; i <= y; i = i + 2) {
				 System.out.println(i);
				 sum = sum + i;
			 }
		 } else {
			 for(int i = x; i <= y; i = i+ 2) {
				 System.out.println(i);
				 sum = sum + i;
			    }
			 
			 }
		 System.out.println(sum);
		 }
		 
		
	}




