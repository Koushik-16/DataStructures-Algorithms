package twoDArray;

import java.util.Arrays;

public class RowColl {
	
	public static int [] search(int matrix [][], int target) {
		int r = 0;
		int c = matrix.length - 1;
		while(r < matrix.length && c >= 0) {
			if(matrix[r][c] == target) { 
				return new int [] {r,c};
			}
			if(matrix[r][c] < target) {
				r++;
			} else {
				c--;
			}
		}
		return new int [] {-1 , -1};
	}

	public static void main(String[] args) {
		int a[] [] = {
				{10 , 20 , 30 , 40},
				{15, 25, 35 , 45},
				{28 , 29 , 39 , 49}
		};
		
		int ans [] = search(a, 24);
		System.out.println(Arrays.toString(ans));

	}

}
