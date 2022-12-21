package adv;

import java.util.*;

public class BookOfEvil {
	
	static int dp1 [] ;
	static int dp2 [] ;

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			boolean ef [] = new boolean [n+ 1];
			for(int i = 0; i < m ; i++) {
				int node = sc.nextInt();
				ef[node] = true;
			}
			ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
			for(int i = 0 ;i < n+ 1 ; i++) adj.add(new ArrayList<>());
			for(int i = 1 ; i < n ; i++ ) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				adj.get(u).add(v);
				adj.get(v).add(u);
			}
			dp1 = new int[n+1];
			dp2 = new int[n+1];
			Arrays.fill(dp1, -1);
			Arrays.fill(dp2, -1);
			for(int i = 0 ; i < dp2.length ; i++) {
				if(ef[i]) dp2[i] = 0;
			}
			dfs(1,-1,ef,adj);
			dfs2(1,-1,ef,adj);
			int count = 0;
			for(int i =1 ; i <= n ; i++) {
				if(dp1[i] <= d && dp2[i] <= d ) count++;
			}
			System.out.println(count);
			
		}
		
		
	
	

	private static void dfs2(int node, int parent, boolean[] ef, ArrayList<ArrayList<Integer>> adj) {
		int max1 = -1, max2 = -1;
		for(int child : adj.get(node)) {
			if(child == parent) continue;
			if(dp1[child] > max1) {
				max2 = max1;
				max1 = dp1[child];
			}
			else if(dp1[child] > max2) max2 = dp1[child]; 
		}
		
		for(int child : adj.get(node)) {
			if(child == parent) continue;
			int sibOfChild = dp1[child] ==  max1  ? max2 : max1 ;
			if(sibOfChild != -1) sibOfChild += 2;
			dp2[child] = sibOfChild ;
			if(dp2[node] != -1) dp2[child] = Math.max(dp2[child], dp2[node] + 1);
			if(ef[child]) dp2[child] = Math.max(dp2[child], 0);
			dfs2(child,node,ef,adj);
		}
		
		
	}


	private static int dfs(int node, int parent, boolean[] ef, ArrayList<ArrayList<Integer>> adj) {
		if(ef[node]) dp1[node] = 0;
		for(int child : adj.get(node)) {
			if(child == parent) continue;
			int  ans = dfs(child,node,ef,adj);
			if(ans > -1 ) dp1[node] = Math.max(dp1[node], ans+1);
		}
		return dp1[node];
	}


	
		

}

	
