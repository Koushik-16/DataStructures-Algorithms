package cp;

import java.io.*;
import java.util.*;

public class P2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s = br.readLine();
         String [] arr = s.split(" ");
         ArrayList<Integer> a = new ArrayList<>();
         for(int i = 0 ;i < arr.length ; i++) {
        	 a.add(Integer.parseInt(arr[i]));
         }
         Collections.sort(a);
         int min = a.get(0);
         a.remove(0);
         for(int i = 0 ; i < a.size() ; i++) {
        	 for(int j = i + 1; j < a.size() ; j++) {
        		 if(a.get(j) % a.get(i) == 0) {
        			 a.set(i,1);
        		 }
        	 }
         }
         
        long ans = 1;
        for(int i = 0 ; i < a.size() ; i++) {
        	ans *= (long)a.get(i);
        }
        ans += (long)min;
        boolean f = true;
        for(long i = 2 ; i *i <= ans ;i++) {
        	if(ans % i == 0) {
        		f = false;
        		break;
        	}
        }
        
        if(f == true ) System.out.println(ans);
        else System.out.println("None");
        
	}

}
