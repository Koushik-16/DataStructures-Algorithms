package cp;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public  static int longest(int[] a) {
		Arrays.sort(a);
		int curr [] = new int [a.length];
		curr[0] = 1;
		for(int i =1 ; i < a.length ; i++) {
			if(a[i] > curr[i-1]) {
				curr[i] = curr[i-1] + 1;
			}else if(a[i] == curr[i-1]) {
				curr[i] = curr[i-1];
			}
		}
		return curr[a.length- 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  int t = sc.nextInt();
		  int k = 1;
		  while(k <= t) {
			  int n = sc.nextInt();
			  int a [] = new int[n];
			  for(int i= 0 ; i < n ; i++) a[i] = sc.nextInt();
			  System.out.print("Case #" + k + ": ");
			  int ans = longest(a);
			  System.out.println(ans);
			  k++;
		  }

	}

	

}
