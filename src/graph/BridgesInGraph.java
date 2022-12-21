package graph;

import java.util.*;

public class BridgesInGraph {
	
	public static void bridges(int n, List<List<Integer>> adj) {
		int vis [] = new int[n];
		int time [] = new int[n];
		int low [] = new int [n];
		List<List<Integer>> ans = new ArrayList<>();
		int timer = 0;
		for(int i = 0; i < n; i++) {
			if(vis[i] ==0) {
				dfs(adj,-1,i,low,time,timer,ans,vis);
			}
		}
	}

	public static void dfs(List<List<Integer>> graph,int par,int node,int low [], int time [],int timer,List<List<Integer>> ans,int vis[]){
        vis[node]= 1;
        time[node] = low[node] = timer++;
        for(Integer it : graph.get(node)){
            if(it == par) continue;
            if(vis[it] == 0){
               dfs(graph,node,it,low,time,timer,ans,vis) ;
                low[node] = Math.min(low[node],low[it]);
                if(low[it] > time[node] ){
                    List<Integer> a = new ArrayList<>();
                    a.add(it);
                    a.add(node);
                    ans.add(a);
                }
            }else {
               low[node] = Math.min(low[node],time[it]);
            }
        }
    }
		
	

	public static void main(String[] args) {
		

	}

}
