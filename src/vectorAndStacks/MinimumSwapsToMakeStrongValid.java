package vectorAndStacks;

import java.util.Stack;

public class MinimumSwapsToMakeStrongValid {
	
	public static int minSwaps(String s) {
    Stack<Character> st = new Stack<>();
    for(char ch : s.toCharArray()){
        if(ch == ']'){
        if(st.size() == 0 || st.peek() == ']') st.push(ch);
            else if(st.size() > 0 && st.peek() == '[') st.pop();
        }else st.push(ch);
    }
    return ((st.size()/2) + 1)/2;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
