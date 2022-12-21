package backtracking;

import java.util.List;

public class MColoringGraph {
	
	public static boolean mColoring(List<Integer> [] g ,int [] color, int i , int m) {
		int n = g.length;
		if(solve(g,i,color,n,m)) return true;
		else return false;
	}

	private static boolean solve(List<Integer>[] g, int node, int[] color, int n, int m) {
		 if(node == n) return true;
		 
		 for(int i = 1; i <= m ; i++) {
			 if(isSafe(g,color,node,n,i)) {
				 color[node] = i;
				 if(solve(g,node + 1,color,n,m)) return true;
				 color[i] = 0;
			 }
		 }
		return false;
	}

	private static boolean isSafe(List<Integer>[] g, int[] color, int node, int n, int col) {
		for(int it : g[node]) {
			if(color[it] == col)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		

	}

}
