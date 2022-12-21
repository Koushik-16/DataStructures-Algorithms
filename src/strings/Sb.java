package strings;

import java.util.Arrays;

public class Sb {
	
	public static boolean isPalindrome(String s) {
		if(s == null || s.length() == 0) return true;
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		while(i <= j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		
//		StringBuilder builder = new StringBuilder();
//		for(int i = 0 ; i < 26 ; i++) {
//			char ch = (char)('a' + i);
//			builder.append(ch);
//		}
//         System.out.println(builder.toString());
//         System.out.println(builder.reverse());
//		String name = "Koushik Dandapat";
//		System.out.println(Arrays.toString(name.toCharArray()));
//		System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.indexOf('a'));
//        System.out.println(name.lastIndexOf('a'));
//		System.out.println(name.strip());
//		System.out.println(name.trim());
//		System.out.println(Arrays.toString(name.split(" ")));
		StringBuilder sb = new StringBuilder();
		sb.append('a');
		String  s =new String(sb) ; 
		System.out.println(s);
	}

}
