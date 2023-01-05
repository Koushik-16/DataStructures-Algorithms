package test;

import java.util.Scanner;

public class Ans {
	
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

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 String s = sc.next();
		 int m = sc.nextInt();
		 int arr [] = new int[m];
		 for(int i = 0 ; i < m ; i++) arr[i] = sc.nextInt();
		 
		 int ans [] = solve(s,arr);
		 for(int i = 0 ;i < m ; i++) {
			 System.out.print(ans[i] + " ");
		 }

	}

}
