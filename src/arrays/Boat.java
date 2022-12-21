package arrays;

import java.util.Arrays;

public class Boat {

	public static int boat(int [] a, int x , int m) {
		int count = 0;
		Arrays.sort(a);
		int sum = a[0];
		for(int i = 1 ; i < a.length; i++) {
			sum += a[i];
			if(a[i] > m) {
				count ++;
			}
			else if(a[i] == m) {
				count ++;
			}
			
			else if(sum > m) {
				count ++;
				sum = a[i];
			}
		}
		count+= 1;
		return count;
	}
	
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15};
		System.out.println(boat(a,4,20));

	}

}
