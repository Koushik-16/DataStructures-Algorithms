package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContiniousSubarrayWithabsoluteDifference {
	
	public int longestSubarray(int[] arr, int limit) {
        int ans = 0;
		int start = 0;
		 int end = 0;
		 Deque<Integer> max = new ArrayDeque<>();  //decreasing
		 Deque<Integer> min = new ArrayDeque<>();  // increasing
		 int n = arr.length;
		 while(end < n) {
			 
			 int x = arr[end];
			 while(!max.isEmpty() && arr[max.peekLast()] <= x) max.removeLast();
			 max.addLast(end);
			 
			 while(!min.isEmpty() && arr[min.peekLast()] >= x) min.removeLast();
			 min.addLast(end);
			 
			 
			 if(arr[max.peekFirst()]-arr[min.peekFirst()] > limit) {
				 start++;
				 if(start > max.peekFirst()) max.pollFirst();
				 if(start > min.peekFirst()) min.pollFirst();
			 }else {
				 ans = Math.max(ans, end - start + 1);
				 end++;
			 }
		 }
		 return ans;
    }
	
	public static void main(String [] args) {
		
	}

}
