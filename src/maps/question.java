package maps;

import java.util.*;
import java.io.*;

public class question {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int sum = 0;
		   
		   for(int i = 0; i<= n; i++) {
			   sum = sum + i;
		   }
		   if(sum%2 == 1) {
			   System.out.println("1");
		   } else {
			   System.out.println("0");
		   }

	}

}
