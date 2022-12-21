package cp;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr [] = new int[n];
			for(int i = 0 ; i < arr.length ; i++) arr[i] = sc.nextInt();
			int min1 = Integer.MAX_VALUE ;
			int min2 = Integer.MAX_VALUE;
			if(arr.length == 2) {
				 min1 = Math.min(arr[0], arr[1]);
				 min2 = Math.max(arr[0], arr[1]);
				 
				 
			}else {
				for(int i = 0; i < arr.length ; i++) {
					if(arr[i] < min1) {
						min2 = min1;
						min1 = arr[i];
					}else if(arr[i] < min2) {
						min2 = arr[i];
					}
				}
				
				int pans = (min1 / 2) + (min2 /2);
				
				
				
			}
			
			 
	        
			} catch(Exception e ) {
				return ;
			}

	}

}
