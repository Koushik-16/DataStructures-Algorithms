package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Node {
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

public class Dijkastra {
	
	public void shortestPath(ArrayList<ArrayList<Node>> adj , int n , int src) {
		int dis [] = new int[n];
		for(int i = 0 ;i < n ; i++) dis[i] = Integer.MAX_VALUE;
		PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.getWeight() - b.getWeight());
		pq.add(new Node(src,0));
		while(!pq.isEmpty()) {
			Node node  = pq.poll();
			for(Node it : adj.get(node.getV())) {
				if(dis[node.getV()] + it.getWeight() < dis[it.getV()]) {
					dis[it.getV()] = dis[node.getV()] + it.getWeight();
					pq.add(new Node(it.getV(),dis[it.getV()]));
				}
			}
		}
		for(int i = 0 ; i < n ; i++) System.out.print(dis[i]+ " ");
	}
	
	

	public static void main(String[] args) {
	        
	}

}
