package maps;

import java.util.HashMap;

public class LongestSubarrayOfKSum {
	
	 public  int lenOfLongSubarr(int[] arr, int n, int k)  {
         HashMap<Integer, Integer> map = new HashMap<>();
         int sum = 0, maxLen = 0;
         for (int i = 0; i < n; i++) {
              sum += arr[i];
              if (sum == k)
                  maxLen = Math.max(maxLen, i + 1);
              if (!map.containsKey(sum)) {
                  map.put(sum, i);
              }
              if (map.containsKey(sum - k)) {
                  if (maxLen < (i - map.get(sum - k)))
                      maxLen = Math.max(maxLen, i - map.get(sum - k));
              }
         }
          
         return maxLen;            
  }

	public static void main(String[] args) {
		

	}

}
