package maps;

import java.util.HashSet;

public class LargestSubarrayWithContiniousElements {
	
	public static int length(int arr []) {
		int n = arr.length;
		int ans = 0;
		for(int i= 0 ; i < n; i++) {
			int min = arr[i];
			int max = arr[i];
			HashSet<Integer> set = new HashSet<>();
			set.add(arr[i]);
			for(int j = i + 1 ; j < n; j++) {
				if(set.contains(arr[j])) break;
				set.add(arr[j]);
				max = Math.max(max, arr[j]);
				min = Math.min(min, arr[j]);
				if(max - min ==  j-i) ans = Math.max(ans, j-i+1);
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		

	}

}
