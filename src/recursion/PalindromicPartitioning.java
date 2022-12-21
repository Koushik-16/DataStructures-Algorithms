package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitioning {
	
	public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        helper(s,0,ans,ds);
        return ans;
    }
    
    public static  void helper(String s , int index , List<List<String>> ans , List<String> ds){
        if(index == s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =index ; i < s.length(); i++ ){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                helper(s,i + 1,ans,ds);
                ds.remove(ds.size() - 1);
            }
        }
    }
    
    public static boolean isPalindrome(String s , int start , int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		

	}

}
