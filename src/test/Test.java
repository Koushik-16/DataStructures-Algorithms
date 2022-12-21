package test;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	 public static  int func(int low , int high) {
		 Random r = new Random();
		 int result = r.nextInt(high-low) + low;
		 System.out.print(result + " ");
		 return result;
	 }
	 
	 

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		System.out.println(arr[2]);
		System.out.println(arr[4]);
          }
	
	

	}


