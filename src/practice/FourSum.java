package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	public static List<List<Integer>> fourSum(int num [], int target) {
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		if(num == null || num.length == 0) return res;
		int n = num.length;
		Arrays.sort(num);
		for(int i = 0 ; i< n ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				int target2 = target - num[i] - num[j];
				int front = j + 1;
				int back = n - 1;
				while(front < back) {
					int twosum = num[front] + num[back];
					if(twosum < target2)  front ++;
					else if (twosum > target2) back --;
					else {
						List<Integer> quad = new ArrayList<>();
						quad.add(num[i]);
						quad.add(num[j]);
						quad.add(num[front]);
						quad.add(num[back]);
						res.add(quad);
						while(front < n && num[front] == quad.get(2)) ++front;
						while(back >= 0 && num[back] ==quad.get(3)) --back;
					}
				}
				while(j + 1 < n && num[j] == num[j + 1]) ++j;
			}
			while(i + 1 < n && num[i] == num[i+1]) ++i;
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
