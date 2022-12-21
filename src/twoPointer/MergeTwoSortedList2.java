package twoPointer;

import java.util.ArrayList;

public class MergeTwoSortedList2 {
	
	 public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	        int i = a.size() - 1;
	        int j = b.size() - 1;
	        // pos tracks the next slot where value will be placed
	        int pos = a.size() + b.size() - 1;
	        
	        for (int idx = 0; idx < b.size(); idx++) {
	            a.add(0); // increase size of arraylist to accomodate additional values
	        }
	        
	        while (i >=0 && j >= 0) {
	            // maximum value will be the last
	            if (a.get(i) > b.get(j)) {
	                a.set(pos, a.get(i));
	                i--;
	            } else {
	                a.set(pos, b.get(j));
	                j--;
	            }
	            pos--;
	        }
	        
	        // empty remaining list
	        while (i >= 0) {
	            a.set(pos, a.get(i));
	            i--;
	            pos--;
	        }
	        while (j >= 0) {
	            a.set(pos, b.get(j));
	            j--;
	            pos--;
	        }
	    }

	public static void main(String[] args) {
		

	}

}
