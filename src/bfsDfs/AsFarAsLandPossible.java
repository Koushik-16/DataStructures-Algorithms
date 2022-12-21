package bfsDfs;

import java.util.LinkedList;
import java.util.Queue;

  

public class AsFarAsLandPossible {
	
   static  class Pair{
		 int x;
		 int y ;
		 Pair(){
			 
		 }
		 Pair(int x , int y){
			 this.x = x;
			 this.y = y;
		 } 
	}
	
	 public static int maxDistance(int[][] grid) {
			Queue<Pair> q= new LinkedList<>();
			for(int i = 0 ; i < grid.length ; i++) {
				for(int j = 0 ; j < grid[0].length ; j++) {
					if(grid[i][j] == 1) q.add(new Pair(i,j));	
				}
			}
			if(q.size() == 0 || q.size() == grid.length* grid[0].length) return -1;
	        
			int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
	        int level = -1;
	        while(!q.isEmpty()){
	            level ++;
	            int size = q.size();
	            while(size -- > 0){
	                Pair curr = q.remove();
	                for(int i = 0 ; i< dir.length; i++) {
					int row = curr.x + dir[i][0];
					int col = curr.y + dir[i][1];
	                    if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] ==1) continue;
	                    q.add(new Pair(row,col));
	                    grid[row][col] = 1;
	                }
	            }
	        }
			return level;
	    }

	public static void main(String[] args) {
		

	}

}
