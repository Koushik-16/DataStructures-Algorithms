package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleDetection2 {
	
	public static boolean hasCycle(int v , ArrayList<ArrayList<Integer>> graph) {
		boolean visited []= new boolean [v+1];
		Arrays.fill(visited, false);
		for(int i = 1 ; i <= v + 1 ; i++) {
			if(visited[i] == false) {
				if(detectCycle(i , - 1, graph , visited)) return true;
			}
		}
		return false;
	}

	private static boolean detectCycle(int node, int parent, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
		visited[node] = true;
		for(Integer it : graph.get(node)) {
			if(visited[it] == false) {
				if(detectCycle(it,node,graph,visited)) return true;
			}else if(it != parent) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
