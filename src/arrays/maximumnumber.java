package arrays;

import java.util.*;

public class maximumnumber {
	static String largestnumber(int [] x) {
		int n = x.length;
		String [] s = new String[n];
		for(int i = 0; i < n; i++) 
			s[i] = String.valueOf(x[i]);
			Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b) );
			
			StringBuilder sb = new StringBuilder();
			for(String str : s)
			sb.append(str);
			String result = sb.toString();
			return result.startsWith("0")? "0" : result;	
		}
	public static void main(String[] args) {
		
		int[] a = {3, 9, 7, 5, 8};
		System.out.println(largestnumber(a));

	}
}

