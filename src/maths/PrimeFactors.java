package maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	public static List<Integer> factors(int arr [],int n){
		ArrayList<Integer> ans = new ArrayList<>();
		while(n > 1) {
			ans.add(arr[n]);
			n = n / arr[n];
		}
		return ans;
	}
	
	public static void seive(int arr []) {
		for(int i = 0 ; i < arr.length ; i++) arr[i] = i;
		for(int i = 2; i * i < arr.length ; i++) {
			if(arr[i] == i) {
				for(int j = i * i ; j < arr.length ; j += i) {
					if(arr[j] == j) arr[j] = i;
				}
			}
		}
	}

	public static void main(String[] args) {
		

	}

}
