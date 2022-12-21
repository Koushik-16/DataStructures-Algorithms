package dynamicProgramming;

public class CountSubsequencesofABC {
	
	public static int count(String s) {
		int a  = 0;
		int ab = 0 ;
		int abc  = 0;
		for(int i = 0 ; i < s.length() ;i ++) {
			char ch = s.charAt(i);
			
			if(ch == 'a') {
				a = 2 * a + 1;
			}else if(ch == 'b') {
				ab  = 2 * ab + a;
			}else if(ch == 'c') {
				abc  = abc * 2 + ab;
			}
		}
		return abc;
	}

	public static void main(String[] args) {
		

	}

}
