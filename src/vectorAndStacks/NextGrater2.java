package vectorAndStacks;

import java.util.Stack;

public class NextGrater2 {
	
	public static int [] NextGrater2(int [] a) {
		
		int ans [] = new int [a.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i  = a.length -2; i >= 0 ; i--) {
			while(st.size() > 0 && st.peek() <= a[i]) {
				st.pop();
			}
			st.push(a[i]);
		}
		
		for(int i = a.length -1 ; i >= 0; i--) {
			while(st.size() > 0 && a[i] >= st.peek() ) {
				st.pop();
			}
			ans[i] = st.size() > 0 ? st.peek() : -1;
			st.push(a[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		int [] a = {3, 8, 4, 1, 2,10};
		int ans [] = NextGrater2(a);
		for(int x : ans) {
			System.out.print(x +" ,");
		}
		
		

	}

}
