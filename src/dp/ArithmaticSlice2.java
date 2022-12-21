package dp;

import java.util.HashMap;

public class ArithmaticSlice2 {

	 public int numberOfArithmeticSlices(int[] nums) {
	       int ans = 0;
	        HashMap<Integer,Integer> maps [] = new HashMap[nums.length];
	        for(int i = 0; i < nums.length ; i++) maps[i] = new HashMap<>();
	        for(int i = 1 ; i < maps.length ; i++) {
	        	for(int j = 0 ; j < i ; j++) {
	        		long diff = (long)nums[i] - (long)nums[j];
	                if(diff <= Integer.MIN_VALUE || diff >= Integer.MAX_VALUE) continue;
	    	maps[i].put((int)diff, maps[i].getOrDefault((int)diff,0) + maps[j].getOrDefault((int)diff, 0) + 1);
	        		ans += maps[j].getOrDefault((int)diff, 0);
	        	}
	        }
	        return ans;
	    }
	
	public static void main(String[] args) {
		

	}

}
