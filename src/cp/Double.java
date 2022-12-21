package cp;

import java.util.ArrayList;
import java.util.Scanner;

public class Double {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int b = 1;
		while(b <= t) {
			String s = sc.next();
			ArrayList<Character> ans = new ArrayList<>();
			int i = 0;
		  while(i < s.length()) {
			   char ch = s.charAt(i);
			   int j = i;
			  int  count = 0;
			   while(j < s.length() && ch == s.charAt(j)) {
				   j++;
				   count++;
			   }
			   if(j < s.length()&& s.charAt(j) > ch) count = count* 2;
			   while(count > 0) {
				   ans.add(ch);
				   count--;
			   }
			   i= j;
		   }
		  StringBuilder sb = new StringBuilder();
		  for(int k  =  0 ; k < ans.size() ; k++) sb.append(ans.get(k));
		  System.out.print("Case #" + b + ": ");
		  System.out.println(sb.toString());
		  b++;
		}
	}

}
