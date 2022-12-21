package bfsDfs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheMaze2 {
	
	public static  int shortestDistance(int[][] maze, int[] start, int[] des) {
		int n = maze.length;
		int m = maze[0].length;
	     int dis [][] = new int[n][m];
	     for(int row [] : maze) Arrays.fill(row, Integer.MAX_VALUE);
	     dis[start[0]][start[1]] = 0;
	    dijkstra(start,maze,dis);
        return dis[des[0]][des[1]] == Integer.MAX_VALUE ? -1 : dis[des[0]][des[1]];
    }

	private static void dijkstra(int start [], int[][] maze, int[][] dis) {
		PriorityQueue<int []> pq = new PriorityQueue<>((a,b)-> a[2] - b[2]);
		int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
		pq.add(new int[] {start[0],start[1],0});
		while(pq.size() > 0) {
			int curr [] = pq.remove();
			if(dis[curr[0]][curr[1]] < curr[2]) continue;
			for(int i =0 ; i < dir.length ; i++) {
				int row = curr[0] + dir[i][0];
				int col = curr[1] + dir[i][1];
				int count = 0;
				while(row >= 0 && col >= 0 && row < maze.length && col < maze[0].length && maze[row][col] == 1) {
					row += dir[i][0];
					col += dir[i][1];
					count++;
				}
				if(dis[curr[0]][curr[1]] + count < dis[row - dir[i][0]][col - dir[i][1]]) {
					dis[row - dir[i][0]][col - dir[i][1]] = dis[curr[0]][curr[1]] + count;
					pq.add(new int [] {row - dir[i][0],col-dir[i][1],dis[row - dir[i][0]][col - dir[i][1]]});
				}
			}
		}
	}

	public static void main(String[] args) {
		

	}

}
