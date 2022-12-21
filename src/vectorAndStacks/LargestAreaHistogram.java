package vectorAndStacks;

import java.util.Stack;

public class LargestAreaHistogram {
	
	public static int LargestArea(int [] heights) {
		 int n = heights.length; 
	        Stack<Integer> st = new Stack<>();
	        int leftSmall[] = new int[n]; 
	        int rightSmall[] = new int[n]; 
	        for(int i = 0;i<n;i++) {
	            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
	                st.pop(); 
	            }
	            
	            if(st.isEmpty()) leftSmall[i] = 0; 
	            else leftSmall[i] = st.peek() + 1; 
	            st.push(i); 
	        }
	        // clear the stack to be re-used
	        st = new Stack<>();
	        
	        for(int i = n-1;i>=0;i--) {
	            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
	                st.pop(); 
	            }
	            if(st.isEmpty()) rightSmall[i] = n-1; 
	            else rightSmall[i] = st.peek() - 1;
	            
	            st.push(i); 
	        }
	        int maxA = 0; 
	        for(int i = 0;i<n;i++) {
	            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
	        }
	        return maxA; 
	        
	    }
	public int largestRectangleArea(int[] heights) {
        int n = heights.length; 
        Stack<Integer> st = new Stack<>();
        int maxA = 0; 
        for(int i = 0;i<=n;i++) {
            while(!st.isEmpty() && (i==n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.pop()];
                int width; 
                if(st.isEmpty()) width = i; 
                else width = i - st.peek() - 1;                 
                maxA = Math.max(maxA, width * height); 
            }
            st.push(i); 
        }
        return maxA;
    }
	
	public static void main(String[] args) {
		int a [] = {1,1};
		System.out.println(LargestArea(a));

	}

}
