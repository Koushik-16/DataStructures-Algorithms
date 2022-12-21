package bfsDfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
	
static class Pair{
		 int x;
		 int y ;
		 Pair(){}
		 Pair(int x , int y){
			 this.x = x;
			 this.y = y;
		 }
	 }
	    public static  int shortestBridge(int[][] grid) {
	        int n = grid.length ;
	        int m = grid[0].length;
	        boolean f = false;
	        Queue<Pair> q = new LinkedList<>();
	        for(int i = 0 ; i < n && f == false ; i++){
	            for(int j = 0 ; j < m && f == false ; j++){
	                if(grid[i][j] ==1 ) { 
	                    dfs(grid,i,j,q);
	                    f = true;
	                }
	            }
	        }
	        
	        int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
	        
	        int level =0;
	        while(!q.isEmpty()){
	            int size = q.size();
	            while(size -- > 0){
	                Pair curr = q.remove();
	                for(int i = 0 ; i < dir.length ; i++){
	                    int row = curr.x + dir[i][0];
	                    int col = curr.y + dir[i][1];
	              if(row >= 0 && col >= 0 && row < n && col < m && grid[row][col] != -1){
	                  if(grid[row][col] == 1) return level;
	                  if(grid[row][col] == 0){
	                      grid[row][col] = -1;
	                      q.add(new Pair(row,col));
	                  }
	              }
	                }
	            }
	            level++;
	        }
	        return -1;
	        
	    }
	    
	    public static  void dfs(int [][] grid, int i , int j , Queue<Pair> q){
	        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) return;
	        grid[i][j] = -1;
	        q.add(new Pair(i,j));
	        dfs(grid,i - 1 ,j,q);
	        dfs(grid,i,j + 1,q);
	        dfs(grid,i + 1 ,j,q);
	        dfs(grid,i,j -1,q);
	    }

	public static void main(String[] args) {
		
		
	}

}
