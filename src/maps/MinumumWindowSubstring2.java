package maps;

import java.util.HashMap;
import java.util.HashSet;

public class MinumumWindowSubstring2 {
	
	
	public static int minWindow(String str)  {
		int length = str.length();
		
		HashSet<Character> unique = new HashSet<>();
		for(int i = 0  ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			unique.add(ch);
}
		int i = -1;
		int j = 1;
		HashMap<Character, Integer> map = new HashMap<>();
		while(true) {
			boolean flag1 = false;
			boolean flag2 = false;
			while(i < str.length() -1 && map.size() < unique.size()) {
				i++;
				char ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) +1);
				flag1 = true;
			}
			
			while(j < i && map.size() == unique.size()) {
				int potlen = i - j;
			 length = Math.min(length, potlen);
			 j++;
			 char ch = str.charAt(j);
			 if(map.get(ch) == 1) {
				 map.remove(ch);
			 } else {
				 map.put(ch, map.get(ch) -1);
			 }
				flag2 = true;
			}
			if(flag1 == false && flag2 == false) {
				break;
			}
		}	
		return length;
	}

	public static void main(String[] args) {
		

	}

}
