package maps;

import java.util.HashMap;

public class SubarrayWithXorK {
	
	public static int KXor(int a [], int b) {
		int xor = 0; 
		int count = 0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i = 0 ; i < a.length; i++) {
			xor = xor ^ a[i];
		if(hm.get(xor^b) != null) {
			count += hm.get(xor^b);
		}
		if(xor == b) {
			count ++;
		}
		if(hm.get(xor) != null) {
			hm.put(xor, hm.get(xor)+1);
		} else {
			hm.put(xor, 1);
		}
		}
		return count ;
	}

	public static void main(String[] args) {
		int a []  = {4, 2,2, 6, 4};
    System.out.println(KXor(a,6));
	}

}
