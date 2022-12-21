package recursion;

public class Occurance {
	
	public static int [] allIndices(int [] a , int x , int idx , int fsf) {
		if(idx == a.length) {
		int result [] = new int [fsf];
		}
		if(a[idx] == x) { 
			int iarr [] = allIndices(a, x, idx+1 , fsf+1);
			iarr[fsf] = idx; 
	      return iarr;
		} else {
			int iarr [] = allIndices(a, x, idx+1 , fsf);
			return iarr;
		}
	}

	public static void main(String[] args) {
		
	}

}
