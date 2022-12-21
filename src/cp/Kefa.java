package cp;

import java.util.Arrays;
import java.util.Scanner;

public class Kefa {
	
	static class Pair {
		long m;
		long f;
		
		Pair(long m , long f){
			this.m = m;
			this.f = f;
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 long d = sc.nextInt();
		 Pair des [] = new Pair[n];
		 for(int i = 0; i < n; i++) {
			 long m = sc.nextLong();
			 long f = sc.nextLong();
			 des[i] = new Pair(m,f);
		 }
		 Arrays.sort(des,(a,b) -> Long.compare(a.m, b.m));
		long pref [] = new long[n];
		pref[0] = des[0].f;
		for(int i = 1; i < pref.length ; i++) {
			pref[i] = pref[i-1] + des[i].f;
		}
		
		long money = des[0].m;
		long upper = money + d;
		int ind = lowerBound(upper,des);
		long max = pref[ind - 1];
		for(int i = 1; i < n ; i++) {
			money = des[i].m;
			upper = money + d;
			 ind = lowerBound(upper,des);
			 long curr = pref[ind - 1] - pref[i - 1];
			 max = Math.max(max, curr);
		}
		System.out.println(max);
		 
	     
	}

	private static int lowerBound(long target, Pair [] des) {
		int low = 0;
		int high = des.length - 1;
		while(low <= high) {
			int mid = low + (high - low) /2;
			if(target == des[mid].m) return mid;
			else if(target < des[mid].m) high = mid - 1;
			else low = mid + 1;
		}
		return low;
	}

}
