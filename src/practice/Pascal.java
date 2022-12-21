package practice;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
	
	
	public static List<List<Integer>> pascal(int n){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row , pre = null;
		for(int i = 0; i < n ; ++i ) {
			row = new ArrayList<Integer>();
			for(int  j = 0 ; j <= i; ++j) {
				if(j == 0 || j == i) {
					row.add(1);
				}
				else {
					row.add(pre.get(j- 1) + pre.get(j));
				}
			}
			pre = row ;
			res.add(row);
		}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		List<List<Integer>> ans = pascal(5);
		System.out.println(ans);
	}

}
