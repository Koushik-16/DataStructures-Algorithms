package vectorAndStacks;
import java.util.*;

public class OneThreeTwoPattern {
	
	 public static  boolean find132pattern(int[] nums) {
	        int n = nums.length;
	        int ls [] = new int [n];
	        ls[0] = nums[0];
	        for(int i = 1; i < n; i++){
	            ls[i] = Math.min(ls[i-1],nums[i]);
	        }
	        Stack<Integer> st = new Stack<>();
	        for(int j = n - 1; j >= 0 ; j--){
	            while(st.size() > 0 && st.peek() <= ls[j]) st.pop();
	            if(st.size() > 0 && st.peek() > ls[j] && st.peek() < nums[j]) return true;
	            st.push(nums[j]);
	        }
	        return false;
	    }

	public static void main(String[] args) {
		

	}

}
