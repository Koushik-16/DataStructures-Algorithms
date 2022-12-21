package arrays;

import java.util.*;

public class LeftRotation {
	
	public static void main(String[] args) {
		
		int a [] = {1, 2, 3, 4, 5};
		int d  = 3;
		int rotArray [] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			int newIndex = (i + a.length - d)%a.length;
			rotArray[newIndex] = a[i];
		}
		for(int i = 0; i<rotArray.length; i++) {
			System.out.print(rotArray[i] + " ");
		}
	}
}