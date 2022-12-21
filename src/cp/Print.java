package cp;

import java.util.Scanner;

public class Print {
	
	static int b [] = new int[4];
	
	public  static boolean color(int[] p1, int[] p2, int[] p3) {
		int min1;
		int min2 ;
		int min3 ;
		int min4 ;
		int total = (int)Math.pow(10, 6);
		min1 = Math.min(p1[0], Math.min(p2[0], p3[0]));
		min2 = Math.min(p1[1], Math.min(p2[1], p3[1]));
		min3 = Math.min(p1[2], Math.min(p2[2], p3[2]));
		min4 = Math.min(p1[3], Math.min(p2[3], p3[3]));
		int sum = 0;
		int a [] = new int[4];
	    a[0] = min1;
	    a[1] = min2;
    	 a[2] = min3;
	    a[3] = min4;
	     int i = 0;
	    while(i < 4) {
	        if(sum < total) {
	        	b[i] = Math.min( a[i],total - sum )	;
	        	sum += b[i];
	        }else {
	        	b[i] = 0;
	        }
	        i++;
	    }
		return sum == total;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  int t = sc.nextInt();
		  int k = 1;
		  while(k <= t) {
			  int p1 [] = new int[4];
			  int p2 [] = new int[4];
			  int p3 [] = new int[4];
			  for(int i = 0 ;i < 4; i++) p1[i] = sc.nextInt();
			  for(int i = 0 ;i < 4; i++) p2[i] = sc.nextInt();
			  for(int i = 0 ;i < 4; i++) p3[i] = sc.nextInt();
			  System.out.print("Case #" + k + ": ");
			  boolean ans = color(p1,p2,p3);
			  if(ans == true) System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3]);
			  else System.out.println("IMPOSSOBLE");
			  k++;
		  }

	}


}
