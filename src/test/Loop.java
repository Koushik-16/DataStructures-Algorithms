package test;

import java.util.TreeMap;

public class Loop {

	public static void main(String[] args) {
		int arr [] = {2,4,6,8,16,9,5,1,6};
		TreeMap<Integer,Integer> map = new TreeMap<>((a,b) -> b-a);
        for(int val : arr) map.put(val,1);
        for(int key : map.keySet()) {
        	System.out.println(key);
        }

	}

}
