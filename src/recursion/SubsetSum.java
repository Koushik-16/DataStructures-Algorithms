package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
	
	public static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int N){
		ArrayList<Integer> ans = new ArrayList<>();
		getSubset(arr,N,0,0,ans);
		Collections.sort(ans);
		return ans;
	}
	private static void getSubset(ArrayList<Integer> arr, int N, int index, int sum, ArrayList<Integer> ans) {
	   if(index == N) {
		   ans.add(sum);
		   return;
	   }
	   getSubset(arr,N,index+1,sum + arr.get(index),ans);
		getSubset(arr,N,index + 1,sum,ans);
	}
	
	public static boolean  equalsum(int a [],int index, int subsum , int totalsum) {
		if(index >= a.length || subsum > totalsum / 2) return false;
		if(subsum == (totalsum/2)) return true;
		boolean p  = equalsum(a,index+1,subsum + a[index] , totalsum);
		boolean np = equalsum(a,index+1,subsum , totalsum);
		return (p||np);
	}
	
	public static boolean canPart(int a []) {
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++){
			sum += a[i];
		}
		if(sum %2 ==1) return false;
		return equalsum(a,0,0,sum);
	}
	
	public static void main(String[] args) {
		int a [] = {11,13};
		System.out.println(canPart(a));
			
		
	}

}
