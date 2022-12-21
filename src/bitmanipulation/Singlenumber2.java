package bitmanipulation;

public class Singlenumber2 {
	
	public static int Singlenumber2(int [] A) {
		int ones = 0 ;
		int twos = 0 ;
		for(int i = 0 ; i < A.length; i++) {
			ones = (ones^A[i])&(~twos);
			twos = (twos^A[i])&(~ones);
		}
		return ones;
	}

	public static void main(String[] args) {
		int [] A = {2, 2, 2, 3};
		System.out.println(Singlenumber2(A));
	}

}
