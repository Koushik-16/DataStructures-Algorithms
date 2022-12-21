package adv;
import java.util.*;

public class KDistanceInTree {
	static ArrayList<ArrayList<Integer>> adj;
	static long dp [][] = new long[50005][505];
	static long dp2 [][] = new long[50005][505];
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		adj = new ArrayList<>();
		for(int i = 0 ; i <= n ; i++) adj.add(new ArrayList<>());
		for(int i = 1 ; i < n   ; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		dfs(1,0,k);
		dfs2(1,0,k);
		long ans = 0;
		for(int i = 1 ; i <= n ; i++) ans += dp2[i][k];
		System.out.println(ans/2);

	}


	private static void dfs2(int node, int parent, int k) {
		for(int i = 0 ; i <= k ; i++) {
			dp2[node][i] = dp[node][i];
		}
		if(parent != 0) {
			dp2[node][1] += dp2[parent][0];
			for(int i = 2; i <= k ; i++) {
				dp2[node][i] += dp2[parent][i-1];
				dp2[node][i] -= dp[node][i-2];
			}
		}
		for(int child : adj.get(node)) {
			if(child != parent) dfs2(child,node,k);
		}
		
	}


	private static void dfs(int node , int parent , int k) {
		for(int child : adj.get(node)) {
			if(child != parent) dfs(child,node,k);
		}
		dp[node][0] = 1;
		for(int i = 1 ; i <= k ; i++) {
			dp[node][i] = 0;
			for(int child : adj.get(node)) {
				if(child != parent) dp[node][i] += dp[child][i-1];
			}
		}
		
	}
	
	

}
