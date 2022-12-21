package cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Try {
	
	static int getPairsCount(int arr[], int n, int k)
	{
	    HashMap<Integer,Integer> m = new HashMap<>();
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	        if (m.containsKey(k - arr[i])) {
	            count += m.get(k - arr[i]);
	        }
	        m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
	    }
	    return count;
	}
	


	public static void main(String[] args) {// TODO Auto-generated method stub
       int arr[] = {5,7,7,4,8,8,6,6,6,10,2,5};
     
       double x = 2.9;
        double b = 10000000000000.5;
      
	}

	

}
