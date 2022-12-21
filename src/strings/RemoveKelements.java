package strings;

import java.util.Stack;

public class RemoveKelements {
	
	public static String newDigit(String num, int k) {
		int size = num.length();
		if(k == size) return "0";
		Stack<Character> stack = new Stack();
		int counter = 0;
		while(counter  < size) {
		while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)) {
			stack.pop();
			k--;
		}
		stack.push(num.charAt(counter));
		counter++;
		}
		while(k > 0) 
		{
			stack.pop();
			k--;
		}
			StringBuilder sb = new StringBuilder();
			while(!stack.isEmpty()) 
			{
				char current_char = stack.pop();
				sb.append(current_char);
			}
			sb.reverse();
			while(sb.length() > 1 && sb.charAt(0) == '0') {
				sb.deleteCharAt(0);
			}
			return sb.toString();
	}
	
	public static  String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < num.length(); i++){
            char ch = num.charAt(i);
            while(st.size() > 0 && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0){   
        st.pop();
            k--;
        }
        char ans [] = new char[st.size()];
        for(int i = ans.length - 1 ; i >= 0; i--){
            ans[i] = st.pop();
        }
        int d = 0;
        while(d < ans.length && ans[d] == '0') d++;
        StringBuilder sb = new StringBuilder();
        while(d < ans.length) sb.append(ans[d++]);
        if(sb.length() == 0) sb.append('0');
        return new String(sb);
    }


	public static void main(String[] args) {
		
		String a = "14219";
		System.out.println(newDigit(a,2));
		
	}

}
