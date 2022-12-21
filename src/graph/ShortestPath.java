package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
	
	public void shortestPath(ArrayList<ArrayList<Integer>> adj , int n , int src) {
		int dis [] = new int[n];
		for(int i =0 ; i < n ;i++) {
			dis[i] = 1000000000;
		}
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		dis[src] = 0;
		while(!q.isEmpty()) {
			int node = q.poll();
			for(Integer it : adj.get(node)) {
				if(dis[node] + 1 < dis[it]) {
					dis[it] = dis[node] + 1;
					q.add(it);
				}
			}
		}
		for(int i = 0; i < n ; i++) {
			System.out.print(dis[i] +  " ");
		}
	}

	public static void main(String[] args) {
		

	}

}
