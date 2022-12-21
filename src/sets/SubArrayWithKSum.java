package sets;

import java.util.*;

public class SubArrayWithKSum {
	
	static boolean subarraywithksum(int [] a, int k) {
		boolean found = false;
		Set<Integer> x = new HashSet<>(); 
		int sum = 0;
		for(int i = 0; i< a.length; i++) {
			x.add(sum);
			sum += a[i];
			if(x.contains(sum - k)) {
				found = true;
				break;
			}
		}
		return found;
	}
	public static void main(String [] args) {
		int [] a = {2, 1, 3, 4, 2};
		int k = 6;
		System.out.println(subarraywithksum(a,k));
	}
}