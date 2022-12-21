package questions;

import java.util.ArrayList;

public class CountSmallerAfterIt {
	
	static class Pair{
		int ind;
		int val;
		Pair(int ind,int val){
			this.ind = ind;
			this.val = val;
		}
	}
	
	public static int [] countSmaller(int arr []) {
		int n = arr.length;
		Pair a [] = new Pair[n];
		for(int i = 0 ; i < n; i++) {
			a[i] = new Pair(arr[i],i);
		}
		int ans [] = new int[n];
		mergeSort(a,0,n-1,ans);
		return ans;
		
	}

	private static void mergeSort(Pair[] arr, int low, int high, int[] ans) {
		if(low >= high ) return ;
		else {
			int mid = (low + high)/2;
			mergeSort(arr,low,mid,ans);
			mergeSort(arr,mid+ 1,high,ans);
			merge(arr,low,mid,high,ans);
		}
		
	}

	private static void merge(Pair[] a, int low, int mid, int high, int[] ans) {
		ArrayList<Pair> temp = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		
		while(i <=mid && j <= high) {
			if(a[i].val <= a[j].val) temp.add(a[j++]);
			else {
				ans[a[j].ind] += high - j + 1;
				temp.add(a[i++]);
			}
		}
		
		while(i <= mid) temp.add(a[i++]);
		while(j <= high) temp.add(a[j++]);
		for(int k = low ; k <= high ; k++) {
			a[k] = temp.get(k-low);
		}
		
		
	}

	public static void main(String[] args) {
		

	}

}
