package cp;

import java.util.Scanner;

public class FallDown {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while( t -- > 0) {
				long x = sc.nextLong();
				long y = sc.nextLong();
				solve(x,y);
				
			}
			 
		}catch(Exception e) {
			return ;
		}
	        
			
	}

	private static void solve(long a, long b) {
		
	if(a == b) System.out.println("0");
	else if(b > a) {
		System.out.println(b-a);
	}else {
		if(b % 2 == 0) {
			System.out.println((a-b) /2);
		}else {
			long ans = ((a + 1 - b)/2) + 1;
			System.out.println(ans);
		}
	}
	}

}
