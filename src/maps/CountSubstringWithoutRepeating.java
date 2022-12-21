package maps;

import java.util.HashMap;

public class CountSubstringWithoutRepeating {
	
	public static int count(String str) {
		int ans = 0 ;
		HashMap<Character ,Integer> map = new HashMap<>();
		int i  = -1;
		int j = -1;
		while(true) {
			boolean f1 = false;
			boolean f2 = false;
			
			while( i < str.length() -1) {
				i++;
				char ch = str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0) + 1);
				
				if(map.get(ch) == 2) {
					break;
				} else {
					ans += i -j;
				}
				f1 = true;
			}
			
			while(j < i) {
				j++;
				char ch = str.charAt(j);
				map.put(ch, map.get(ch) -1);
				if(map.get(ch) == 1) {
					ans += i -j;
					break;
				}
				f2 = true;
			}
			if( f1 == false && f2 == false) {
				break;
			}
		}	
		return ans;
	}

	public static void main(String[] args) {
		

	}

}
