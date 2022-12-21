package questions;

import java.util.Arrays;

public class LargestNumber {
	
	  public String largestNumber(final int[] A) {
	        int n = A.length;
			String [] s = new String[n];
			for(int i = 0; i < n; i++) 
				s[i] = String.valueOf(A[i]);
				Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b) );
				
				StringBuilder sb = new StringBuilder();
				for(String str : s)
				sb.append(str);
				String result = sb.toString();
				return result.startsWith("0")? "0" : result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
