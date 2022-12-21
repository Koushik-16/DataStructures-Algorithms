package bfsDfs;

import java.util.HashMap;
import java.util.HashSet;

public class MakingAislandLarge {
	
	public static int maxArea(int [][]grid) {
		int  n = grid.length;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, 0);
		int id = 2;
		for(int i  =0 ;i < n; i++) {
			for(int j= 0 ;j < n ; j++) {
				if(grid[i][j] == 1) {
					int area = dfs(grid,i,j,id);
					map.put(id, area);
					id++;
				}
			}
		}
		int res = map.getOrDefault(2, 0);
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(grid[i][j] == 0) {
					HashSet<Integer> set = new HashSet<>();
					set.add(i > 0 ? grid[i-1][j] : 0);
					set.add(i < n -1 ? grid[i+ 1][j] : 0);
					set.add(j > 0 ? grid[i][j-1] : 0);
					set.add(j < n- 1 ? grid[i][j + 1] : 0);
					int currarea = 1;
					for(int val : set) currarea += map.get(val);
					res = Math.max(res, currarea);
				}
			}
		}
		
		return res;
	}


	  static int dfs(int[][] grid, int i, int j, int id) {
		if(i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) return 0;
		grid[i][j] = id;
		return 1 + dfs(grid,i+ 1,j,id) + dfs(grid,i,j-1,id) + dfs(grid,i-1,j,id)+ dfs(grid,i,j+ 1,id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
