package maps;

import java.util.HashMap;

public class NonOverlapingSubarraySum {
	
	public int maxNonOverlapping(int[] a, int target) {
        int currSum = 0;
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			currSum += a[i];
            if(currSum - target == 0 || map.containsKey(currSum - target)) {
			    count++;
                currSum = 0;
                map.clear();
			}
            map.put(currSum, i);	
        }
        return count;
    }

	public static void main(String[] args) {
		

	}

}
