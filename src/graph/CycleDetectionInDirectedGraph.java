package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class CycleDetectionInDirectedGraph {
	
	public static boolean hasCycle(int n , ArrayList<ArrayList<Integer>> adj) {
		int vis [] = new int[n];
		int dfs [] = new int[n];
		
		for(int i = 0; i < n ; i++) {
			if(vis[i] == 0) {
				if(checkCycle(i,adj,vis,dfs)) return true;
			}
		}
		return false;
	}

	private static boolean checkCycle(int i, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] dfs) {
		vis[i] = 1;
		dfs[i] = 1;
		
		for(Integer it : adj.get(i)) {
			if(vis[it] == 0) {
				if(checkCycle(it,adj,vis,dfs))  {
                    return true;
                }
            }
			else if(dfs[it] == 1 ) {
				return true;
			}
		}
		dfs[i] = 0;
		return false;
	}

	public static void main(String[] args) {
		
		 HashMap<Character,Integer> dp [] = new HashMap[10];
	}

}







