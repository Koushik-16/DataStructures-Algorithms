package graph;

import java.util.Arrays;

public class RedundentConnection2 {
	
	public static int findParent(int parent[] , int node) {
		if(node == parent[node]) return node;
		return parent[node] = findParent(parent,parent[node]);
	}
	
	public static boolean union(int rank[], int parent[], int u , int v) {
		u = findParent(parent,u);
		v = findParent(parent,v);
		if(u != v) {
		if(rank[u] < rank[v]) parent[u] = v;
		else if(rank[v] < rank[u]) parent[v] =  u;
		else {
			parent[v] = u;
			rank[u]++;
		}
		return false;
		}else return true;
	}
	
	public static int [] findRedundentEdge(int edges [][]) {
		int n = edges.length;
		int indegree [] = new int[n + 1];
		Arrays.fill(indegree, -1);
		int bl1 = -1;
		int bl2 = -1;
		for(int i = 0 ; i < edges.length ; i++) {
			int u = edges[i][0];
			int v = edges[i][1];
			if(indegree[v] != -1) {
				indegree[v]  = i;
			}else {
				bl1 = i;
				bl2 = indegree[v];
				break;
			}
		}
		int parent [] = new int[n + 1];
		int rank [] = new int[n + 1];
		for(int i = 0 ; i < parent.length ; i++) {
			parent[i] = i;
			rank[i] = 1;
		}
		
		for(int i = 0 ; i < edges.length ; i++) {
			if(i == bl1) continue;
			int u = edges[i][0];
			int v = edges[i][1];
			boolean flag = union(rank,parent,u,v);
			if(flag == true) {
				if(bl1 == -1) {
					return edges[i];
				}else {
				return edges[bl2];
			}
		  }	
		}
		
		return edges[bl1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
