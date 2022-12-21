package bitmanipulation;

public class FindtwoSingleNumber {
	
	public static void solution(int [] a) {
		int AxorB = 0;
		for( int i = 0 ; i < a.length; i++)	{
			AxorB = AxorB ^ a[i]; // xor all the numbers in the array
		}
		int rmsbm = AxorB & -AxorB; // right most set bit mask
		int A = 0; 
		int B = 0;
		for(int val : a) {
			if((val & rmsbm) == 0) 	{
				A = A ^ val;// if mask & A == 0 then then xor all A with val
			}else {
				B = B ^ val;
			}
		}
		
		if( A < B ) {
			System.out.println(A);
			System.out.println(B);
		}else { 
			System.out.println(B);
			System.out.println(A);
		
		}
	}

	public static void main(String[] args) {
		int [] a = {4,4,2,2,3,3,1,5};
		solution(a);

	}

}
