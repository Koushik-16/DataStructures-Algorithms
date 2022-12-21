package vectorAndStacks;

import java.util.HashMap;
import java.util.Stack;

public class Nge {
	
	public static int [] NextGraterElement(int [] nums , int [] quary) {
		int nge [] =  NextGrater(nums);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0 ; i < nums.length; i++) {
			hm.put(nums[i], nge[i]);
		}
		int ans [] = new int[quary.length];
		for(int i = 0 ; i < quary.length; i++) {
			ans[i] = hm.get(quary[i]);
		}
		return ans;
	}
	
	public static int [] NextGrater(int [] a) {
		int [] nge = new int [a.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i = a.length -1 ; i >= 0; i--) {
			while(st.size() > 0 && a[i] >= st.peek() ) {
				st.pop();
			}
			nge[i] = st.size() > 0 ? st.peek() : -1;
			st.push(a[i]);
		}
		return nge;
	}

	public static void main(String[] args) {
		int a [] = {11, 13, 3, 21 , 25};
		int quary [] = {13, 21, 25};
		int ans [] = NextGrater(a);
         for(int x : ans) {
        	 System.out.print(x + " ,");
         }
	}

}
