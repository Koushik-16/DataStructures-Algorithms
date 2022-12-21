package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
	
	public static List<List<Integer>> subset2(int [] nums){
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		getsubset(ans,nums,0,new ArrayList<Integer>());
		return ans;
	}

	private static void getsubset(List<List<Integer>> ans, int[] nums, int index, ArrayList<Integer> ds) {
		   ans.add(new ArrayList<>(ds));
		for(int i = index ; i < nums.length ; i++) {
			if(i != index && nums[i] == nums[i- 1] ) continue;
			ds.add(nums[i]);
			getsubset(ans,nums,i + 1,ds);
			ds.remove(ds.size() - 1);
		}
	}

	public static void main(String[] args) {
		int [] a = {1, 2, 2};
		List<List<Integer>> ans = subset2(a);
		System.out.print("[");
		for(int i = 0 ;i < ans.size() -1 ; i++) {
			System.out.print(ans.get(i) + ", ");
		}
		System.out.println(ans.get(ans.size() - 1) + "]");
	}

}
