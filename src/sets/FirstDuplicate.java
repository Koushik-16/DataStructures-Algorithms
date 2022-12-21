package sets;

import java.util.HashSet;

public class FirstDuplicate {
	
	int firstDuplicate(int [] a) {
		HashSet<Integer> seen = new HashSet();
		for(int i = 0; i<a.length; i++) {
			if(seen.contains(a[i])) {
				return a[i];
			} else {
				 seen.add(a[i]);
			}
		}
		return -1;
	}

}
