package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
	
	
	public static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj , int n) {
		int color [] = new int[n];
		for(int i =0; i < color.length ; i++) {
			color[i] = -1;
		}
		for(int i = 0 ;i < n ; i++) {
			if(color[i] == -1) if(!bfsCheck(adj,i , color)) return false;
		}
		
		return true;
	}

	public static boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		color[node] = 1;
		while(!q.isEmpty()) {
			Integer curr = q.poll();
			for(Integer it : adj.get(curr)) {
				if(color[it] == -1) {
					color[it] = 1- color[curr];
					q.add(it);
				}else if(color[it] == color[curr]) return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		

	}

}
