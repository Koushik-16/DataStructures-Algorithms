package bfsDfs;

import java.util.HashSet;

public class DistinctIslands {
	
	static StringBuilder sb  = new StringBuilder();
	
	public static int numberOfDistinctIslands(int grid [][]) {
		HashSet<String> set = new HashSet<>();
		for(int i =0 ;i < grid.length  ; i++) {
			for(int j = 0 ; j < grid[0].length ;j++) {
				if(grid[i][j] == 1) {
				 sb = new StringBuilder();
				 sb.append("x");
			     dfs(grid, i  , j);
			     set.add(sb.toString());
				}
			}
		}
		return set.size();
	}
	

	private static void dfs(int[][] grid, int i, int j) {
		
		grid[i][j] = 0;
		
		if(i - 1  >= 0 && grid[i -1][j] == 1) {
			sb.append("u");
			dfs(grid,i-1,j);
		}
		
		if(j + 1 < grid[0].length && grid[i][j + 1] ==1 ) {
			sb.append("r");
			dfs(grid,i,j + 1);
		}
		
		if(i + 1 < grid.length && grid[i + 1][j] == 1) {
			sb.append("d");
			dfs(grid,i+1,j);
		}
		
		if(j - 1 >= 0 && grid[i][j - 1] == 1) {
			sb.append("l");
			dfs(grid,i,j-1);
		}
		
		sb.append("x");
		
	}


	public static void main(String[] args) {
		

	}

}
