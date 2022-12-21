package practice;

public class MinimumWindowSubsequence {
	
	public static String minWindow(String s, String t) {
        int len = helper(0,0,s,t);
        int n = s.length();
        if(len > n) return "";
        for(int i = 0; i < n ; i++){
            if(s.charAt(i) == t.charAt(0)){
      if(i + len <= n && check(s.substring(i,i+ len), t)) {
	  System.out.println(s.substring(i,i + len));
	  return s.substring(i,i + len);
  }
            }
        }
        return "";
    }
    
    public static  int helper(int i , int j , String s , String t){
            if(i <= s.length() && j == t.length()  ){
                return 0;
            }
            if(i >= s.length() && j < t.length()) return 100000;
            int p = 100000;
            if(s.charAt(i) == t.charAt(j)) {
                p = 1 + helper(i+ 1, j + 1, s,t);
            }
            int np = j > 0 ? 1 + helper(i + 1,j ,s, t) : helper(i + 1, j, s,t); 
            return Math.min(p, np);
    }
    
    
    public static boolean check(String s , String t){
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }else i++;
        }
        return j == t.length();
    }

	public static void main(String[] args) {
		String s = minWindow("hello","eo");

	}

}
