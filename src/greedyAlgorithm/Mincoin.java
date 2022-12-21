package greedyAlgorithm;

import java.util.Vector;

public class Mincoin {
	
	 static void Mincoin(int v) { 
		Vector<Integer> ans = new Vector<>();
		int demo [] = {1,2, 5, 10, 20, 50, 100, 500, 1000};
		int n = demo.length;
		for(int i = n-1; i >= 0; i--) {
			while(v >= demo[i]) {
				v -= demo[i];
				ans.add(demo[i]);
			}
		}
		for(int i  =0; i < ans.size(); i++) {
			System.out.print(" " + ans.elementAt(i));;
		}
	}

	public static void main(String[] args) {
		
		Mincoin(49);
	}

}
