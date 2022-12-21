package bfsDfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
	
   static class Pair{
	 int x;
	 int y ;
	 Pair(){}
	 Pair(int x , int y){
		 this.x = x;
		 this.y = y;
	 }
 }
    
    public static  int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
       Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
        int level  = 1;
        int dx [] = {-1,-1,0,1,1,1,0,-1};
        int dy [] = {0,1,1,1,0,-1,-1,-1};
        while(!q.isEmpty()){
           int size = q.size();
            while(size -- > 0){
                Pair curr = q.remove();
                if(curr.x == n-1 && curr.y == n-1) return level;
                for(int i = 0 ; i < dx.length ; i++){
                    int row = curr.x + dx[i];
                    int col = curr.y + dy[i];
         if(row >= 0 && col >= 0 && row < n && col < n && grid[row][col] == 0){
             grid[row][col] = 1;
             q.add(new Pair(row,col));
         }
                }
                
            }
            level ++;
        }
       return -1; 
    }

	public static void main(String[] args) {
	

	}

}
