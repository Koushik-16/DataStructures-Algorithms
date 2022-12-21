package vectorAndStacks;

import java.util.Stack;

public class sortStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> input = new Stack<>();
		input.push(2);
		input.push(0);
		input.push(1);
		input.push(4);
		input.push(5);
		Stack<Integer> tempStack = sortstack(input);
		while(!tempStack.isEmpty()) {
			System.out.println(tempStack.pop());
		}
		
	}
	 public static Stack<Integer> sortstack(Stack<Integer> input) { 
Stack<Integer> tmpStack = new Stack<Integer>(); 
while(!input.isEmpty()) { 

int tmp = input.pop(); 
while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) { 
input.push(tmpStack.pop()); 
} 

tmpStack.push(tmp); 
} 
return tmpStack; 
} 

}
