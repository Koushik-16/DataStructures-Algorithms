package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
	
	public static int [] topoSort(int n , ArrayList<ArrayList<Integer>> adj) {
		int vis [] = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i =0 ; i < n ; i++) {
			if(vis[i] ==0) {
				findTopoSort(i,adj,vis,st);
			}
		}
		int ans[] = new int[n];
		int i =0;
		while(!st.isEmpty()) {
			ans[i++] = st.pop();
		}
	  return ans;
	}

	private static void findTopoSort(int i, ArrayList<ArrayList<Integer>> adj, int[] vis, Stack<Integer> st) {
		vis[i] = 1;
		for(Integer it : adj.get(i)) {
			if(vis[it] == 0) {
				findTopoSort(it,adj,vis,st);
			}
		}
		st.push(i);
	}

	public static void main(String[] args) {
		

	}

}
