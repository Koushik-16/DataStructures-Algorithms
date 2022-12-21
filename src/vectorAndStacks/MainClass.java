package vectorAndStacks;



public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack();
		
		stack.push(12);
		stack.push(124);
		stack.push(52);
		
		int popped = stack.pop();
		
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);

	}

}
