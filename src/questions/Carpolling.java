package questions;

import java.util.Arrays;

public class Carpolling {

	 public static boolean carPooling(int[][] trips, int capacity) {
	        Arrays.sort(trips,(a,b) -> a[2] - b[2]);
	        int max = trips[trips.length - 1][2];
	        int a [] = new int[max + 1];
	        
	        for(int i = 0 ; i < trips.length ; i++){
	            a[trips[i][1]] += trips[i][0];
	            a[trips[i][2]] += -trips[i][0];
	        }
	        if(a[0] > capacity) return false;
	        for(int i = 1 ; i < a.length ; i++){
	            a[i] = a[i - 1] + a[i];
	            if(a[i] > capacity) return false;
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
