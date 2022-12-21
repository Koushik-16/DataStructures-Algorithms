package maps;

import java.util.TreeMap;
public class MakeCharFreqUnique {
	
	public static  int minDeletion(String s ) {
		int n = s.length();
		int arr [] = new int[26];
		for(int i = 0 ; i < n ; i++) {
			char ch = s.charAt(i);
		    arr[ch - 'a']++;
		}
		TreeMap<Integer,Integer> map = new TreeMap<>((a,b)-> b -a );
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] != 0) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int count = 0;
		while(map.size() > 0) {
			if(map.containsKey(0)) map.remove(0);
			if(map.size() > 0) {
			int curr = map.firstKey();
			int fre = map.get(curr);
			if(fre > 1) {
				map.remove(curr);
				map.put(curr -1, map.getOrDefault(curr-1, 0) + fre -1);
				count+= fre-1;
			
			}else {
				map.remove(curr);
			}
			}
		}
		return count;
	}

	public static void main(String[] args) {
//		System.out.println(minDeletion("abbbcccd"));
		String ans = "37";
		String c = "47";
		System.out.println(ans.compareTo(c));

	}

}
