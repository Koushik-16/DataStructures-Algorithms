package bfsDfs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ZeroOneBFS {
	
	static class Pair{
		int v;
		int weight;
		Pair(){};
		Pair(int v, int weight){
			this.v = v;
			this.weight = weight;
		}
	}
	
	public static int minCost(ArrayList<ArrayList<Pair>> adj , int n) {
		boolean visited [] = new boolean[n];
		Deque<Pair> dq = new LinkedList<>();
		dq.addLast(new Pair(0,0));
		while(!dq.isEmpty()) {
			Pair curr = dq.removeFirst();
			if(curr.v == n-1) return curr.weight;
			visited[curr.v]= true;
			for(Pair it : adj.get(curr.v)) {
				if(visited[it.v] == false) continue;
				if(it.weight == 0) {
					dq.addFirst(new Pair(it.v,curr.weight));
				}else {
					dq.addLast(new Pair(it.v,curr.weight + 1));
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	

	}

}
