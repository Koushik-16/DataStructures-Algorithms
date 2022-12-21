package maps;

import java.util.HashMap;

public class CommonElement {
	
	public static void CommonElement(int [] a , int [] b) {
		HashMap<Integer , Integer> hm = new HashMap<>();
		for(int i = 0 ; i < a.length ; i++) {
			hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
		}
	for(int i = 0; i < b.length; i++ ) {
			if(hm.containsKey(b[i]) && hm.get(b[i]) > 0) {
				int of = hm.get(b[i]);
				int nf = of-1;
				hm.put(b[i], nf);
				System.out.println(b[i]);
			}
		}
	}	
	public static void main(String[] args) {
		int a[] = {1, 1,  2, 2 ,2 , 3 , 4, 5};
		int b [] = {1, 1,2,-1, 2 ,5,79};
		CommonElement(a,b);

	}

}
