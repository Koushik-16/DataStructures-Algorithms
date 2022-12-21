package bfsDfs;

import java.util.*;

public class BusRoutes {
	
	public int numBusesToDestination(int[][] routes, int source, int target) {
        int n = routes.length;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            for(int j  = 0 ; j < routes[i].length ; j++){
                int busStop = routes[i][j];
                ArrayList<Integer> bus = map.getOrDefault(busStop,new ArrayList<>());
                bus.add(i);
                map.put(busStop,bus);
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> busVisited = new HashSet<>();
        HashSet<Integer> stopVisited = new HashSet<>();
        q.add(source);
        stopVisited.add(source);
        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size -- > 0){
                int curr = q.remove();
                if(curr == target ) return level;
                ArrayList<Integer> buses = map.get(curr);
                for(int bus : buses){
                    if(busVisited.contains(bus)) continue;
                    int arr [] = routes[bus];
                    for(int busStop : arr ){
                        if(stopVisited.contains(busStop)) continue;
                        q.add(busStop);
                        stopVisited.add(busStop);
                        
                    }
                    busVisited.add(bus);
                }
            }
            level++;
        }
        return -1;
    }
	
	public static void main(String []args) {
		
	}

}
