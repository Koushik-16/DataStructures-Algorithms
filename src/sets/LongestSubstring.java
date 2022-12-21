package sets;

import java.util.HashMap;

public class LongestSubstring {
	
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character , Integer> map = new HashMap<>();
		int left = 0 ;
		int right = 0;
		int n = s.length();
		int len = 0;
		while(right < n) {
			if(map.containsKey(s.charAt(right))) {
				left = Math.max(left, map.get(s.charAt(right)) + 1);
			}
			map.put(s.charAt(right), right);
			len = Math.max(len, right - left + 1);
			right ++;
		}
		return len;
	}

	public static void main(String[] args) {
		

	}

}
