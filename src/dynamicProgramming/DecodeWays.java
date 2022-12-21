package dynamicProgramming;
import java.util.*;

public class DecodeWays {
	
public static int decodeWays(String s ) {
	HashMap<String ,Integer> map = new HashMap<>();
	return memo(s,map);
}
	
	
	private static int memo(String s, HashMap<String, Integer> map) {
	  if(s.length() == 0) return 1;
	  if(s.charAt(0) == '0') return 0;
	  if(s.length() == 1) return 1;
	  if(map.containsKey(s))  return map.get(s);
	  int res = 0;
	  res += memo(s.substring(1,s.length()),map);
	  if(s.length() >= 2 && Integer.parseInt(s.substring(0, 2)) <= 26)res += memo(s.substring(2,s.length()),map);
	  map.put(s,res);
	  return res;
}
	
	public static int decodeWays_tabu(String s ) {
		if(s.charAt(0) == '0') return 0;
		int n = s.length();
		int dp [] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i <= n ;i++) {
			int value1 = Integer.valueOf(s.substring(i -1,i));
			int value2 = Integer.valueOf(s.substring(i- 2,i));
			if(value1 >=1 && value1 <= 9) dp[i] += dp[i-1];
			if(value2 >= 10 && value2<= 26) dp[i] += dp[i-2];
			
		}
		return dp[n];
		
	}
	
	


	public static void main(String[] args) {
		

	}

}
