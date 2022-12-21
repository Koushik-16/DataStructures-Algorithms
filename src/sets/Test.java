package sets;

import java.util.*;


public class Test {
	
	static class Pair {
	        int x;
	        int y;
	        Pair(int x , int y){
	            this.x = x;
	            this.y = y;
	        }
	        @Override
	    	public boolean equals(Object obj) {
	        	if(obj == null) return false;
	        	Pair that = (Pair) obj;
	        	if(this.x != that.x) return false;
	        	else if(this.y != that.y) return false;
	        	else return true;
	    	}
	        
	        public int hashCode() {
	            return Integer.parseInt(Integer.toString(x) + Integer.toString(y));
	        }
	        
	    }

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		
      
	}

}
