package vectorAndStacks;

import java.util.Stack;

public class LongestValidParentheses {
	
	public static  int longestValidParentheses(String s) {
	      Stack<Integer> st = new Stack<>();
	        st.push(-1);
	        int res = 0;
	        for(int i = 0 ; i < s.length() ; i++){
	            if(s.charAt(i) == '('){
	               st.push(i);
	            } else {
	                st.pop();
	                if(st.isEmpty()){
	                      st.push(i);                 
	                } else{
	                     res =Math.max(res , i - st.peek());
	                   }  
	            }   
	            }
	 return res;
	            }

	public static void main(String[] args) {
		

	}

}
