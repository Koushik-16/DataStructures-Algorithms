package backtracking;

public class Nqn {
	
	public static int nQueen(int board [][] , int n) {
		int rows [] = new int[n];
		int d [] = new int[2 * n - 1];
		int rd [] = new int[2 * n - 1];
		
		return solve(board,0,n,rows,d,rd);
	}
	

	private static int solve(int[][] board, int col, int n, int[] rows, int[] d, int[] rd) {
		if(col == n) {
			printBoard(board,n);
			System.out.println();
			return 1;
		}
		int count = 0;
		for(int row = 0 ; row < n ; row++) {
			if(isSafe(row,col,rows,d,rd,n)) {
				board[row][col] = 1;
				rows[row] = 1;
				d[row + col] = 1;
				rd[n - 1 + col - row] = 1;
				count += solve(board,col+ 1,n,rows,d,rd);
				board[row][col] = 0;
				rows[row] = 0;
				d[row + col] = 0;
				rd[n - 1 + col - row] = 0;
			}
		}
		
		return count;
	}


	private static boolean isSafe(int row, int col, int[] rows, int[] d, int[] rd,int n) {
		return (rows[row] == 0 && d[row + col] == 0 && rd[n -1 + col - row] == 0);
	}


	private static void printBoard(int[][] board,int n) {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int n = 8;
		int board [][] = new int[n][n];
		System.out.println(nQueen(board,n));

	}

}
