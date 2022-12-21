package vectorAndStacks;

import java.util.Stack;

public class ScoreOfParentheses {
	
	public static int Score(String S) {
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0 ; i < S.length(); i++) {
			if(S.charAt(i) == '(') {
				st.push(-1);
			} else {
				if(st.peek() == -1) {
					st.pop();
					st.push(1);
				}else {
					int val = 0;
					while(st.peek() != -1) {
						val += st.pop();
					}
					st.pop();
					st.push(2*val);	
				}
			}
		}
		int val = 0;
		while(st.size() > 0) {
			val += st.pop();
		}
		return val;
	}

	public static void main(String[] args) {
		String s = "(()(()))";
		System.out.println(Score(s));

	}

}
