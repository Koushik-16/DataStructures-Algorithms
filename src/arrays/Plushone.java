package arrays;

import java.util.*;


public class Plushone {
	
	 static int [] plushone(int[] arr) {
		
		for(int i = arr.length -1; i >= 0; i--) {
			if(arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		int[] result = new int [arr.length + 1];
		result[0] = 1;
		return  result;
	}
	 
	 
	 public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	        int i = 0;
	        while(i < A.size() && A.get(i) == 0){
	            A.remove(i);
	        }
	        int carry = 1;
	        int sum = 0;
	        for( i = A.size() -1; i >= 0; i--){
	            sum = A.get(i) + carry;
	            A.set(i,sum % 10);
	            carry = sum /10;
	            if(carry == 0) break;
	        }
	        if(carry != 0) A.add(0,carry);
	        return A;
	    }
	 
	 public static void main(String[] args) {
		 
         int [] a = {1, 2, 3, 9 };
	      System.out.println(Arrays.toString(plushone(a)));
		 
	 }

}
