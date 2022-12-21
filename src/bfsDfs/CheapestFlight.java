package bfsDfs;

import java.util.*;

public class CheapestFlight {
	
	static class Node {
	        int u;
	        int wt ;
	        int step;
	        Node(){};
	        Node(int u , int wt,int step ){
	            this.u = u;
	            this.wt = wt;
	            this.step = step;
	            
	        }
	    }
	    public static  int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
	        k++;
	        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
	        for(int i = 0 ; i < n ; i++) adj.add(new ArrayList<Node>());
	        for(int i = 0; i < flights.length ; i++){
	            adj.get(flights[i][0]).add(new Node(flights[i][1],flights[i][2],1));
	        }
	        int dis [] = new int[n];
			for(int i = 0 ;i < n ; i++) dis[i] = Integer.MAX_VALUE;
	       
	        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)-> a.wt - b.wt);
	        pq.add(new Node(src,0,0));
	        while(!pq.isEmpty()){
	            Node curr = pq.poll();
	            if(curr.step > k || dis[curr.u] < curr.step) continue;
	            dis[curr.u] = curr.step;
	            if(curr.u == dst) return curr.wt;
	            for(Node it : adj.get(curr.u)){
	                pq.add(new Node(it.u,it.wt + curr.wt,curr.step + 1));
	            }
	            
	        }
	      
	        return -1;
	    }

	public static void main(String[] args) {
	

	}

}
