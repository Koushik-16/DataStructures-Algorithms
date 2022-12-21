package maps;

import java.util.HashMap;

public class FirstNonRepetingCharacter {
	
	char firstNonRepetingCharacter (String s) {
		HashMap<Character, Integer> char_counts = new HashMap<>();
		for(int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if(char_counts.containsKey(c)) {
				char_counts.put(c,char_counts.get(c) +1) ;
			} else {
				char_counts.put(c, 1);
            }
		}
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i); 
			if(char_counts.get(c) == 1) return c;
		}
		return '_';
	}
	

}
