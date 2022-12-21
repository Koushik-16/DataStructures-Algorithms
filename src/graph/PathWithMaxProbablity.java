package graph;

import java.util.*;

public class PathWithMaxProbablity {
	
static class Node {
			int v;
			double weight;
			Node(int v, double weight){
				this.v = v;
				this.weight = weight;
			}
			int getV() {
				return v;
			}
			double getWeight() {
				return weight;
			}
		}
public static double maxProbability(int n, int[][] edges, double[] succ, int start, int end) {
		    
		    double dis [] = new double[n];
		    for(int i = 0 ; i < n ; i++) dis[i] = 0.0;
		    dis[start] = 1;
		    ArrayList<ArrayList<Node>> adj= new ArrayList<>();
		    for(int i = 0 ; i < n; i++) adj.add(new ArrayList<Node>());
		    for(int i = 0; i < edges.length ; i++){
		        adj.get(edges[i][0]).add(new Node(edges[i][1],succ[i]));
		        adj.get(edges[i][1]).add(new Node(edges[i][0],succ[i]));
		    }
   PriorityQueue<Node> pq = new  PriorityQueue<Node>((a,b) -> Double.compare(b.getWeight(),a.getWeight()));
		    pq.add(new Node(start,1.0));
		        while(!pq.isEmpty()){
		         Node node  = pq.poll();
		            for(Node it : adj.get(node.getV()) ){
		                if(dis[node.getV()] * it.getWeight() > dis[it.getV()]){
		                    dis[it.getV()] = dis[node.getV()] * it.getWeight();
		                    pq.add(new Node(it.getV(),dis[it.getV()]));
		                }
		            }
		        }
		     return dis[end];
		    }

	public static void main(String[] args) {
		

	}

}
