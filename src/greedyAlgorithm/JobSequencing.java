package greedyAlgorithm;

import java.util.Arrays;

public class JobSequencing {
	
	static class Job {
		int id;
		int deadline;
		int profit;
		Job(){};
		Job(int id , int deadline, int profit){
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
	}
	
	public static int[] maxProfit(Job arr[], int n) {
		int profit = 0;
		Arrays.sort(arr,(a,b)-> b.profit - a.profit);
		int size = 0;
		for(int i = 0; i < n ; i++) {
			size = Math.max(size, arr[i].deadline);
		}
		int ans [] = new int[size + 1];
		for(int i = 0; i < ans.length ; i++) ans[i] = -1;
		int count = 0;
		for(int i = 0 ; i < n ;i++) {
			for(int j = arr[i].deadline; j > 0; j--) {
				if(ans[j] == -1) {
					ans[j] = arr[i].id;
					count++;
					profit += arr[i].profit;
					break;
				}
			}
		}
		int a [] = new int[2];
		a[0] = count;
		a[1] = profit;
		return a;
	}

	public static void main(String[] args) {
		char a = 'a'; // A = 65
		// a = 97
	int z  = 'Z'; // z = 122, Z = 90
	
		System.out.println(z);

	}

}
