package cp;

import java.util.Scanner;

public class Candy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t -- > 0) {
			int n = sc.nextInt();
			long arr [] = new long[n];
			for(int i = 0;i < n ; i++) arr[i] = sc.nextLong();
			long min = Long.MAX_VALUE;
			for(long val : arr) min = Math.min(val, min);
			long ans = 0;
			for(long val : arr) {
				ans += val - min;
			}
			System.out.println(ans);
		}

	}

}
