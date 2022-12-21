package graph;

import java.util.*;

public class KhansAlgo {
	
	public static int [] topoSort(ArrayList<ArrayList<Integer>>adj, int n) {
		int indegree [] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			for(Integer it : adj.get(i)) {
				indegree[it]++;
			}
		}
		int ans [] = new int[n];
		int ind = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0 ; i< n ; i++) if(indegree[i] == 0) q.add(i);
		while(!q.isEmpty()) {
			int curr = q.poll();
			ans[ind++] = curr;
			
			for(Integer it : adj.get(curr)) {
				indegree[it]--;
				if(indegree[it] == 0) q.add(it);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		

	}

}
