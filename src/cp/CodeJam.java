package cp;

import java.util.Scanner;

public class CodeJam {
	
	public static char [][] creat(int r , int c){
		char ch [][] = new char[2*r +1][2 * c + 1];
		ch[0][0] ='.';
		ch[0][1]= '.';
		for(int i = 2 ; i < ch[0].length ; i++) {
			if(i % 2 == 0) ch[0][i] = '+';
			else ch[0][i] = '-';
		}
		ch[1][0] ='.';
		ch[1][1]= '.';
		for(int i = 2; i < ch[0].length ; i++) {
			if(i % 2 == 0) ch[1][i] = '|';
			else ch[1][i] = '.';
		}
		
		for(int i = 2; i < ch.length ; i++) {
			for(int j = 0 ; j < ch[0].length ; j++) {
				if(i % 2 == 0) {
					if(j % 2 == 0) {
						ch[i][j] = '+';
					}else {
						ch[i][j] = '-';
					}
				}else {
					if(j % 2 == 0) {
						ch[i][j] = '|';
					}else {
						ch[i][j] = '.';
					}
				}
			}
		}
		return ch;
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	  int t = sc.nextInt();
	  int k = 1;
	  while(k <= t) {
		  
		  int r = sc.nextInt();
		  int c = sc.nextInt();
		  System.out.println("Case #" + k + ":");
           char ch [][] = creat(r,c);
           for(int i = 0 ; i < ch.length ; i++) {
    	       for(int j = 0 ; j < ch[0].length ; j++) {
    		       System.out.print(ch[i][j]);
    	       }
    	       System.out.println();
           }
           k++;
	  }
	}

}
