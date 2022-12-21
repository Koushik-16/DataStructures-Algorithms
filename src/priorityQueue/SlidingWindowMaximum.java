package priorityQueue;
import java.util.*;

public class SlidingWindowMaximum {
	
	static class Num {
        int data;
        int index;
        public Num(int data, int index){
            this.data = data;
            this.index = index;
        }
    }
    
    public static  int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Num> queue = new PriorityQueue<>((a,b) -> Integer.compare(b.data, a.data));
        int left = 0;
        int right = 0;
        int[] ans = new int[nums.length - k + 1];
        while(right < nums.length){
			// Add elements in queue if window size is less than k 
            if(right-left < k){
                queue.add(new Num(nums[right], right));
                right++;
            } 
			// If reached at window size k, check the largest number
            if(right-left == k) {
                ans[left++] = queue.peek().data;
            }
			// Remove the highest number if goes out of window
            while(!queue.isEmpty() && queue.peek().index < left){
                queue.poll();
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
