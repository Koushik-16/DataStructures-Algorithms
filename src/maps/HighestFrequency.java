package maps;

import java.util.HashMap;

public class HighestFrequency {
	
	public static char HighestFrequency(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(hm.containsKey(ch)) {
				int of = hm.get(ch);
				int nf = of + 1;
				hm.put(ch, nf);
			}else {
				hm.put(ch, 1);
			}
		}
		char max = s.charAt(0);
		int freq = hm.get(s.charAt(0));
		for(int i = 1 ; i < s.length(); i++) {
			char c = s.charAt(i);
			if(hm.get(c) > freq) {
				max = c;
				freq = hm.get(c);
			}	
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "koushik";
		System.out.println(HighestFrequency(s));

	}

}
