package dynamicProgramming;

public class CountBinaryStrings {
	
	public static int stringCount(int length) {
		int oldones = 1;
		int oldzeros = 1;
		
		for(int i = 2; i <= length ; i++) {
			int newzeros = oldones;
			int newones  = oldzeros + oldones;
			
			oldones = newones;
			oldzeros = newzeros;
		}
		return oldzeros + oldones;
	}

	public static void main(String[] args) {
		System.out.println(stringCount(6));
	}

}
