package digitDp;

public class JumpingNumber {
	
	 static long res ;
	    
	    static long jumpingNums(long X) {
	        res = Long.MIN_VALUE;
	       String s = X + "";
	        helper(0,-1,s,1,1,0);
	        return res;
	    }
	    
	    public static void helper(int ind , int prev , String s , int tight,int leading,long curr){
	        if(ind == s.length()) {
	            long x = Long.parseLong(s);
	            if(curr <= x) res = Math.max(res,curr);
	            return;
	        }
	        int lb = 0;
	        int ub = tight == 1 ? s.charAt(ind) - '0' : 9;
	        
	        long ans = Long.MIN_VALUE;
	        if(prev == -1 || leading == 1 ){
	            for(int i = lb ; i <= ub ; i++){
	                int t = i == ub ? 1 : 0;
	                int l = i == 0 ? 1 : 0;
	                helper(ind + 1,i,s,tight&t,leading & l,curr * 10 + i);
	            }
	        }else {
	            if(prev + 1 >= lb && prev + 1 <= ub){
	                int val = prev + 1;
	                int t = val == ub ? 1 : 0;
	                 int l = val == 0 ? 1 : 0;
	                helper(ind + 1,val,s,tight&t,leading &l,curr * 10 + val);
	            }
	            if(prev - 1 >= lb && prev -1 <= ub){
	                int val = prev - 1;
	                 int t = val == ub ? 1 : 0;
	                   int l = val == 0 ? 1 : 0;
	                  helper(ind + 1,val,s,tight&t,leading &l,curr * 10 + val);
	            }
	        }
	    }

	public static void main(String[] args) {
		System.out.println(jumpingNums(17501));

	}

}
