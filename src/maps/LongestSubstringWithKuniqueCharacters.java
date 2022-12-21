package maps;

import java.util.HashMap;

public class LongestSubstringWithKuniqueCharacters {
	
	public static int longestSubstring(String str , int k ) {
		int ans  = 0;
		int i = -1;
		int j = -1;
		HashMap<Character, Integer> map = new HashMap<>();
		
		while(true) {
			
			boolean f1 = false;
			boolean f2 = false ;
			
			while(i < str.length() -1) {
				i++;
				f1 = true;
				char ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch,0) +1);
				
				if(map.size() < k ) {
					continue;
				} else if(map.size() == k) {
					int len = i -j;
					if(len > ans ) {
						ans = len;
					}
				} else {
					break;
				}
			}
			
			while( j < i) {
				j++;
				f2 = true;
				char ch = str.charAt(j);
				if(map.get(ch) == 1) {
					map.remove(ch);
				} else {
					map.put(ch, map.get(ch) -1);
				}
				if(map.size() > k) {
					continue;
				} else if( map.size() == k) {
					int len = i -j;
					if(len > ans ) {
						ans = len;
					}
					break;
				}
			}
			if(f1 == false && f2 == false ) {
				break;
			}
		}
		
		return ans ;
	}
	
	public static int longestSubstring2(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int start = 0;
		int ans = 0;
		int dist = 0;
		for(int i = 0; i < s.length() ; i++) {
			int fq = map.getOrDefault(s.charAt(i), 0);
			if(fq == 0) dist ++;
			map.put(s.charAt(i), fq + 1);
			
			while(dist > 2) {
				fq = map.getOrDefault(s.charAt(start), 0);
				if(fq == 1) {
					map.remove(s.charAt(start));
					dist --;
				} else {
					map.put(s.charAt(start), fq - 1);
				}
				start ++;
			}
			ans = Math.max(ans, i-start+1);
		}
		return ans ;
	}
	

	public static void main(String[] args) {
		

	}

}
