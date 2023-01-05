package test;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public static int [] LPS(String s){
        s = modify(s);
        int lps [] = new int[s.length()];
        int c = 0;
        int r = 0;
        for(int i = 1; i < s.length() - 1; i++){
            int mir = c - (i - c);
            if(r > i) lps[i] = Math.min(lps[mir], r -i);
             while(s.charAt(i + lps[i] + 1) ==  s.charAt(i -lps[i] - 1)){
                 lps[i]++;
             }
             if(i + lps[i] > r){
                 r = i + lps[i];
                 c = i;
             }
        }
        return lps;
        
    }
	
	public static int [] solve(String s , int q []) {
		int [] lps = LPS(s);
		int ans [] = new int[q.length];
		for(int i = 0 ;i < q.length ; i++) {
			int val = q[i] - 1;
			int ind = 2 * val + 2;
			ans[i] = lps[ind];
		}
		return ans;
	}
    
    public static String modify(String s){
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        for(char ch : s.toCharArray()){
            sb.append('#');
            sb.append(ch);
        }
        sb.append('#');
        sb.append('$');
        return sb.toString();
    }
	
	 public static  int func(int low , int high) {
		 Random r = new Random();
		 int result = r.nextInt(high-low) + low;
		 return result;
	 }
	 
	 static String getString(int n) {
	 
	  byte[] array = new byte[100005];
	  new Random().nextBytes(array);
	 
	  String randomString = new String(array, Charset.forName("UTF-8"));
	  StringBuffer r = new StringBuffer();
	  for (int k = 0; k < randomString.length(); k++) {
	 
	   char ch = randomString.charAt(k);
	 
	   if ((ch >= 'a' && ch <= 'z') && (n > 0)) {
	 
	    r.append(ch);
	    n--;
	   }
	  }
	  return r.toString();
	 }
	 
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n);
		String s = getString(n);
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0 ; i < n ; i++) {
//			sb.append('a');
//		}
//		s = sb.toString();
		System.out.println(s);
		System.out.println(m);
		int arr [] = new int[m];
		for(int i = 0; i < m ; i++) {
			arr[i] = func(1,n);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int ans [] = solve(s,arr);
		for(int i = 0 ; i < m ; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
		
		
		
		
		
     }
	
	

}


