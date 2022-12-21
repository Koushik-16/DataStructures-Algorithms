package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
	
	public static ArrayList<Integer> TwoSum(int a [], int k) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(hm.containsKey( k - a[i])) {
				output.add(i);
				output.add(hm.get(k - a[i]));
				return output;
			} 
			hm.put(a[i], i);
		}
		return output;	
	}

	public static void main(String[] args) {
		int [] a = {2, 7, 11, 15};
		if((int)Math.ceil(2.0) != 2.0) System.out.println(0);
		else System.out.println(1);

	}

}
