package questions;

import java.util.Arrays;

public class RemoveBeans {
	
	public static long minRemove(int arr []) {
		long n = (long)arr.length;
		Arrays.sort(arr);
		long ans = Long.MAX_VALUE;
		long sum = 0;
		for(int val : arr) sum += val;
		for(long i = 0 ; i < n ;i++) {
			long curr = sum - ((n-i) * (long)arr[(int) i]);
			 ans = Math.min(ans, curr);
		}
		return ans;
	}

	public static void main(String[] args) {
		

	}

}
