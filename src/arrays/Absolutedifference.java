package arrays;

import java.util.Vector;

public class Absolutedifference {
	
	static int Absolutedifference(int [] a) {
		
			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			for(int i = 0; i < a.length; i++) {
				max1 = Math.max(max1, a[i] - i);
				max2 = Math.max(max2, a[i] + i);
				
				min1 = Math.min(min1, a[i] - i);
				min2 = Math.min(min2, a[i] + i);
				
				
		}
			return Math.max(max1 - min1, max2 - min2);
			
	}

	public static void main(String[] args) {
		
		int [] a = {-98, -5, 37, -97, 38, 22, 70, 42, 61, 84};
		
		System.out.println(Absolutedifference(a));

	}

}
