package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Rectangle {
	
public static int[] countRectangles(int[][] r, int[][] p) {
	int n = r.length;
	int m = p.length;
	   HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
	   for(int i = 0; i < n ; i++) {
		  map.computeIfAbsent(r[i][1], k -> new ArrayList<>());
		  map.get(r[i][1]).add(r[i][0]);
	   }
	   for(int key : map.keySet()) {
		   Collections.sort(map.get(key));
	   }
	   int ans [] = new int[m];
	   for(int i = 0 ; i < m ;i++) {
		   int hight = p[i][1];
		   int width = p[i][0];
		   int count =0;
		   for(int j = hight; j <= 100 ; j++) {
			   if(map.containsKey(j)) {
				   count += helper(map.get(j),width);
			   }
		   }
		   ans[i] = count;
	   }
	   return ans;
    }

	private static int helper(ArrayList<Integer> a, int target) {
	     int low = 0;
	     int high = a.size() - 1;
	     if(target > a.get(high)) return 0;
	     if(target < a.get(low)) return a.size();
	     int ans = 0;
	     while(low <= high) {
	    	 int mid = (low + high) /2;
	    	 if(a.get(mid) >= target) {
	    		 ans = mid;
	    		 high = mid - 1;
	    	 }else low = mid + 1;
	     }
	     return a.size() - ans;
}

	public static void main(String[] args) {
		

	}

}
