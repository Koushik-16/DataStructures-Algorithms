package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
	
	public static List<List<Integer>> permute(int a []) {
		List<List<Integer>> ans = new ArrayList<>();
	    List<Integer> ds = new ArrayList<>();
	    boolean fre [] = new boolean [a.length];
	    recur(a,ds,ans,fre);
	    return ans;		
	}

	public static void recur(int a [],List<Integer> ds, List<List<Integer>> ans , boolean fre[]) {
	 if(ds.size() == a.length) {
		 ans.add(new ArrayList<>(ds));
		 return;
	 }
	 for(int i = 0 ; i <a.length; i++ ) {
		 if(fre[i] == false) {
			 fre[i] = true;
			 ds.add(a[i]);
			 recur(a,ds,ans,fre);
			 ds.remove(ds.size() - 1);
			 fre[i] = false;
		 }
	 }
	}
	
	public static List<List<Integer>> permutation(int a []){
		List<List<Integer>> ans = new ArrayList<>();
		solve(a, 0 , ans);
		return ans;
	}
	
	public static void solve(int a [], int index,List<List<Integer>> ans) {
		if(index == a.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i = 0; i < a.length ; i++) {
				ds.add(a[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i = index ; i< a.length; i++) {
		   swap(a , index , i);
		   solve(a,index + 1, ans);
		   swap(a , index , i);
		}
		
	}
	
	private static void swap(int[] a, int index, int i) {
		int temp = a[index];
		a[index] = a[i];
		a[i] = temp;
	}

	public static void main(String[] args) {
		int a [] = {1, 2, 1};
		List<List<Integer>> ans = permutation(a);
		for(int i = 0 ; i< ans.size() ; i++) {
			System.out.println(ans.get(i));
		}
	}

}
