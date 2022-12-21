package graph;

import java.util.*;

public class Graph {
	
	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	 
	public void addEdge(int source, int destrination) {
		adj[source].add(destrination);
		adj[destrination].add(source);
	}
	
	public int bfs (int source , int destrination) {
		boolean vis[] = new boolean [adj.length];
		int parent[] = new int [adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(q.isEmpty()) {
			int cur = q.poll();
			if(cur == destrination ) break;
			for(int neibour : adj[cur]) {
				if(!vis [neibour]) {
					vis[neibour] = true;
					q.add(neibour);
					parent[neibour] = cur;
				}
			}
		}
		int cur = destrination;
		int distance = 0; 
		while(parent[cur] != -1) {
			System.out.print(cur +" -> ");
			cur = parent[cur];
			distance ++;
		}
		return distance;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices and edges ");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graph graph = new Graph(v);
		System.out.println("Enter " + e + " edges");
		for(int i = 0; i<e; i++) {
			int source = sc.nextInt(); 
			int destrination = sc.nextInt(); 
			
			graph.addEdge(source, destrination);
		}
		System.out.println("Enter source and destrination");
		
		int source = sc.nextInt();
		int destrination = sc.nextInt();
		
		int distance = graph.bfs(source, destrination);
		System.out.println("min distance is " + distance);
		sc.close();

	}

}
