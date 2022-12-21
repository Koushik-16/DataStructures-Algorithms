package graph;

import java.util.ArrayList;



public class PrimsAlgorithm {
	
static class Node {
		int v;
		int weight;
		Node(int v, int weight){
			this.v = v;
			this.weight = weight;
		}
		int getV() {
			return v;
		}
		int getWeight() {
			return weight;
		}
	}
	
	public void minimumSpanningTree(ArrayList<ArrayList<Node>> adj , int n ) {
		int parent [] = new int[n];
		boolean mst [] = new boolean[n];
		int key [] = new int[n];
	   for(int i  = 0 ;i < n ;i++) {
		   parent[i] = -1;
		   key[i] = Integer.MAX_VALUE;
	   }
	   key[0] = 0;
	   for(int i = 0 ;i < n - 1; i++) {
		   int min = Integer.MAX_VALUE , u = 0;
		   for(int j = 0 ; j < n ; j++) {
			   if(mst[j] == false && key[j] < min) {
				   min = key[j];
				   u = j;
			   }
		   }
		   mst[u] = true;
		   
		   for(Node it : adj.get(u)) {
			   if(mst[it.getV()] == false && it.getWeight() < key[it.getV()]) {
				   parent[it.getV()] = u;
				   key[it.getV()] = it.getWeight();
			   }
		   }
	   }
	   
	   for(int i = 1; i < n ; i++) {
		   System.out.println(parent[i] + "-" + i);
	   }
	   
	}
	
	
	

	public static void main(String[] args) {
		
	}

}
