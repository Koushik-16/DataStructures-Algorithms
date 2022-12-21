package recursion2;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
	
	 public List<List<Integer>> combinationSum3(int k, int n) {
	      
	        int a [] = {1,2,3,4,5,6,7,8,9};
	        List<List<Integer>> ans = new ArrayList<>();
	        if(k > n) return ans;
	        ArrayList<Integer> ds = new ArrayList<>();
	        helper(a,0,k,n,ans,ds);
	        return ans;
	    }
	    
	    public void helper(int a [], int index , int k , int n , List<List<Integer>> ans , ArrayList<Integer> ds){
	        if(n == 0){
	            if(ds.size()== k){
	                 ans.add(new ArrayList<>(ds));
	            }  
	            return ;
	        }
	        
	        for(int i = index ; i < a.length; i++){
	            if(a[i] <= n){
	                 ds.add(a[i]);
	                helper(a,i + 1,k,n - a[i],ans,ds);
	               ds.remove(ds.size() -1);
	            }
	        }
	    }

	public static void main(String[] args) {
		

	}

}
