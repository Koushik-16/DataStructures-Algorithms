package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class JumpGame6 {
	
	public static int maxResult(int[] nums, int k) {
        int n = nums.length ;
        Deque<Integer> dq = new ArrayDeque<>();
        
        dq.offerLast(0);
        
        for(int i =1 ;i < nums.length ; i++){
            nums[i] = nums[i] + nums[dq.peekFirst()];
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i - dq.peekFirst() >= k) dq.pollFirst();
            
        }
        return nums[n-1];
    }

	public static void main(String[] args) {
		

	}

}
