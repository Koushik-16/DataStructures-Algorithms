package cp;


import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

public class Cses {
	
	static int values [];
	static ArrayList<ArrayList<Integer>> adj;
	static int [] lt;
	static int start [];
	static int end [];
	static int time ;
	static  long fen [];
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		values = new int[n + 1];
		for(int i = 1 ; i <= n ; i++) values[i] = sc.nextInt();
		adj = new ArrayList<>();
		for(int i = 0 ; i <= n ; i++) adj.add(new ArrayList<>());
		lt = new int[n + 1];
		start = new int[n + 1];
		end = new int[n + 1];
		time = 0; 
		fen = new long[n + 1];
		for(int i = 1; i <= n - 1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		ulerTour(1,0);
		build();
		
		for(int i = 0; i < q ; i++) {
			int f = sc.nextInt();
			if(f == 1) {
				int node = sc.nextInt();
				int val = sc.nextInt();
				long delta = (long)val - (long)values[node];
				update(start[node],delta);
				values[node] = val;
			}else {
				int root = sc.nextInt();
				int l = start[root];
				int r = end[root];
				long ans = query(l,r);
				System.out.println(ans);
			}
		}
			
		
	}
	
	public static long prefixSum(int ind) {
		long sum = 0;
		while(ind > 0) {
			sum += fen[ind];
			ind -= (ind & -ind);
		}
		return sum;
	}
	
	public static long query(int l , int r) {
		return prefixSum(r) - prefixSum(l-1);
	}
	
	public  static void build() {
		for(int i = 1; i < lt.length ; i++) {
			update(i,lt[i]);
		}
	}
	
	public static void update(int ind , long delta) {
		lt[ind] += delta;
		while(ind < fen.length) {
			fen[ind] += delta;
			ind += (ind & -ind);
		}
	}


	private static void ulerTour(int node, int parent) {
	    start[node] = ++time;
	    lt[time] = values[node];
	    for(Integer it : adj.get(node)) {
	    	if(it != parent) ulerTour(it,node); 
	    }
	    end[node] = time;
	}

}
