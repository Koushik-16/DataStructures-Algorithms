package maps;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
	
	public static int length(String str) {
		int len = 0;
		int right = 0;
		int left = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while(right < str.length()) {
			char ch = str.charAt(right);
			if(map.containsKey(ch)) {
				left = Math.max(left, map.get(ch) +1);
			}
			map.put(ch,right);
			len = Math.max(len, right - left +1);
			right ++;
		}
		
		return len;
	}

	public static void main(String[] args) {
		
		String s = "aabcdecaagdfoedghrigg";
		int ans = length(s);
       System.out.println(ans);
	}

}
