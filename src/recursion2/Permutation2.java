package recursion2;

import java.util.HashMap;

public class Permutation2 {
	
	public static void permute(int cc , String str, Character [] spots , HashMap<Character,Integer> lasto) {
		if(cc >= str.length()) {
			for(int i = 0;i < spots.length ; i++) {
				System.out.print(spots[i]);
			}
			System.out.println();
			return ;
		}
		
		char ch = str.charAt(cc);
		int lo = lasto.get(ch);
		for(int i = lo + 1 ; i < spots.length ;i++) {
			if(spots[i] == null) {
				spots[i] = ch;
				lasto.put(ch, i);
				permute(cc+ 1, str , spots,lasto);
				spots[i] = null;
				lasto.put(ch, -1);
			}
		}
	}

	public static void main(String[] args) {
	

	}

}
