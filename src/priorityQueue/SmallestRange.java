package priorityQueue;

import java.util.List;
import java.util.PriorityQueue;

public class SmallestRange {
	
	
	public static int [] range(List<List<Integer>> nums) {
		
		//0 -> value;
		// 1 -> row;
		// 2 -> col;
		PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.size() ;i++) {
			pq.add(new int [] {nums.get(i).get(0),i,0});
			max  = Math.max(max, nums.get(i).get(0));
		}
		int ans [] = {-100000,100000};
		while(true) {
			
			int curr [] = pq.poll();
			int prevRange = ans[1] - ans[0] + 1;
			int currRange = max - curr[0] + 1;
			if(currRange < prevRange) {
				ans[0] = curr[0];
				ans[1] = max;
			}
			
		   int ind  = curr[2];
		   if(ind + 1 >= nums.get(curr[1]).size()) {
			   break;
		   }else {
			   pq.add(new int [] {nums.get(curr[1]).get(ind + 1),curr[1],ind+1});
			   max = Math.max(max, nums.get(curr[1]).get(ind + 1));
		   }
			
			
		}
		return ans;
		
		
	}

	public static void main(String[] args) {
		

	}

}
