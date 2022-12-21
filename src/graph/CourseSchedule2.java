package graph;
import java.util.*;

public class CourseSchedule2 {
	
	 public static  int[] findOrder(int n, int[][] pre) {
	        int ans [] = new int[n];
	        if(pre == null || pre.length == 0) {
	            for(int i = 0 ; i < n ; i++) ans[i] = i;
	            return ans;
	        }
	        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
	        for(int i = 0 ; i < n ; i++) adj.add(new ArrayList<>());
	        for(int i = 0 ; i < pre.length ; i++){
	           adj.get(pre[i][1]).add(pre[i][0]);
	        }
	        boolean vis [] = new boolean[n];
	        boolean d [] = new boolean[n];
	        for(int i = 0 ; i < n ; i++) {
	            if(vis[i] == false ){
	               if(dfs(adj,vis,i,d) == true) return new int[]{};
	            }
	        }
	        
	        vis = new boolean[n];
	        Stack<Integer> st = new Stack<>();
	        for(int i = 0 ; i < n ; i++){
	            if(vis[i] == false){
	                toposort(adj,vis,i,st);
	            }
	        }
	        int j = 0;
	        while(!st.isEmpty()) ans[j++] = st.pop();
	        
	        return ans;
	        
	    }
	    
	    public static void toposort(ArrayList<ArrayList<Integer>> adj,boolean vis [], int i ,Stack<Integer> st){
	        vis[i] = true;
	        for(Integer it : adj.get(i)){
	            if(vis[it] == false) toposort(adj,vis,it,st);
	        }
	        st.push(i);
	    }
	    
	public static boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean vis [], int i , boolean d []){
	        vis[i] = true;
	        d[i] = true;
	        for(Integer it : adj.get(i)){
	             if(vis[it] == false) {
	                 if(dfs(adj,vis,it,d)) return true;
	             }
	            else if(d[it] == true){
	                return true;
	            }
	        }
	        d[i] = false;
	        return false;
	    }

	public static void main(String[] args) {
		char ch = '2';
		Character.getNumericValue(ch);

	}

}
