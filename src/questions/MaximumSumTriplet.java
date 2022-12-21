package questions;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaximumSumTriplet {
	
	 public static int solve(ArrayList<Integer> A) {
	        int n  = A.size();
	        int rightmax [] = new int[n];
	        int sum = Integer.MIN_VALUE;
	        rightmax[n-1] = A.get(n-1);
	        for(int i = n - 2; i >= 0 ; i --){
	           rightmax[i] = Math.max(A.get(i),rightmax[i+1]);
	        }
	        TreeSet<Integer> ts = new TreeSet<>();
	        ts.add(A.get(0));
	        for(int i = 1; i < n- 1 ;i++){
	            Integer lmax = ts.lower(A.get(i));
	            int rmax = rightmax[i+1];
	            if(rmax > A.get(i) && lmax != null){
	                sum = Math.max(sum,A.get(i) + lmax + rmax);
	            }
	            ts.add(A.get(i));
	        }
	      if(sum > Integer.MIN_VALUE) return sum;
	      return 0;
	    }

	public static void main(String[] args) {
		
	}

}
