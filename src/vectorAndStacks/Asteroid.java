package vectorAndStacks;

import java.util.Stack;

public class Asteroid {
	
	public static int[] asteroidCollision(int[] asteroids) {
	   Stack<Integer> stack = new Stack<>();
	   for (int asteroid : asteroids) {
	     if (asteroid < 0) {
	        while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
	          stack.pop();
	        }
	        if (!stack.isEmpty() && stack.peek() > 0) {
	          if (stack.peek() == Math.abs(asteroid)) {
	            stack.pop();
	          }
	        }
	        else {
	          stack.push(asteroid);
	        }
	      }
	      else {
	        stack.push(asteroid);
	      }
	    }
	    int[] state = new int[stack.size()];
	    for (int i = state.length - 1; i >= 0; i--) {
	      state[i] = stack.pop();
	    }
	    return state;
	  }
	
	public static void main(String[] args) {
		int a [] = {5, 10 , -5};
		int result [] = asteroidCollision(a);
		for(int val : result) {
			System.out.print(val +" ,");
		}

	}

}
