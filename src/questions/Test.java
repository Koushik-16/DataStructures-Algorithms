package questions;

import java.util.Scanner;

public class Test {

	class Codechef
	{
	    
	     public static int robbery(int[] nums) {
	        int iplush1 = 0;
	        int iplush2 = 0;
	        for(int i = nums.length - 1; i >= 0 ; i--){
	            int curi = Math.max(nums[i] + iplush2 , iplush1);
	             iplush2 = iplush1;
	            iplush1 = curi;
	        }
	        return iplush1;
	    }
		public static void main (String[] args) throws java.lang.Exception	{	
			
		    try {
		        	    
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-- != 0){
	         int size = sc.nextInt();
		    int a [] = new int[size];
		    for(int i = 0 ; i < size; i++){
		        a[i] = sc.nextInt();
		    }
		        int ans = robbery(a);
		        System.out.println(ans);
		    }
		
		} catch (Exception e) { 
		    return;
		    
		}
	}
	}

}
