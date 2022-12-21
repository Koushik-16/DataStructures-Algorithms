package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SwimInRisingWater {
	
	static class Pair{
		 int x;
		 int y ;
		 int val;
		 Pair() {}
		 Pair(int x , int y,int val){
			 this.x = x;
			 this.y = y;
			 this.val = val;
		 }
	 }
	
	public static int minTime(int grid [][]) {
		int n = grid.length;
		int ans = Integer.MAX_VALUE;
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
		pq.add(new Pair(0,0,grid[0][0]));
        boolean visited [][] = new boolean[n][n];
        visited[0][0] = true;
		int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
		while(!pq.isEmpty()) {
			int size = pq.size();
			while(size -- > 0) {
				Pair curr = pq.remove();
				if(curr.x == n-1 && curr.y == n-1) return curr.val;
				
				for(int i = 0 ; i < dir.length ; i++) {
					int row = curr.x + dir[i][0];
					int col = curr.y + dir[i][1];
             if(row >= 0 && col >= 0  && row < n && col < n && visited[row][col] == false) {
						int time = Math.max(curr.val, grid[row][col]);
                        visited[row][col] = true;
						pq.add(new Pair(row,col,time));
					}
				}
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		
		List<Integer> ans = new ArrayList<>();
		int b = (int)'a';
		System.out.println(b);
		
	}

}
