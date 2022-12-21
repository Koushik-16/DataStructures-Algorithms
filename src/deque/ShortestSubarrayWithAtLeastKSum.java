package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestSubarrayWithAtLeastKSum {
	
	public static  int shortestSubarray(int[] arr, int k) {
       int n = arr.length;
       int res = n + 1;
       long prefSum [] = new long[n + 1];
       for(int i = 0 ;i < n ; i++) {
    	   prefSum[i + 1] = prefSum[i] + arr[i];
       }
       Deque<Integer> dq = new ArrayDeque<>();
       for(int i =0 ; i < n + 1; i++) {
    	   while(dq.size() > 0 && prefSum[i] - prefSum[dq.peekFirst()] >= k )
    		   res = Math.min(res, i - dq.pollFirst());
    	   while(dq.size() > 0 && prefSum[i] <= prefSum[dq.peekLast()])
    		   dq.pollLast();
    	   
    	  dq.add(i);
       }
       return res <= n ? res : -1;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
