package sets;

import java.util.*;

public class SubArrayWithZeroSum {
	public static boolean zerosum(int [] a) {
		boolean found = false ;
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum += element;
			if(set.contains(sum) ) {
				found = true ;
				break;
			}
			
		}

		return found  ;
	}

      public static void main(String [] args) {
      int [] a = {5 , 1 , 3 , -4 , 2};
      
      System.out.println(zerosum(a));
}
}