package vectorAndStacks;

import java.util.Arrays;
import java.util.Stack;

public class LeftSmaller {
	
	public static int [] leftSmaller(int a []) {
		int res [] = new int[a.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0 ; i < a.length ; i++) {
			while(st.size() > 0 && a[i] < st.peek()) {
				st.pop();
			}
			if(st.size() > 0) {
				res[i] = st.peek();
			} else {
				res[i] = -1;
			}
			st.push(a[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int a [] = {4, 10 , 5, 8 , 20 , 15};
		System.out.println(Arrays.toString(leftSmaller(a)));
	}

}
