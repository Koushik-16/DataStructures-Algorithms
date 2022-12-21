package digitDp;

public class SteppingNumbers {
	
	
	int steppingNumbers(int n, int m){
        String s = m + "";
        int a = helper(0,0 , 1, 1 , s);
        if(n == 0) return a;
        else {
          n --;
          String t = n + "";
          int b = helper(0,0,1,1,t);
          return a - b;
        }
        
        
    }
    
    public int helper(int ind , int prev , int leading , int tight , String s){
        if(ind == s.length()) return 1;
        int lb = 0;
        int ub = tight == 1 ? s.charAt(ind) - '0' : 9;
        int ans = 0;
        if(leading == 1){
            for(int i = lb ; i <= ub ; i++){
                int z = i == 0 ? 1 : 0;
                int f = i == ub ? 1 : 0;
                ans += helper(ind + 1, i, leading&z ,tight&f, s);
            }
        }else {
            if(prev  - 1 >= lb && prev - 1 <= ub) {
                 int f = prev - 1 == ub ? 1 : 0;
                ans += helper(ind + 1, prev - 1 , leading , tight&f , s);
            }
            if(prev + 1 >= lb && prev + 1 <= ub){
                 int f = prev  + 1 == ub ? 1 : 0;
                ans += helper(ind + 1, prev +1 , leading , tight&f , s);
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
