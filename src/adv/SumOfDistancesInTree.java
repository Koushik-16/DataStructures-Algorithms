package adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfDistancesInTree {
	
	
	int n;
    List<Set<Integer>> adj = new ArrayList<>();
    int [] count,ans;
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        n = N;
        count = new int[n];
        ans = new int[n];
        Arrays.fill(count,1);
        for(int i = 0 ; i < n ; i++) adj.add(new HashSet<>());
        for(int i = 0; i < edges.length ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        dfs(0,-1);
        dfs2(0,-1);
        return ans;
    }
    
    public void dfs(int node,int parent){
        for(int child : adj.get(node)){
            if(child != parent){
                dfs(child,node);
                count[node] += count[child];
                ans[node] += ans[child] + count[child];
            }
        }
    }
    
    public void dfs2(int node , int parent){
        for(int child : adj.get(node)){
            if(child != parent){
            ans[child] = ans[node] - count[child] + n - count[child];
            dfs2(child,node);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
