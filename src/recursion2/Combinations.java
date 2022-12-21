package recursion2;
import java.util.*;

public class Combinations {
	
	
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(1,n,k,list,ans);
        return ans;
    }
    public static void helper(int i , int n , int k , List<Integer> list , List<List<Integer>> ans){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return ;
        }
        
        for(int j = i ; j <= n ;j++){
            list.add(j);
            helper(j +1,n,k,list,ans);
            list.remove(list.size() -1);
        }
    }

	public static void main(String[] args) {
		

	}

}
