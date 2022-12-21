package practice;

import java.util.Arrays;
import java.util.Stack;

public class Nge2 {
	
	public static int [] Nge2(int a []) {
		int n = a.length;
		int nge []= new int [a.length];
		Stack<Integer> st = new Stack<>();
		for(int i = (2* a.length) - 1; i >= 0; i-- ) {
			while(st.size() > 0 && st.peek() <= a[i % n]) st.pop();
		nge[i % n] = st.size() > 0 ? st.peek() : -1;
		st.push(a[i %n]);
		}
		return nge;
	}

	public static void main(String[] args) {
		int a [] = {2, 10 , 12, 1, 11};
      int ans []= Nge2(a);
      System.out.println(Arrays.toString(ans));
	}

}
