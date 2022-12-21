package backtracking;

import java.util.ArrayList;

public class RatInAMaze {
	
	public static void paths(int [][] grid) {
		ArrayList<String> s = new ArrayList<>();
	   solve(grid, 0 , 0, "",s); 
	   for(int i = 0; i < s.size() ; i++) {
		   System.out.println(s.get(i));
	   }
	}
	
	public static void solve(int [][]grid, int i , int j , String p,ArrayList<String> ans) {
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return;
		if(i == grid.length - 1 && j == grid[0].length - 1) {
			ans.add(p);
			return;
		}
		grid[i][j] = 0;
		
		solve(grid,i + 1, j ,p +"D",ans);
		solve(grid, i - 1,j , p+ "U",ans);
		solve(grid,i,j + 1, p + "R",ans);
		solve(grid, i, j - 1, p+ "L",ans);
		
		grid[i][j] = 1;
		
	}

	public static void main(String[] args) {
		int a [][] = {{1, 0, 0, 0},
				      {1, 1, 0, 0},
				      {1, 1, 0, 0},
				      {0, 1, 1, 1},	};
		paths(a);

	}

}
