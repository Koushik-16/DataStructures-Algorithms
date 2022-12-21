package vectorAndStacks;

import java.util.Stack;

public class ReverseString {
	
	
	public static String reverseParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != ')'){
                st.push(ch);
            }else {
                StringBuilder sb = new StringBuilder();
                while(st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
                for(int j = 0 ; j < sb.length() ;j++) {
			       st.push(sb.charAt(j));
		         }
                
            }
        }
        while(st.size() > 0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
