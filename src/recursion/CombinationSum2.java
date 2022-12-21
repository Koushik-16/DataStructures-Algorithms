package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	
	public static void findCombination2(int a [] , int index, int target,List<List<Integer>> ds ,ArrayList<Integer> ans) {
		if(target == 0) {
			ds.add(new ArrayList<>(ans));
			return ;
		}
		for(int i = index ; i < a.length ; i++) {
			if(i > index && a[i] == a[i-1]) continue;
				if(a[i] > target) break;
				ans.add(a[i]);
				findCombination2(a,i+1,target - a[i], ds,ans);
				ans.remove(ans.size() - 1);
		}
	}
	
	public static List<List<Integer>> combinationSum2(int a [] , int target){
	     List<List<Integer>> ds = new ArrayList<>();
	     Arrays.sort(a);
	     findCombination2(a,0,target,ds,new ArrayList<>());
	     return ds;
	}

	public static void main(String[] args) {
		int a [] = {1,1,1,1};
		List<List<Integer>> ans = combinationSum2(a,4);
		for(int i = 0 ; i < ans.size() ; i++ ) {
			System.out.println(ans.get(i));
		}

	}

}
