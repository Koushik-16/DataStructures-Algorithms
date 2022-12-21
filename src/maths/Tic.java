package maths;

import java.io.*;


public class Tic {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        char ch [][] = new char[3][3];
        for(int i = 0 ; i < 3 ; i++) {
        	ch[0][i] = s1.charAt(i);
        }
        for(int i = 0 ; i < 3 ; i++) {
        	ch[1][i] = s2.charAt(i);
        }
        for(int i = 0 ; i < 3 ; i++) {
        	ch[2][i] = s3.charAt(i);
        }
       int g [][] = new int[3][3];
       for(int i = 0 ; i < 3 ; i++) {
    		   for(int j = 0 ; j< 3 ; j++) {
    			   if(ch[i][j] == 'X') g[i][j] = 1;
    			   else if(ch[i][j] == 'O')g[i][j] = 0;
    			   else g[i][j] = 5;
    		   }
       }
       
       int r1 = g[0][0] + g[0][1] + g[0][2];
       int r2 = g[1][0] + g[1][1] + g[1][2];
       int r3 = g[2][0] + g[2][1] + g[2][2];
       
       int c1 = g[0][0] + g[1][0] + g[2][0];
       int c2 = g[0][1] + g[1][1] + g[2][1];
       int c3 = g[0][2] + g[1][2] + g[2][2];
       
       int d1 = g[0][0] + g[1][1] + g[2][2];
       int d2 = g[0][2] + g[1][1] + g[2][0];
        
        boolean t = false;
        int win = 0;
        
           
       
        
        
       
        
        
        

	}

}
