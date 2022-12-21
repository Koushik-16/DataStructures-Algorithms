package twoDArray;

import java.util.Scanner;

public class ShellRotation {
	
	public static void display(int [][] a) {
		for(int i = 0 ;i < a.length ; i++) {
			for(int  j =  0 ; j < a[0].length ; j ++) {
				System.out.println(a[i][j] + " ");
			}
			System.out.println();
	}
}
	public static void shellRotation(int [][]arr, int s , int r) {
		int [] oned = fillOned(arr, s);
		rotate(oned,r);
		fillShellFromOned(arr, s, oned);
	}
	

	private static void fillShellFromOned(int[][] arr, int s, int[] oned) {
		
		
	}
	private static void rotate(int[] a, int r) {
		r = r % a.length;
		if( r < 0) {
			r = r + a.length;
		}
		reverse(a,0,a.length -r-1);
		reverse(a,a.length -r, a.length-1);
		reverse(a,0,a.length-1);
	}
	private static void reverse(int[] a, int i, int j) {
		while(i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
	}
	private static int[] fillOned(int[][] arr, int s) {
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length -s;
		int maxc = arr[0].length -s;
		int sz = 2 * (maxr - minr + maxc - minc);
		int [] oned = new int[sz];
		return oned;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr  [][] = new int [n][m];
		for(int i = 0 ;i < arr.length ; i++) {
			for(int  j =  0 ; j < arr[0].length ; j ++) {
				arr[i][j] = sc.nextInt();
			}
		}	
		
		int s = sc.nextInt();
		int r = sc.nextInt();
		
		shellRotation(arr, s, r);
		display(arr);

	}

}
