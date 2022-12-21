package twoPointer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static List<List<Integer>> triplets(int a [] ) {
		Arrays.sort(a);
		List<List<Integer>> res = new LinkedList<>();
		for(int i = 0 ;i < a.length - 2; i++) {
			if(i == 0 || (i > 0 && a[i] != a[i-1])) {
				int lo = i + 1, hi = a.length -1, sum = 0 - a[i];
				while(lo <= hi) {
					if(a[lo] + a[hi] == sum) {
						res.add(Arrays.asList(a[i],a[lo],a[hi]));
						while(lo < hi && a[lo] == a[lo+1]) lo ++;
						while(lo < hi && a[hi] == a[hi - 1]) hi--;
						lo++; hi--;
					}
					else if (a[lo] + a[hi] < sum) {
						lo++;
					}
					else hi--;
				}
				
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		

	}

}
