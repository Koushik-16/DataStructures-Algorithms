package cp;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while( t -- > 0) {
				int n = sc.nextInt();
				int arr [] = new int[n];
				for(int i = 0 ; i < arr.length ; i++) arr[i] = sc.nextInt();
				
				boolean oo = true;
				boolean oe = true;
				boolean eo = true;
				boolean ee = true;
				for(int i = 1; i < n ; i+=2) {
					if(arr[i] % 2 == 0) oo = false;
					else if(arr[i] % 2 == 1) oe = false;
				}
				
				for(int i = 0; i < n ; i+=2) {
					if(arr[i] % 2 == 0) eo = false;
					else if(arr[i] % 2 == 1) ee = false;
				}
				
				if((oo == true || oe == true) && (eo == true || ee == true)) System.out.println("Yes");
				else System.out.println("No");
				
				
			}
			 
	        
			} catch(Exception e ) {
				return ;
			}

	}

}
 