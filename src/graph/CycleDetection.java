package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetection {
	
	static class Node {
	   int first;
	   int second;
	   
	   public Node(int first , int second) {
		   this.first = first;
		   this.second = second;
	   }
	}
	
	public static boolean isCycle(ArrayList<ArrayList<Integer>> graph, int v) {
		boolean visited [] = new boolean [v+1];
		Arrays.fill(visited, false);
		for(int i = 1 ; i <= v ; i++) {
			if(visited[i] == false) {
				if(hasCycle(graph,i,visited)) return true;
			}
		}
	      return false;
	}
	
	public static boolean hasCycle(ArrayList<ArrayList<Integer>> graph, int v , boolean visited []) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(v,-1));
		visited[v] = true;
		while(!q.isEmpty()) {
			int node = q.peek().first;
		   int par = q.peek().second;
		   q.remove();
		   for(Integer it : graph.get(node)) {
			   if(visited[it] == false) {
				   q.add(new Node(it,node));
				   visited[it] = true;
			   }else if(par != it) return true;
		   }
		}
        return false;
	}

	public static void main(String[] args) {
		

	}

	
	
	
	
	
	
	
	
}
