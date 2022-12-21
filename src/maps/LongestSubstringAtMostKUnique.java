package maps;

import java.util.HashMap;

public class LongestSubstringAtMostKUnique {
	
	public static int length(String str , int k) {
		int i = 0;
		 int j = 0;
		 int ans  = 0;
		 HashMap<Character,Integer> map = new HashMap<>();
		 while( i < str.length()){
		     char ch = str.charAt(i);
		     map.put(ch, map.getOrDefault(ch,0) + 1);
		     while(map.size() > k){
		         char ch2 = str.charAt(j);
		         if(map.get(ch2) == 1) map.remove(ch2);
		         else map.put(ch2,map.getOrDefault(ch2,0) -1);
		         j++;
		     }
		     ans = Math.max(ans,i-j + 1);
		     i++;
		 }
			return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
