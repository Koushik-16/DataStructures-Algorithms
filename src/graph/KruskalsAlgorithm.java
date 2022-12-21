package graph;

import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgorithm {
	
	static class Node {
		int v ;
		int u ; 
		int weight;
	public Node(int v , int u , int weight){ 
			this.v = v ;
            this.u = u;
           this.weight = weight;
		}
		Node(){};
		int getV() {return v;};
		int getU() {return u;};
		int getWeight() {return weight;}
	}
	
	public void kruskalsAlgo( ArrayList<Node> adj , int n ) {
		Collections.sort(adj,(a,b) -> a.getWeight() - b.getWeight());
		int parent[] = new int[n];
		int rank [] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			parent[i] = i;
			rank[i] =0;
		}
		int cost = 0;
		ArrayList<Node> mst = new ArrayList<>();
		for(Node it : adj) {
			if(findParent(it.getU(),parent) != findParent(it.getV(),parent)) {
				cost  += it.getWeight();
				mst.add(it);
				union(rank,parent,it.getU(),it.getV());
			}
		}
		System.out.println(cost);
		for(Node it : mst) System.out.println(it.getU() + " " + it.getV());
	}
	
	public static void union(int rank[], int parent[], int u , int v) {
		u = findParent(u,parent);
		v = findParent(v,parent);
		if(rank[u] < rank[v]) parent[u] = v;
		else if(rank[v] < rank[u]) parent[v] =  u;
		else {
			parent[v] = u;
			rank[u]++;
		}
	}

	public static int findParent(int node,int parent[]) {
		if(node == parent[node]) return node;
		return parent[node] = findParent(parent[node],parent);
	}

	public static void main(String[] args) {
		

	}

}
