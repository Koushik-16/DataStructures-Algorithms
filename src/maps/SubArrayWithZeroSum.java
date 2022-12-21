package maps;

import java.util.HashMap;

public class SubArrayWithZeroSum {
	
	public static int LongestSubarray(int [] a) {
		int maxLength = 0;
		int sum = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i < a.length; i++) {
			sum += a[i];
			if(sum == 0) {
				maxLength = Math.max(maxLength, i+1);
			} else {
			  if(map.containsKey(sum)) {
			     int previousindex = map.get(sum); 
			     maxLength = Math.max(maxLength, i - previousindex );
			} else {
			   map.put(sum,i);
			}
		}
	}
		return maxLength;
	}
	
	public static void LongestSubarraywithequaloneZero(int [] a) {
		int start = 0 ;
		int end = -1;
		int currSum = 0;
		for(int i  = 0 ; i < a.length; i++) {
			if(a[i] == 0) {
				a[i] = -1;
			}
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i < a.length; i++) {
			currSum += a[i];
			if(currSum == 0) {
				end = i;
			} else {
				if(map.containsKey(currSum)) {
					int previousindex = map.get(currSum); 
					end = i;
					start = previousindex +1 ;
				} else {
					map.put(currSum, i);
				}
			}
		}
		if(end == -1) {
			System.out.println("Not found");
		} else {
			System.out.println(start +" , "+ end);
		}	
	}
	

	public static void main(String[] args) {
		int a [] = {1, 1, -1, 1, -1 , 1, -1};
		LongestSubarraywithequaloneZero(a);

	}

}
