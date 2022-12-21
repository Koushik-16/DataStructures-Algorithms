package graph;
import java.util.*;

public class ShortestAlternatingPath {
	
   static  class Node {
        int val;
        int color; // 0 = red && 1 = blue
        Node(){};
        Node(int val , int color){
            this.val = val;
            this.color = color;
        }
    }
    
 public static int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            adj.add(new ArrayList<>());
        }
     for(int i = 0 ; i < redEdges.length ;i++){
         adj.get(redEdges[i][0]).add(new Node(redEdges[i][1],0));
     }
      for(int i = 0 ; i < blueEdges.length ;i++){
          adj.get(blueEdges[i][0]).add(new Node(blueEdges[i][1],1));
      }
     
     int dis [] = new int[n];
     for(int i = 0 ; i < n ; i++) dis[i] = Integer.MAX_VALUE;
     boolean colorvisited [][]= new boolean[n][2];
    
     
     Queue<int[]> q = new LinkedList<>();
     q.add(new int [] {0,0,-1});
     dis[0] = 0;
     while(!q.isEmpty()){
         int curr [] = q.poll();
         for(Node it : adj.get(curr[0])){
             boolean a = colorvisited[it.val][it.color];
             if(it.color != curr[2] && a == false){
                 if(curr[1] + 1 < dis[it.val]) dis[it.val] = curr[1] + 1;
                 q.add(new int []{it.val,curr[1] + 1,it.color});
                 colorvisited[it.val][it.color] = true;
             }
         }
     }
     
     for(int i =0; i< n ; i++){
         if(dis[i] == Integer.MAX_VALUE) dis[i] = -1;
     }
     
     return dis;
    }

	public static void main(String[] args) {
		

	}

}
