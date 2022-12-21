package greedyAlgorithm;

import java.util.Arrays;

public class MinPlatform {
	
	public static int minPlatform(int start [], int end[]) {
		int n = start.length;
		Arrays.sort(start);
		Arrays.sort(end);
		int i = 1;
		int j = 0;
		int platform = 1;
		int ans = 1;
		while(i < n && j < n) {
			if(start[i] <= end[j]) {
				platform++;
				i++;
			}
			else if(start[i] > end[j]) {
				platform --;
				j++;
			}
			ans = Math.max(platform, ans);
		}
		return ans;
	}

	public static void main(String[] args) {
		
	}

}
