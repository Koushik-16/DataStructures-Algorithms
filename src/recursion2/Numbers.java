package recursion2;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	
	public static  List<Integer> lexicalOrder(int n){
		List<Integer> ans = new ArrayList<>();
       for(int i = 1; i <= 9 ; i++) helper(n,i,ans);
		return ans;
	}

	public  static void helper(int n, int i, List<Integer> ans) {
		if(i > n) return ;
        ans.add(i);
        for(int j = 0; j <= 9 ; j++){
            helper(n,i * 10 + j,ans);
        }
		
	}

	public static void main(String[] args) {
		List<Integer> ans = lexicalOrder(23);
		System.out.println(ans);
		
	}

}
