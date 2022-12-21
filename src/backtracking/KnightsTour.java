package backtracking;

public class KnightsTour {
	
	public static boolean tour(int board [][],int i , int j , int move) {
		if(move == (board.length * board[0].length)) {
			board[i][j] = move;
			printBoard(board);
			System.out.println();
			return true;
		}
		board[i][j] = move;
		int dx [] = {-2,-1,1,2,2,1,-1,-2};
		int dy [] = {1,2,2,1,-1,-2,-2,-1};
		for(int k = 0; k < dx.length ; k++) {
			int row = i + dx[k];
			int col = j + dy[k];
		if(row >= 0 && col >= 0 && row < board.length && col < board[0].length && board[row][col] == 0) {
			if(tour(board,row,col,move+1)) return true;
		}
		}
		board[i][j] = 0;
		return false;
	}
	

	private static void printBoard(int[][] board) {
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0; j < board[0].length ; j++) {
				board[i][j] --;
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
       int board[][] = new int[8][8];
       tour(board,0,0,1);
		
		
	}

}
