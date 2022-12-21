package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
		map.computeIfAbsent(5, k -> new HashSet<>());
		map.get(5).add(9);
		
		
	}

}
