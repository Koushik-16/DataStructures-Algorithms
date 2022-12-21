package arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
	
	public static List<Integer> Majority(int a []) {
		int num1  = -1;
		int num2  = -1;
		int count1 = 0;
		int count2 = 0;
		for(int  i =  0 ;  i < a.length ; i++) {
			if(a[i] == num1 ) {
				count1++;
			}else if(a[i] == num2 ) {
				count2++;
			} else if(count1 == 0) {
				num1 = a[i];
				count1 = 1;
			} else if(count2 == 0) {
				num2 = a[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		List<Integer> output = new ArrayList<>();
		count1 = 0 ;
		 count2 = 0;
		 for(int i  =0 ;i < a.length; i++) {
			 if(a[i] == num1) {
				 count1++;
			 } else if(a[i] == num2) {
				 count2++;
			 }
		 }
		 if(count1 > a.length /3) {
			 output.add(num1);
		 }
		 if(count2 > a.length /3) {
			 output.add(num2);
		 }
		return output;
	}

	public static void main(String[] args) {
		int a [] = {1, 1, 11, 2, 2, 22,1, 1,2,1,2};
		List<Integer> ans = Majority(a);
		for(int val : ans) {
			System.out.print(val + " ");
		}

	}

}
