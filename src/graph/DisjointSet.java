package graph;

public class DisjointSet {
	
	public static int findParent(int parent[] , int node) {
		if(node == parent[node]) return node;
		return parent[node] = findParent(parent,parent[node]);
	}
	
	public static void union(int rank[], int parent[], int u , int v) {
		u = findParent(parent,u);
		v = findParent(parent,v);
		if(rank[u] < rank[v]) parent[u] = v;
		else if(rank[v] < rank[u]) parent[v] =  u;
		else {
			parent[v] = u;
			rank[u]++;
		}
	}

	public static void main(String[] args) {
		int n = 1000;
		int parent [] = new int [n];
		int rank [] = new int[n];
		makeSet(parent,rank, n);
	}
	
	
	public  void union_(int size[], int parent[], int u , int v) {
		u = findParent(parent,u);
		v = findParent(parent,v);
		if(size[u]>=size[v]){
            parent[v]=u;
            size[u]+=size[v];
        }else{
            parent[u]=v;
            size[v]+=size[u];
        }
	}

	private static void makeSet(int[] parent, int[] rank, int n) {
	for(int i = 0 ;i < n ; i++ ) {
		parent[i] = i;
		rank[i]  = 0;
	}
	
		
	}

}
