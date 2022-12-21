package arrays;

import java.util.Scanner;

public class TwoDArraya {

	public static void main(String[] args) {
//		int a[][] = new int[5][3];
		
		int b[][] = {
				{3,5,7,2},
		        {4,1,7},
		        {1,2,3,5,6,8}
		        };	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	int arr  [][] = new int [n][m];
	for(int i = 0 ;i < n ; i++) {
		for(int  j =  0 ; j < m ; j ++) {
			arr[i][j] = sc.nextInt();
		}
	}
//		for(int i = 0; i <arr.length; i++) {
//			for(int j  =0 ;j <arr[i].length ;j++){
//				System.out.print(arr[i][i] + " ");
//			}
//			System.out.println();
//		}
//		int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
//		if(r2 != c1) {
//			System.out.println("Invalid input");
//		}
//		int prw [][] = new int [r1][c2];
//		for(int i = 0 ;i < prw.length ; i++) {
//			for(int  j =  0 ; j < prw[0].length ; j ++) {
//				for(int  k =  0 ; k < c1 ; k ++) {
//					
//					prw[i][j] += one[i][k] * two[k][j];
//				}
//			}
//		}
	}

}
