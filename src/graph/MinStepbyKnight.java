package graph;
import java.util.*;

public class MinStepbyKnight {
	
	static class Pair{
		 int x;
		 int y ;
		 Pair() {}
		 Pair(int x , int y){
			 this.x = x;
			 this.y = y;
		 }
	 }
	
	public static int knight(int n, int m, int sr, int sc, int er, int ec) {
		int grid[][] = new int[n + 1][m + 1];
		if(n <= 2 || m <= 2) return -1;
		grid[sr][sc] = 1;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(sr,sc));
		int level = 0;
		int x [] = {-2,-1,1,2,2,1,-1,-2};
		int y [] = {1,2,2,1,-1,-2,-2,-1};
		while(!q.isEmpty()) {
			int size = q.size();
			for(int j = 0; j < size ; j++) {
				Pair curr = q.poll();
				if(curr.x == er && curr.y == ec) return level;
	    	  for(int i = 0 ; i< x.length ; i++) {
			      int row = curr.x + x[i];
			      int col = curr.y + y[i];
			      if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == 0){
			      	grid[row][col] = 1;
				    q.add(new Pair(row,col));
			}
			
		}
			}
			level++;
		}
		return -1;
    }

	public static void main(String[] args) {
		System.out.println(knight(8,8,1,1,8,8));
	}

}
