package graph;

import java.util.ArrayList;

public class ArticulationPoint {
	
	public static void articulationPoint(int n, ArrayList<ArrayList<Integer>> adj) {
		int vis [] = new int[n];
		int time [] = new int[n];
		int low [] = new int [n];
		int articulation [] = new int[n];
		int timer= 0;
		for(int i = 0; i < n; i++) {
			if(vis[i] ==0) {
				dfs(i , -1 , vis, time, low,adj,timer,articulation);
			}
		}
	}

	private static void dfs(int node, int parent, int[] vis, int[] time, int[] low, ArrayList<ArrayList<Integer>> adj,int timer ,int[] articulation) {
		vis[node] = 1;
		time[node] = low[node] = timer++;
		int child = 0;
		for(Integer it : adj.get(node)) {
			if(it == parent )continue;
			if(vis[it] == 0) {
				dfs(it,node,vis,time,low,adj,timer,articulation);
				low[node] = Math.min(low[it], low[node]);
				if(low[it] >= time[node] && parent != -1) articulation[node] = 1;
				child++;
			}else {
				low[node] = Math.min(low[node], time[it]);
				
			}
		}
		if(parent != -1 && child > 1)  articulation[node] = 1;
	}

	public static void main(String[] args) {
		

	}

}
