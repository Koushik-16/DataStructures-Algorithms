package dp;
import java.util.*;

public class JumpGame6 {
	
	public  static int maxRes(int arr [], int k) {
		int n = arr.length;
		int max = arr[0];
		PriorityQueue<int []> pq = new PriorityQueue<>((a,b)-> b[1]- a[1]);
		pq.add(new int [] {0,arr[0]});
		for(int i = 0 ; i < arr.length ; i++) {
			while( i - pq.peek()[0] > k) pq.remove();
			int curr[] = pq.peek();
			max = arr[i] + curr[1];
			pq.add(new int [] {i,max});
		}
		return max;
	}
	
	 public int maxResult(int[] nums, int k) {
	        int n = nums.length ;
	        Deque<Integer> dq = new ArrayDeque<>();
	        
	        dq.offerLast(0);
	        
	        for(int i =1 ;i < nums.length ; i++){
	            nums[i] = nums[i] + nums[dq.peekFirst()];
	            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
	                dq.pollLast();
	            }
	            dq.offerLast(i);
	            while(i - dq.peekFirst() >= k) dq.pollFirst();
	            
	        }
	        return nums[n-1];
	    }

	public static void main(String[] args) {
	

	}

}
