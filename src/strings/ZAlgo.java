package strings;

public class ZAlgo {
	
	public static int numberOfOccurances(String s , String p) {
		String m = p + "#" + s;
		int z [] = zFunction(m);
		int ans = 0;
		for(int val : z) if(val == p.length()) ans++;
		return ans;
	}

	private static int[] zFunction(String s) {
		int n = s.length();
		int z [] = new int[n];
		int l = 0 , r = 0;
		for(int i = 1 ; i < n ; i++) {
			if(r >= i) z[i] = Math.min(r - i + 1, z[i - l]);
			while(i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) z[i]++;
			if(i + z[i] - 1 > r) {
				r = i + z[i] -1;
				l = i;
			}
		}
		return z;
	}

	public static void main(String[] args) {
		

	}

}
