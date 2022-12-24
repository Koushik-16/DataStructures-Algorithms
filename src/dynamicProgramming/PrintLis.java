package dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class PrintLis {
	
	
	public static int lis(int arr []) {
		int ans = 0;
		int n = arr.length;
		int dp [] = new int[n];
		for(int i = 0 ; i <  n; i++) {
			int max = 0;
			for(int j = 0; j < i ; j++) {
				if(dp[j] > max && arr[j] < arr[i]) max = dp[j];
			}
			dp[i] = max + 1;
			ans = Math.max(ans, dp[i]);
		}
		
		for(int i = 0; i < n ; i++) if(dp[i] == ans) printLis(i,dp,arr);
		
		
		return ans;
	}

	private static void printLis(int i, int[] dp, int[] arr) {
		ArrayList<Integer> lis = new ArrayList<>();
		int length = dp[i] - 1;
		int last = arr[i];
		lis.add(last);
		while(i >= 0 && length > 0) {
			if(dp[i] == length && arr[i] < last) {
				lis.add(arr[i]);
				last = arr[i];
				length--;
			}
			i--;
		}
		Collections.reverse(lis);
		System.out.println(lis.toString());
		
	}

	public static void main(String[] args) {
         int arr [] = {1,5,2,6,7,3,4,8};
         lis(arr);

	}

}
