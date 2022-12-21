package sets;

import java.util.HashSet;
import java.util.Set;

public class CommonElement {
	
	public static  void  CommonElements(int [] a , int b []) {
		Set<Integer> hs = new HashSet<>();
		for(int i = 0 ;i  < a.length ; i++) {
			hs.add(i);
		}
		for(int i = 0 ; i< b.length; i++) {
			if(hs.contains(b[i])) {
				System.out.print(b[i] + " ,");
				hs.remove(b[i]);
			}
		}
	}
	public static void main(String[] args) {
		int [] a = {1, 1, 1, 2 ,2 ,4, 6, 5};
		int b [] = {1, 1, 2, 2, 2, 5};
             CommonElements(a,b);
             
             
     }

}
