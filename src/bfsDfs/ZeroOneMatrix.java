package bfsDfs;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
	 int x;
	 int y ;
	 Pair(){
		 
	 }
	 Pair(int x , int y){
		 this.x = x;
		 this.y = y;
	 }
 }



public class ZeroOneMatrix {
	
//	 int x [] = {-1,-1,0,1,1,1,0,-1};
//   int y [] = {0,1,1,1,0,-1,-1,-1};
	
	public static int [][] dist(int [][] grid){
		Queue<Pair> q = new LinkedList<>();
		
		for(int i = 0 ; i < grid.length ; i++) {
			for(int j = 0 ; j < grid[0].length ; j++) {
				if(grid[i][j] == 0) {
					q.add(new Pair(i,j));
				}else {
					grid[i][j] = -1;
				}
			}
		}
		
		int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
		
		while(!q.isEmpty()) {
			Pair rem = q.remove();
			
			for(int i  = 0; i < dir.length ;i++) {
				int row = rem.x + dir[i][0];
				int col = rem.y + dir[i][1];
				
				if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] < 0) {
					grid[row][col] = grid[rem.x][rem.y] + 1;
			        q.add(new Pair(row,col));
				}
			}
		}
		
		return grid;
	}

	public static void main(String[] args) {
	       
	}

}
