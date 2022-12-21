package strings;

import java.util.Random;

public class TestCase {
	
	public static char fun() {
		Random r = new Random();
		char c = (char)(r.nextInt(26) + 'a');
		return c;
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000 ; i++) {
			char ch = fun();
			sb.append(ch);
		}
		System.out.println(sb.toString());

	}

}
