package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
	
	public static List<List<String>> nQueen(int n ){
		char board [][] = new char[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ;  j <n ; j++) {
				board[i][j] = '.';
			}
		}
		List<List<String>> ans = new ArrayList<List<String>>();
		int leftrow[] = new int [n];
		int upper[] = new int[2*n - 1];
		int lower[] = new int[2*n - 1];
		place(0,board,ans,leftrow,upper,lower);
		return ans;
	}
	
	public static void place(int col, char[][] board, List<List<String>> ans, int[] leftrow, int[] upper, int[] lower) {
		if(col == board.length) {
			ans.add(constract(board));
			return;
		}
		for(int row = 0 ; row < board.length ; row++) {
			if(leftrow[row] == 0 && upper[board.length - 1 + col - row] == 0 && lower[row + col] == 0) {
				board[row][col] = 'Q';
				leftrow[row] = 1;
				upper[board.length - 1 + col - row] = 1;
				lower[row + col] = 1;
			   place(col +1 , board, ans,leftrow, upper, lower);
			   board[row][col] = '.';
				leftrow[row] = 0;
				upper[board.length - 1 + col - row] = 0;
				lower[row + col] = 0;
			}
		}
	}

	private static List<String> constract(char[][] board) {
		List<String> res = new LinkedList<String>();
		for(int i  = 0 ; i < board.length; i++) {
		String s = new String(board[i]);
		res.add(s);
		
		}
		return res;
	}

	public static void main(String[] args) {
		List<List<String>> ans = nQueen(4);
		for(int i =0 ; i < ans.size() ; i++) {
			for(int j = 0 ; j < ans.get(i).size(); j ++) {
				System.out.println(ans.get(i).get(j));
			}
			System.out.println();
		}

	}

}
