package graph;

import java.util.ArrayList;
import java.util.Stack;

class Pair{
	int v;
	int weight;	
	Pair(int v ,int w){
		this.v = v;
		this.weight = w;
	}
	int getV () {return v;}
	int getWeight() {return weight;}
}

public class ShortestPathInDAG {
	
	public static void shortestPathInDAG(ArrayList<ArrayList<Pair>> adj , int n , int src) {
		Stack<Integer> st = new Stack<>();
		int dist [] = new int[n];
		boolean vis [] = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(vis[i] == false) {
				toposort(adj,i,vis,st);
			}
		}
		for(int i = 0 ; i < n ; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[src] =0;
		while(!st.isEmpty()) {
			int node = st.pop();
			if(dist[node] != Integer.MAX_VALUE) {
				for(Pair it : adj.get(node)) {
					if(dist[node] + it.getWeight() < dist[it.getV()]) dist[it.getV()] = dist[node] + it.getWeight();
					
				}
			}
		}
		for(int i = 0; i < n;  i++) {
			if(dist[i] == Integer.MAX_VALUE) System.out.println("INF");
			else System.out.print(dist[i] + " ");
		}
	}

	private static void toposort(ArrayList<ArrayList<Pair>> adj, int node, boolean[] vis, Stack<Integer> st) {
		vis[node] = true;
		for(Pair it : adj.get(node)) {
			if(vis[it.getV()] == false) {
				toposort(adj,it.getV(),vis,st);
			}
		}
		st.push(node);
	}

	public static void main(String[] args) {
		

	}

}
