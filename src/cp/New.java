package cp;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
		     int t = sc.nextInt();
		     while( t -- > 0) {
		    	 long x = sc.nextLong();
		    	 long n = sc.nextLong();
		    	 boolean f = false;
		    	long ans = calculateMoves(x,n,2,f);
		    	System.out.println(ans);
		     }
			} catch(Exception e ) {
				return ;
			}

	}

	private static long calculateMoves(long x, long n, int i,boolean f) {
		if(f == false) {
		long ans = (x - 1) * (i * n - x);
		return ans;
		}else return -1;
	}

}
