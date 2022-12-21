package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class AlienDictionary {
	
	public static String order(String words []) {
		HashMap<Character,HashSet<Character>> map = new HashMap<>();
		HashMap<Character,Integer> indegree = new HashMap<>();
		for(String s : words) {
			for(char ch : s.toCharArray()) {
				indegree.put(ch, 0);
			}
		}
		
		for(int i = 0 ; i < words.length - 1; i++) {
			String curr = words[i];
			String next = words[i+1];
			int len = Math.min(curr.length(), next.length());
			for(int j = 0 ;  j< len ; j++) {
				char ch1 = curr.charAt(j);
				char ch2 = next.charAt(j);
				if(ch1 != ch2) {
					map.computeIfAbsent(ch1, set -> new HashSet<>());
					map.get(ch1).add(ch2);
					indegree.put(ch2, indegree.getOrDefault(ch2, 0) + 1);
					break;
				}
			}
		}
		
		Queue<Character> q = new LinkedList<>();
		StringBuilder ans = new StringBuilder();
		for(Character ch : indegree.keySet()) {
			if(indegree.get(ch) == 0) q.add(ch);
		}
		while(!q.isEmpty()) {
			char curr = q.poll();
			ans.append(curr);
			if(map.containsKey(curr)) {
			for(Character ch : map.get(curr)) {
				indegree.put(ch, indegree.getOrDefault(ch, 0) - 1);
				if(indegree.get(ch) == 0) q.add(ch);
			}
			}
		}
		if(ans.length() == indegree.size()) {
			return ans.toString();
		}else return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
