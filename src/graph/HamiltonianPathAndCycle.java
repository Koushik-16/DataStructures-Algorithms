package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

import graph.DFS.Edge;

public class HamiltonianPathAndCycle {
	
	public static void printPathAndCycle(ArrayList<Edge> [] graph, int src) {
		HashSet<Integer> visited = new HashSet<>();
		hamiltonian(graph,src,visited,src + "",  src);
	}
	
	public static void hamiltonian(ArrayList<Edge> [] graph, int src , HashSet<Integer> visited , String psf,int osrc) {
		if(visited.size() == graph.length - 1) {
			System.out.println(psf);
			boolean c = false;
			for(Edge e : graph[src]) {
				if(e.nbr == osrc) {
					c = true;
					break;
				}
			}
			if(c) {
				System.out.println("*");
			}else {
				System.out.println(".");
			}
			
			return;
		}
		visited.add(src);
		for(Edge e : graph[src]) {
			if(!visited.contains(e.nbr)) {
				hamiltonian(graph,e.nbr,visited,psf + e.nbr,osrc);
			}
		}
	  visited.remove(src);
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
			
			int src = Integer.parseInt(br.readLine());
			
			
}
}
