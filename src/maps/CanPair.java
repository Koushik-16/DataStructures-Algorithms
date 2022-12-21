package maps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class CanPair {

	   public static void canPairs(int ar[], int k)  {
	        if (ar.length % 2 == 1) {
	            System.out.println("false");
	            return ;
	        }
	           HashMap<Integer, Integer> rfmap = new HashMap<>();
	          for(int val : ar) {
	     	 int rem = val %k;
	    	 int of = rfmap.getOrDefault(rem, 0);
		     rfmap.put(rem, of+1);
	 }    
	       for(int val: ar) { 	 
		 int rem = val%k;
		 if(rem == 0 ) {
			 int fq = rfmap.get(rem);
			 if(fq %2 == 1 ) {
				 System.out.println("false");
				 return ;
			 }
		 } else if(2*rem == k) {
			 
			 int fq = rfmap.get(rem);
			 if(fq % 2 == 1 ) {
				 System.out.println("false");
				 return ;
			 }
		 } else {
			 int fq = rfmap.get(rem);
			 int ofq = rfmap.getOrDefault(k -rem,0);
			 if(fq != ofq) {
				 System.out.println("false");
				 return ;
			 }
			 
		 }
	 }
	 System.out.println("true");
	    }
  public static void main(String[] args)   {
	        int arr[] = { 92, 75, 65, 48, 45, 35 };
	        int k = 10;
	        
	        
	        canPairs(arr,k); 
  }
  
	 
}

