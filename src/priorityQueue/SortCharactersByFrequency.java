package priorityQueue;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
	
	public static String sortCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
        	char curr = pq.remove();
        	for(int i  = 0 ; i < map.get(curr); i++) {
        		sb.append(curr);
        	}
        }
        return sb.toString();
	}

	public static void main(String[] args) {
		

	}

}
