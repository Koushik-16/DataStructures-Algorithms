package bfsDfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JumpGame4 {
	
	 public int minJumps(int[] arr) {
	        int n = arr.length ;
	        if(n == 1) return 0;
	        HashMap<Integer, List<Integer>> map = new HashMap<>();
	        for(int i = 0 ; i < n ; i++){
	            map.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
	        }
	        int steps = 0;
	        Queue<Integer> q = new LinkedList<>();
	        q.add(0);
	        while(!q.isEmpty()){
	            int size = q.size();
	            steps ++;
	            for(int i = 0 ; i < size ;i++){
	                int j = q.poll();
	                if(j-1 >= 0  && map.containsKey(arr[j-1])){
	                    q.offer(j-1);
	                }
	                
	                if(j + 1 < n && map.containsKey(arr[j+1])){
	                    if(j+ 1 == n-1) return steps;
	                    q.offer(j + 1);
	                }
	                
	                if(map.containsKey(arr[j])){
	                    for(int k : map.get(arr[j])){
	                        if(k !=j){
	                            if(k == n- 1) return steps;
	                            q.add(k);
	                        }
	                    }
	                }
	                map.remove(arr[j]);
	            }
	        }
	        return steps;
	    }

	public static void main(String[] args) {
		

	}

}
