package arrays;

import java.util.*;

public class longestValidBracket {

	public static int longestValidBracket(String s) {
		
		Stack<Character> ct = new Stack<>();
		Stack<Integer> index = new Stack<>();
		index.add(-1);
		int max = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == '(') {
				ct.add('(');
				index.add(i);
			} else {
				if(!ct.isEmpty() && ct.peek() == '(') {
					ct.pop();
					index.pop();
					max = Math.max(max, i-index.peek());
				} else {
					index.add(i);
				}
			}
			
		}
		return max;	
	}
	
	 public static int longestValidParentheses(String s) {
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
		
		String s ="(()()";
		System.out.println(longestValidBracket(s));
		
	}

}
