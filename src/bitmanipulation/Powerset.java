package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Powerset {
	
	public static  List<List<Integer>> subsets(int[] nums) {
	      int n = nums.length;
	        List<List<Integer>> ans = new ArrayList<>();
	        for(int i = 0 ; i < (1<<n) ; i++){
	            List<Integer> a = new ArrayList<>();
	            for(int j = 0 ; j < n ; j++){
	                if((i&(1<<j)) != 0){
	                    a.add(nums[j]);
	                }
	            }
	            ans.add(a);
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		

	}

}
