package graph;

import java.util.*;

public class DeleteEdge {
		
	public static  int deleteEdge(int[] arr, int[][] edge) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		int n = arr.length;
		for(int i = 0; i <= n ; i++) adj.add(new ArrayList<>());
		for(int i = 0; i < edge.length ; i++) {
			adj.get(edge[i][0]).add(edge[i][1]);
			adj.get(edge[i][1]).add(edge[i][0]);
		}
		int mod = 1000000007;
		int sum [] = new int[n + 1];
		dfs(adj,1,0,sum,arr);
		long ans = 0;
		for(int i = 2; i <= n ; i++) {
			long ith = (long)sum[i];
			long rem = (long)(sum[1] - ith);
			long curr = ((ith % mod) * (rem % mod)) % mod;
			ans = Math.max(ans, curr);
		}
	  return (int)ans;
    }
	
	public static void dfs(ArrayList<ArrayList<Integer>> adj,int vertex , int par, int sum [],int arr []) {
		sum[vertex] += arr[vertex -1];
		for(Integer child : adj.get(vertex)) {
			if(child == par) continue;
			dfs(adj,child,vertex,sum,arr);
			sum[vertex] += sum[child];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
