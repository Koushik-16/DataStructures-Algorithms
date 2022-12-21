package vectorAndStacks;

import java.util.Stack;

public class GetMin {
	
	    Stack<Integer>st = new Stack<Integer>();
	    int min;
	    public void push(int x)   {
	        if(st.empty())    {
	            min = x;
	            st.push(x);
	            return;
	        }
	        if(x<min) {
	            st.push(2*x-min);
	            min = x;
	        }   
	        else
	            st.push(x);
	    }

	    public void pop()    {
	        if(!st.empty()) {
	            int top = st.pop();
	            if(top < min) {
	                min = 2*min-top;
	            }
	        }
	    }

	    public int top()    {
	        if(st.empty())
	            return -1;
	        int t = st.peek();
	        if(t<min)
	            return min;
	        return t;
	    }

	    public int getMin()     {
	        if(!st.empty())
	            return min;
	        return -1;
	    }

	public static void main(String[] args) {
		

	}

}
