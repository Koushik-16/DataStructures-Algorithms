package questions;

public class LongestRepeatingCharacter {
	
	public static int length(String s , int k) {
		int j =0 ; 
		int maxCount = 0;
		int length = 0;
		int freq [] = new int[26];
		for(int i = 0 ; i < s.length() ; i++) {
		    char ch = s.charAt(i)	;
		   freq[ch - 'A']++;
		   maxCount = Math.max(maxCount, freq[ch - 'A']);
		   while( i + 1 - maxCount - j > k) {
			   freq[s.charAt(j) - 'A']--;
			   j++;
		   }
		   length = Math.max(length, i - j + 1);
		}
		return length;
	}

	public static void main(String[] args) {
		

	}

}
