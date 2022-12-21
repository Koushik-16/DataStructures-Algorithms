package searching.sorting;

import java.util.ArrayList;

public class Union {
	
	
	public static ArrayList<Integer> union(int [] a , int [] b ){
		ArrayList<Integer> output = new ArrayList<>();
		int i = 0, j = 0;
		while( i < a.length && j < b.length) {
			if(a[i] == b[j]) {
				if(output.size() > 0 && output.get(output.size() -1) != a[i]) {
				    output.add(a[i]);
				}
				else if(output.size() == 0) {
					 output.add(a[i]);
				}
				i++;
				j++;
			}
			else if(a[i] < b[j]) {
				if(output.size() > 0 && output.get(output.size() -1) != a[i]) {
				    output.add(a[i]);
				}
				else if(output.size() == 0) {
					 output.add(a[i]);
				}
				i++;
			} else {
				if(output.size() > 0 && output.get(output.size() -1) != b[j]) {
				     output.add(b[j]);
				}
				else if(output.size() == 0) {
					 output.add(b[j]);
				}
				j++;
			}
		}
		while(i < a.length) {
				if( output.get(output.size() -1) != a[i]) {
				    output.add(a[i]);
				}
				i++;
		}
		while(j < b.length) {
			if( output.get(output.size() -1) != b[i]) {
			    output.add(b[i]);
			}
			j++;
	}	
		return output;
	}

	public static void main(String[] args) {
		

	}

}
