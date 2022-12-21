package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph,int v){
		ArrayList<Integer> bfs = new ArrayList<>();
		boolean visited [] = new boolean [v + 1];
		for(int i = 1 ; i <= v ; i++) {
			if(visited[i] == false) {
				Queue<Integer> q = new LinkedList<>();
				q.add(i);
				visited[i] = true;
				while(!q.isEmpty()) {
					Integer node = q.poll();
					bfs.add(node);
					
					for(Integer it : graph.get(node)) {
						if(visited[it] == false) {
							visited[it] = true;
							q.add(it);
						}
					}
				}
			}
		}
		return bfs;
	}

	public static void main(String[] args) {
		

	}

}
