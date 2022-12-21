package searching.sorting;

import java.util.Arrays;

public class SubsequenceWidth {
	
	public int sumSubseqWidths(int[] nums) {
	       Arrays.sort(nums) ;
	        int n = nums.length;
	        int ans = 0;
	        for(int i = 0 ; i < n ; i++){
	            int max = (1<<(i));
	            int min = (1<<(n - i -1));
	            ans += ((nums[i] * max) - (nums[i] * min));
	        }
	        return ans;
	    }
	
	public static void main(String []args) {
		
	}

}
