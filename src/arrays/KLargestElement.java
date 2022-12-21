package arrays;

import java.util.Scanner;

public class KLargestElement {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		int k = sc.nextInt();
		int a [] = {3, 1 , -2 , 7 , 4 , 0};
		int n = a.length;
		
         for(int i = 0 ; i<n-1 ; i++) {
			
			boolean sorted = true;
			
			for(int j =0; j<n-1-i; j++) {
				
				if(a[j+1] > a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] =  temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
		}
         for(int y=0; y<k;y++) {
	        System.out.print(a[y] +", ");
		}
		

	}

}
