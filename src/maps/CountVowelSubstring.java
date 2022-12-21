package maps;

import java.util.HashMap;

public class CountVowelSubstring {
	
	public static boolean isVowel(char ch) {
	  return (ch == 'a'|| ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' ); 
	}
	
	public static int countAtMostKVowelSubstring(String s, int k) {
		int count = 0 ;
		int n = s.length();
		int i = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int j = 0 ;  j < n ; j++) {
			char ch = s.charAt(j);
			if(!isVowel(ch))  {
				map.clear();
				i = j +1;
				continue;
			}
			map.put(ch, map.getOrDefault(ch,0) + 1);
			while(map.size() > k) {
				if(map.get(s.charAt(i)) > 1)  {
					map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
				} else {
					map.remove(s.charAt(i));
				}
				i++;
			}
			count += j - i + 1;
		}
		return count;
	}
	
	public static int countVowelSubstrings(String s) {
		return countAtMostKVowelSubstring(s,5) - countAtMostKVowelSubstring(s,4);	
		}
	

	public static void main(String[] args) {
		String s = "aeiouu";
         System.out.println(countVowelSubstrings(s));
	}

}
