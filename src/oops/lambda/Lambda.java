package oops.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lambda {
	static Scanner scn = new Scanner(System.in);
	public static class Pair {
		int v1;
		int v2;
		
		public Pair(int v1, int v2) {
			this.v1 = v1;
			this.v2 = v2;
		}
	}
	
	public static void main(String [] args) {
		int n = scn.nextInt();
		ArrayList<Pair> list = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			
			list.add(new Pair(a,b));
		}
		Collections.sort(list, (a,b)-> {
			return a.v1 - b.v1;   // sort in increasing order of v1
		});
		for(int i = 0 ; i < n ; i++) {
			Pair p = list.get(i);
			System.out.println(p.v1 + " ," + p.v2);
		}
	}
}
