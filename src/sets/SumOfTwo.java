package sets;

import java.util.HashSet;

public class SumOfTwo {
	
	static boolean sumOfTwo (int [] a, int[] b, int v) {
		HashSet <Integer> x = new HashSet();
		for(int i = 0; i< a.length; i++) {
			int difference = v- a[i];
			x.add(difference);
		}
		
		for ( int i = 0; i< b.length; i++) {
			if(x.contains(b[i])) return true;
		}
		return false ;
	}
	public static void main(String[] args) {
		
		int [] a = { 1, 2, 3, 4, 5};
		int [] b = {5, 7 ,9, 3, 6};
		
		int v = 12;
		
		System.out.println(sumOfTwo(a, b, v));
		
		}
		
	}


