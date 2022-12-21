package graph;
import java.util.*;
public class UsefulEdges {
	
	static class Node{
		int v;
		int weight;
		Node(){}
		Node(int v , int weight){
		     this.v = v;
		     this.weight = weight;
		}
	}
	
	public static int minDistance(int n , int edges [][], int src , int des, int extra [][]) {
		ArrayList<ArrayList<Node>> adj = new ArrayList<>();
		for(int i = 0 ; i<= n; i++) adj.add(new ArrayList<>());
		for(int i = 0; i < edges.length ; i++) {
			adj.get(edges[i][0]).add(new Node(edges[i][1],edges[i][2]));
			adj.get(edges[i][1]).add(new Node(edges[i][0],edges[i][2]));
		}
		int dis1 []  = new int[n + 1];
		int dis2 [] = new int[n + 1];
		fillDistance(n,dis1,adj,src);
		fillDistance(n,dis2,adj,des);
		
		long maxDis = dis1[des];
		
		for(int i = 0 ; i < extra.length ; i++) {
			int u = extra[i][0];
			int v = extra[i][1];
			int w = extra[i][2];
			if(u > n || v > n) continue;
			long disv = Math.min(dis1[v], dis1[u] + w);
			long disu = Math.min(dis1[u], dis1[v] + w);
			maxDis = Math.min(maxDis, disv + dis2[v]);
			maxDis = Math.min(maxDis, disu + dis2[u]);
		}
		if(maxDis >= Integer.MAX_VALUE) return   -1;
		else return (int)maxDis;
	}

	public static void fillDistance(int n, int[] dis, ArrayList<ArrayList<Node>> adj, int src) {
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[src] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.weight - b.weight);
		pq.add(new Node(src,0));
		while(!pq.isEmpty()) {
			Node curr = pq.poll();
			for(Node it : adj.get(curr.v)) {
				if(dis[curr.v] + it.weight < dis[it.v]) {
					dis[it.v] = dis[curr.v] + it.weight;
					pq.add(new Node(it.v,dis[it.v]));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		

	}

}
