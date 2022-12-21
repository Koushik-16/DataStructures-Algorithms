package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	public static void combinationSum(int a [], int target, int index,List<List<Integer>> ans , List<Integer> ds ) {
		if(index == a.length) {
			if(target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return ;
		}
		if(a[index] <= target) {
			ds.add(a[index]);
			combinationSum(a,target - a[index], index, ans , ds);
			ds.remove(ds.size() - 1);
		}
		combinationSum(a, target, index + 1, ans , ds);
	}
	
    public static List<List<Integer>> findCombination(int a [], int target) { 	
    	List<List<Integer>> ans = new ArrayList<>();
    	combinationSum(a, target, 0, ans , new ArrayList<Integer>());
		return ans;
	}
		
      public static void main(String[] args) {
	   int a [] = {1, 2,5};
	   List<List<Integer>> res = findCombination(a,5);
	   for(int i = 0 ; i < res.size(); i++) {
		   System.out.println(res.get(i));
	   }
	   
	}
	
}
