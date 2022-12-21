package maps;

import java.util.HashMap;

public class countZeroSumSubarray {
	
	public static int count(int [] a) {
		int count = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i = 0 ; i < a.length ; i++) {
			 sum += a[i];
			 
			 if(map.getOrDefault(sum, 0) > 0) {
				 count += map.get(sum);
				 map.put(sum, map.get(sum) + 1);
			 } else {
				 map.put(sum, 1);
			 }
			 
		}
		
		return count;
	}
	
	//count subarray Sum Equals K

	 public static int subarraySum(int[] nums, int k) {
	        int cursum = 0;
	        int count = 0 ;
	        HashMap<Integer, Integer> map = new HashMap<>();
	       map.put(0,1);
	        for(int i = 0 ; i < nums.length ; i++){
	            cursum += nums[i];
	            if(map.containsKey(cursum - k)) count += map.get(cursum - k);
	            map.put(cursum , map.getOrDefault(cursum, 0) + 1);
	        }
	        return count;
	    }
	
	public static void main(String[] args) {
		  
		int [] a = {2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};
         
		System.out.println(count(a));
	}

}
