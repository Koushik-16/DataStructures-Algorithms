package vectorAndStacks;

import java.util.Stack;

public class DeleteMid {
	
	 static void deleteMid(Stack<Character> st, int n, int curr){

// If stack is empty or all items
// are traversed
if (st.empty() || curr == n)
return;

// Remove current item
char x = st.pop();

// Remove other items
deleteMid(st, n, curr+1);

// Put all items back except middle
if (curr != n/2)
st.push(x);
}

	public static void main(String[] args) {
		

	}

}
