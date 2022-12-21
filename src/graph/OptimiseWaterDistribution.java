package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class OptimiseWaterDistribution {
	
	static class Pair {
		int v ;
		int wt;
		Pair(){};
		Pair(int v , int wt){
			this.v = v;
			this.wt = wt;
		}
		
	}
	
	public static int cost(int n , int well [], int pipes [][]) {
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for(int i = 0 ; i <= n ; i++) adj.add(new ArrayList<Pair>());
		for(int i = 0 ; i < pipes.length ;i++) {
			int u = pipes[i][0];
			int v = pipes[i][1];
			int wt = pipes[i][2];
			adj.get(u).add(new Pair(v,wt));
			adj.get(v).add(new Pair(u,wt));
		}
		
		for(int i= 1; i <= n; i++) {
			adj.get(i).add(new Pair(0,well[i-1]));
			adj.get(0).add(new Pair(i,well[i-1]));
		}
		
		int ans = 0;
		boolean visited [] = new boolean[n+ 1];
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.wt - b.wt);
		pq.add(new Pair(0,0));
		while(!pq.isEmpty()) {
			Pair rem = pq.remove();
			if(visited[rem.v] == true) continue;
			ans += rem.wt;
			visited[rem.v] = true;
			ArrayList<Pair> nbr = adj.get(rem.v);
			for(Pair it : nbr) {
				if(visited[it.v]== false) pq.add(it);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
	

	}

}
