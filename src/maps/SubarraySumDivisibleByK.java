package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySumDivisibleByK {
	
	public static int countSubarray(int a [], int k) {
		int count = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i= 0 ; i< a.length ; i++) {
			sum += a[i];
			int rem = sum % k;
			if(rem < 0) rem += k;
			if(map.containsKey(rem)) count += map.get(rem);
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}
	  return count;
	}

	public static void main(String[] args) {
		
//		int a [] = {4, 5, 0, -2, -3, 1};
//		System.out.println(countSubarray(a,5));
		
	ArrayList<Integer> b = new ArrayList<>();
		 b.add(1);
		 b.add(0, 2);
		 

	}

}






