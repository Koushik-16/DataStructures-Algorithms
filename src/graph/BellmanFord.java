package graph;

import java.util.ArrayList;
import java.util.Arrays;


public class BellmanFord {
	
	static class Node{
		int u ; 
		int v;
		int wt;
		Node(){};
		Node(int u , int v , int wt){
			this.u = u;
			this.v = v;
			this.wt = wt;
		}
	}
	
	public boolean bellmanFord(ArrayList<Node> adj, int n,int src ) {
		int dis [] = new int[n];
		Arrays.fill(dis, 1000000);
		dis[src] = 0;
		
		for(int i = 1; i <= n-1 ; i++ ) {
			for(Node it : adj) {
				if(dis[it.u] > dis[it.v] + it.wt) dis[it.u] = dis[it.v] + it.wt;
			}
		}
		
		boolean fl = false;
		for(Node it : adj) {
			if(dis[it.u] > dis[it.v] + it.wt) fl = true; 
		}
		return fl;
	}
	
	

	public static void main(String[] args) {
		

	}

}
