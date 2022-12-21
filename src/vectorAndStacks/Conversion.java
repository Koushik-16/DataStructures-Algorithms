package vectorAndStacks;

import java.util.Stack;

public class Conversion {
	
	public static void conversion(String exp) {
		Stack<String> post = new Stack<>();
		Stack<String> pre = new Stack<>();
		Stack<Character> ops = new Stack<>();
		
		for(int i = 0 ; i< exp.length(); i++) {
			char ch = exp.charAt(i);
			if(ch == '(') {
				ops.push(ch);
			} else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch<= 'z') 
					|| (ch >= 'A' && ch <= 'Z')) {
				post.push(ch + "");
				pre.push(ch + "");
			} else if(ch == ')') {
				while(ops.peek() != '(') {
					char op = ops.pop();
					String postv2 = post.pop();
					String postv1 = post.pop();
					String postv = postv1 + postv2 + op;
					post.push(postv);
					
					String prev2 = pre.pop();
					String prev1 = pre.pop();
					String prev = op + prev1 + prev2;
					pre.push(prev);
				}
			   ops.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while( ops.size() > 0 && ops.peek() != '(' && precedance(ch) <= precedance(ops.peek())) {
					char op = ops.pop();
					String postv2 = post.pop();
					String postv1 = post.pop();
					String postv = postv1 + postv2 + op;
					post.push(postv);
					
					String prev2 = pre.pop();
					String prev1 = pre.pop();
					String prev = op + prev1 + prev2 ;
					pre.push(prev);
				}
				ops.push(ch);
				
			}
		}
		while(ops.size() >0) {
			char op = ops.pop();
			String postv2 = post.pop();
			String postv1 = post.pop();
			String postv = postv1 + postv2 + op;
			post.push(postv);
			
			String prev2 = pre.pop();
			String prev1 = pre.pop();
			String prev = op + prev1 + prev2 ;
			pre.push(prev);
		}
		System.out.println(post.pop());
		System.out.println(pre.pop());
	}
	
	public static int precedance(char optor) {
		if(optor == '+') {
			return 1;
		} else if(optor == '-') {
			return 1;
		} else if(optor == '*') {
			return 2;
		} else {
			return 2;
		}
	}

	public static void main(String[] args) {
		String s = "6*3-2";
		conversion(s);
	}

}
