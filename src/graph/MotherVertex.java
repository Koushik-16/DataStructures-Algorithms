package graph;

import java.util.ArrayList;
import java.util.Stack;

public class MotherVertex {
	
	public static int motherVertex(int n , ArrayList<ArrayList<Integer>> adj) {
		Stack<Integer> st = new Stack<>();
		boolean vis [] = new boolean[n];
		for(int i = 0; i < n ; i++) {
			if(vis[i] == false) {
				dfs(adj,st,vis,i);
			}
		}
		return st.peek();
	}

	public static void dfs(ArrayList<ArrayList<Integer>> adj, Stack<Integer> st, boolean[] vis, int i) {
		vis[i] = true;
		for(Integer node : adj.get(i)) {
			if(vis[node] == false) dfs(adj,st,vis,node);
		}
		st.push(i);
	}

	public static void main(String[] args) {
		

	}

}
