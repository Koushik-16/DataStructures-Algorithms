package vectorAndStacks;

import java.util.Stack;

public class SubarrayRamgeSum {
	
	 public long subArrayRanges(int[] nums) {
	        long ans = 0;
	        int n = nums.length;
	        int leftmax [] = new int[n];
	        int leftmin [] = new int[n];
	        int rightmax [] = new int[n];
	        int rightmin [] = new int[n];
	        findrightmax(nums,rightmax);
	        findleftmax(nums,leftmax);
	        findleftmin(nums,leftmin);
	        findrightmin(nums,rightmin);
	        
	        for(int i = 0 ; i < n ; i++){
	            int rmin = rightmin[i] == -1 ? n : rightmin[i];
	            int min = (i -leftmin[i]) * (rmin - i);
	            int rmax = rightmax[i] == -1 ? n : rightmax[i];
	            int max = (i - leftmax[i]) * (rmax - i);
	            ans += ((long)nums[i] * (max - min));
	            
	        }
	        
	        return ans;
	    }
	    public void findrightmax(int nums [] , int ans []){
	        Stack<Integer> st = new Stack<>();
	        int n = nums.length;
	        for(int i = n - 1; i >= 0 ; i-- ){
	            while(st.size() > 0 && nums[st.peek()] < nums[i]) st.pop();
	            ans[i] = st.size() > 0 ? st.peek() : -1;
	            st.push(i);
	        }
	    }
	    
	    public void findleftmax(int nums [] , int ans []){
	        Stack<Integer> st = new Stack<>();
	        int n = nums.length;
	        for(int i = 0; i < n ; i++ ){
	            while(st.size() > 0 && nums[st.peek()] <= nums[i]) st.pop();
	            ans[i] = st.size() > 0 ? st.peek() : -1;
	            st.push(i);
	        }
	    }
	    
	    public void findleftmin(int nums [] , int ans []){
	        Stack<Integer> st = new Stack<>();
	        int n = nums.length;
	        for(int i = 0 ; i < n ; i++){
	            while(st.size() > 0 && nums[st.peek()] >= nums[i]) st.pop();
	            ans[i] = st.size() > 0 ? st.peek() : -1;
	            st.push(i);
	        }
	    }
	    
	    public void findrightmin(int nums [] , int ans []){
	        Stack<Integer> st = new Stack<>();
	        int n = nums.length;
	        for(int i = n - 1; i >= 0 ; i-- ){
	            while(st.size() > 0 && nums[st.peek()] > nums[i]) st.pop();
	            ans[i] = st.size() > 0 ? st.peek() : -1;
	            st.push(i);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
