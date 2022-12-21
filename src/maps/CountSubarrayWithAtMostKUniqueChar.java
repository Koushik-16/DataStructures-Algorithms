package maps;

import java.util.HashMap;

public class CountSubarrayWithAtMostKUniqueChar {
	
	public static int countSubarray(int [] a,int k ) {
		int j = 0;
		int ans = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i < a.length ; i++) {
			
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			
			while( map.size() > k) {
				if(map.get(a[j]) == 1) map.remove(a[j]);
				else map.put(a[j], map.get(a[j]) -1);
				j++;
			}
			ans += i-j+1;
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int a [] = {1,2,1,2,3};
		System.out.println(countSubarray(a,2) - countSubarray(a,1) );

	}

}
