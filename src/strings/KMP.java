package strings;

public class KMP {
	
	public int numberOfOccurance(String s , String p) {
		String m = modify(s,p);
		int lps [] = kmp(m);
		int count = 0;
		for(int val : lps) if(val == p.length()) count++;
		return count;
	}

	private int[] kmp(String s) {
		int lps [] = new int[s.length()];
		int i = 1;
		int len = 0;
		while(i < s.length()) {
			if(s.charAt(i) == s.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}else {
				if(len > 0) {
					len = lps[len - 1];
				}else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	private String modify(String s, String p) {
		return p + "#" + s;
	}

	public static void main(String[] args) {
		
	}

}
