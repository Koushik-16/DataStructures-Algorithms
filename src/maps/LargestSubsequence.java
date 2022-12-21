package maps;

import java.util.HashSet;
import java.util.Set;

public class LargestSubsequence {
	
	public static int LargestSubsequence(int a[]) {
		Set<Integer> hs = new HashSet<>();
		int length = 0;
		for(int i = 0 ; i < a.length; i++) {
			hs.add(a[i]);
		}
		for(int i = 0 ; i < a.length; i++) {
			if(!hs.contains(a[i] - 1)) {
				int currentNum = a[i];
				int currentStreak = 1;
				
			while(hs.contains(currentNum +1)) {
				currentNum += 1;
				currentStreak += 1;
			}
			length = Math.max(currentStreak, length);
			}
		}
		return length;
	}

	public static void main(String[] args) {
		int a [] = {101 , 100 , 102 , 1 , 4, 3, 2, 5};
		System.out.println(LargestSubsequence(a));

	}

}
