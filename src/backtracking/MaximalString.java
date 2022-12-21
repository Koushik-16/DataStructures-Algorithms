package backtracking;

public class MaximalString {
	
	 public static String solve(String A, int B) {
	        String max [] = new String[1];
	          max[0] = new String(A);
	         helper(A,max,B);
	         return max[0];
	    }

	    public static void helper(String s , String[] max, int k){
	        if(Integer.parseInt(s) > Integer.parseInt(max[0])) max[0] = s;
	        if(k == 0) return ;
	        for(int i = 0 ;i < s.length() - 1; i++){
	            for(int j =  i + 1; j < s.length(); j++){
	                if(s.charAt(i) < s.charAt(j) ){
	                    s = swap(s,i,j);
	                    helper(s,max,k-1);
	                    s = swap(s,i,j);
	                }
	            }
	        }

	    }

	    public static String swap(String s , int i , int j){
	        char ith = s.charAt(i);
	        char jth = s.charAt(j);

	        String left = s.substring(0,i);
	        String mid = s.substring(i +1,j);
	        String right = s.substring(j + 1);
	         return left + jth + mid + ith + right;
	    }

	public static void main(String[] args) {
		

	}

}
