package twoDArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralTraversal {
	
	 public static  List<Integer> spiralOrder(int[][] matrix) {
         int r1 = 0;
        int r2 = matrix.length-1;
        int c1 = 0;
        int c2 = matrix[0].length-1;
       List<Integer> ans = new ArrayList<>();
        while(r1 <= r2 && c1<=c2){
            for(int c = c1 ; c<=c2; c++) ans.add(matrix[r1][c]);
            for(int r = r1 +1; r<=r2 ;r++) ans.add(matrix[r][c2]);
            if(r1 < r2 && c1 <c2){
                for(int c = c2-1; c > c1 ;c --) ans.add(matrix[r2][c]);
                for(int r = r2 ; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
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
		
		List<Integer> a = spiralOrder(arr);

	}

}
