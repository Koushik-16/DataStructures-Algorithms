package test;

import java.util.Collections;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();  
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		Collections.reverse(st);
		while(st.size() > 0) {
			System.out.println(st.pop());
		}

	}

}
