package cp;

import java.util.*;


public class Sec {

	public static void main(String[] args) {
		
		
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while( t -- > 0) {
				int n = sc.nextInt();
				HashSet<Integer> set1 = new HashSet<>();
				HashSet<Integer> set2 = new HashSet<>();
				boolean f1 = true;
				for(int i = 0 ; i < n ; i++) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					if(a == b) f1 = false;
					if(!set1.contains(a) && !set1.contains(b)) {
						set1.add(a);
						set1.add(b);
					}else if(!set2.contains(a) && !set2.contains(b)) {
						set2.add(a);
						set2.add(b);
					}else {
						f1 = false;
					}
				}
				if(f1) System.out.println("yes");
				else System.out.println("no");
				
				
				
			}
			 

	}

}
