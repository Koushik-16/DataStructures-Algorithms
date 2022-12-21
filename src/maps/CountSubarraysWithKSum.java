package maps;

import java.util.HashMap;
import java.util.TreeMap;

public class CountSubarraysWithKSum {
	
	 public int numSubarraysWithSum(int[] nums, int goal) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int ans = 0;
	        int sum = 0;
	        map.put(0,1);
	        for(int i = 0 ;i < nums.length ; i++){
	            sum  += nums[i];
	            if(map.containsKey(sum - goal)){
	                ans += map.get(sum - goal);
	            }
	            map.put(sum,map.getOrDefault(sum,0) + 1);
	        }
	        return ans;
	    }
	 
	 public static void main(String []args) {
		 
		 
		 TreeMap<Integer,Integer>  a = new TreeMap<>();
		
	  
	 }

}
