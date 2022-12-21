package recursion;

public class LetterCombination {
	
	
	public static void letterCombination(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
	   int digit = up.charAt(0) - '0';
	   for(int i = (digit - 2) * 3 ; i < (digit - 1)* 3 ; i++) {
		   char ch = (char)('a'+i);
		   letterCombination(p + ch,up.substring(1));
	   }
	}

	public static void main(String[] args) {
		letterCombination("","23");

	}

}
