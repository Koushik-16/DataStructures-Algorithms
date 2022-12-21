package arrays;

import java.util.Arrays;

public class SortedSquaredArray {
	
	int[] sortedSquaredArray (int [] Array) {
		int [] squre_numbers = new int [Array.length];
		for(int i = 0; i <Array.length; i++) {
			squre_numbers [i] = Array[i] * Array[i];
			
 		}
		Arrays.sort(squre_numbers);
		return squre_numbers;
		}

}
