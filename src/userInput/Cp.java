package userInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Cp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-- != 0){
		    	int d []= new int[3];
		    	int s [] = new int[3];
		    	for(int i = 0; i < 3 ; i++) {
		    		d[i] = sc.nextInt();
		    	}
		    	for(int i =0 ; i < 3 ; i++) {
		    		s[i] = sc.nextInt();
		    	}
		    	
		    	int sum1 = 0;
		    	int sum2 = 0;
		    	for(int i = 0; i < 3 ; i++) {
		    		sum1 += d[i];
		    		sum2 += s[i];
		    	}
		    	if(sum1 > sum2) System.out.println("DRAGON");
		    	else if(sum2 > sum1) System.out.println("SLOTH");
                else {
                	if(d[0] > s[0]) System.out.println("DRAGON");
                	else if(s[0] > d[0]) System.out.println("SLOTH");
                	else {
                		if(d[1] > s[1]) System.out.println("DRAGON");
                		else if(s[1] > d[1]) System.out.println("SLOTH");
                		else {
                			if(d[2] > s[2]) System.out.println("DRAGON");
                    		else if(s[2] > d[2]) System.out.println("SLOTH");
                    		else System.out.println("TIE");
                		}
                	}
                }
	}

}
}
