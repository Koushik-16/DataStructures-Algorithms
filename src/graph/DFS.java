package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS {
	
	 static class Edge{
		int src;
		int nbr;
		int wt;
		
		Edge(int src , int nbr, int wt){
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
		
		Edge(){
			
		}
	}
	 
	 public static boolean hasPath(int src , int dest, ArrayList<Edge> [] graph, boolean [] visited) {
		 if(src == dest) return true;
		 visited[src] = true;
		 for( Edge edge : graph[src] ) {
			 if(visited[edge.nbr] == false) {
			     boolean nbrHasPath = hasPath(edge.nbr,dest,graph,visited);
			     if(nbrHasPath == true) return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void printAllPaths(int src , int dest, ArrayList<Edge> [] graph, boolean [] visited, String psf) {
		 if(src == dest) {
			 System.out.println(psf);
			 return;
		 }
		 visited[src] = true;
		 for( Edge edge : graph[src] ) {
			 if(visited[edge.nbr] == false) {
				 printAllPaths(edge.nbr,dest,graph,visited,psf + edge.nbr);
			 }
		 }
		 visited[src] = false;
	 }
	 
	 public static List<List<Integer>> getConnComponents(ArrayList<Edge> [] graph){
		 List<List<Integer>> ans = new ArrayList<>();
		 boolean visited [] = new boolean[graph.length];
		 for(int i =0 ; i <graph.length ; i++) {
			 if(visited[i] == false) {
			 ArrayList<Integer> ds = new ArrayList<>();
			 addComponents(graph,i,ds,visited);
			 ans.add(ds);
			 }
		 }
		 return ans;
	 }
	 
	
	 public static void addComponents(ArrayList<Edge> [] graph , int src , ArrayList<Integer> ds , boolean visited []) {
		 visited[src] = true;
		 ds.add(src);
		 for(Edge e : graph[src]) {
			 if(visited[e.nbr] == false) {
			 addComponents(graph,e.nbr,ds,visited);
			 }
		 }
		 return;
	 }
	    
	 public static boolean isConnected(ArrayList<Edge> [] graph) {
		 return getConnComponents(graph).size() == 1;
	 }
	 
	
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int vtces = Integer.parseInt(br.readLine());
		ArrayList<Edge>[] graph = new ArrayList[vtces];
		for(int i =0; i< vtces ; i++) {
			graph[i] = new ArrayList<>();
		}
		int edges =Integer.parseInt(br.readLine());
		for(int i = 0 ;i < edges ; i++) {
			String path []  = br.readLine().split(" ");
			int v1 = Integer.parseInt(path[0]);
			int v2 = Integer.parseInt(path[1]);
			int wt = Integer.parseInt(path[2]);
			graph[v1].add(new Edge(v1,v2,wt));
			graph[v2].add(new Edge(v2,v1,wt));
		}	
//		graph
		
//		7
//		8
//		0 1 10
//		1 2 10
//		2 3 10
//		0 3 10
//		3 4 10
//		4 5 10
//		5 6 10
//		4 6 10
//		0
//		6
			
		int src = Integer.parseInt(br.readLine());
		int dest = Integer.parseInt(br.readLine());
		boolean visited []  = new boolean [vtces];
//		System.out.println(hasPath(src,dest,graph,visited));
//		printAllPaths(src,dest,graph,visited,src + "");
		List<List<Integer>> ans = getConnComponents(graph);
		for(int i = 0 ; i < ans.size() ;  i++) {
			System.out.print(ans.get(i) + " ");
		}
		
	}

}
















