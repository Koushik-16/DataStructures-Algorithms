package strings;

import java.io.*;
import java.util.*;


public class Test {
	
	public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < order.length(); i++){
            char ch = order.charAt(i);
            map.put(ch,i);
        }
       Character c [] = new Character[s.length()];
       for(int i = 0 ; i < s.length() ; i++) {
    	   c[i] = s.charAt(i);
       }
          Arrays.sort(c,(a,b) -> map.getOrDefault(a,0) - map.getOrDefault(b,0));
        StringBuilder sb = new StringBuilder();
        for(Character ch : c) sb.append(ch);
        return sb.toString();
    }

	boolean canChange(String s, String t) {
        int sl = 0, sr = 0, tl = 0, tr = 0;
        for(char ch : s.toCharArray()) { 
            if(ch == 'L') sl++;
            else if(ch == 'R') sr++;
        }
       
        for(char ch : t.toCharArray()) { 
            if(ch == 'L') tl++;
            else if(ch == 'R') tr++;
        }
        if(sl != tl || sr != tr) return false;
        int l = 0;
        for(int i=0;i< s.length();i++){
            if(t.charAt(i)=='L') l++;
            if(s.charAt(i)=='L') l--;
            if(l<0)return false;
        }
        

        int r=0;
        for(int i=s.length()-1;i>=0;i--){
            if(t.charAt(i)=='R') r++;
            if(s.charAt(i)=='R')  r--;
            if(r<0)return false;
        }
        return true;
    }
    
	
	public static void main(String[] args) throws IOException {
		String s = "a,s,v,s,v";
		String p [] = s.split(",");
		System.out.println(Arrays.toString(p));
		
		
		
		
		 
		}
		
}
