package arrays;

import java.util.Arrays;

public class PairWithGivenDifference {
	
	public static boolean FindPair(int [] a , int n) {
		Arrays.sort(a);
		
		int i = 0;
		int j = 1;
		while(i < a.length && j < a.length ) {
			if(a[j] - a[i] < n) {
				j++;
			} else if( a[j] - a[i] == n) {
				System.out.println("pair found "+ a[j] + " ,"+ a[i]);
				return true;
			} else i++;
		}
		System.out.println("no such pair exist");
		return false;
			}

	public static void main(String[] args) {
		int a [] = { 20, 500, 1000, 200};
		int n = 0;
		System.out.println(FindPair(a,n));

	}

}
