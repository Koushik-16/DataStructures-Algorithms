package twoDArray;

import java.util.Arrays;

public class Sorted {
	
	public static int [] search(int matrix[][], int target) {
		if(matrix.length == 0) return new int [] {-1, -1};
		int n = matrix.length;
		int m = matrix[0].length;
		
		int low = 0;
		int high = (n*m) - 1;
		while(low <= high ) {
			int mid = (low + (high - low) / 2);
			if(matrix[mid /m][mid%m] == target) return new int [] {mid/m, mid%m};
			if(matrix[mid /m][mid%m] < target) low = mid + 1;
			else high = mid - 1;
		}
		return new int [] {-1, -1};	
	}

	public static void main(String[] args) {
		int a [] [] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 17 , 18}
		};
		int ans [] = search(a,14);
		System.out.println(Arrays.toString(ans));

	}

}
