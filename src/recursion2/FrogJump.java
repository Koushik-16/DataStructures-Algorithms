package recursion2;

public class FrogJump {
	
	public static int energy(int a [] , int index) {
		if(index == a.length - 1) return 0;
		if(index == a.length - 2) return Math.abs(a[a.length -1] - a[a.length -2]);
		return Math.min(Math.abs(a[index] - a[index + 1]) + energy(a,index + 1),
				Math.abs(a[index] - a[index + 2]) + energy(a,index + 2));
	}
	
	
	public static int frogJump(int a [] , int n) {
		Integer dp [] = new Integer[n];
		dp[0] = 0;
		for(int i = 1 ; i < n;i++) {
			int fs = dp[i-1] + Math.abs(a[i] - a[i-1]);
			int ss = Integer.MAX_VALUE;
			if(i > 1) ss = dp[i-2] + Math.abs(a[i] - a[i-2]);
			dp[i] = Math.min(fs, ss);
		}
		return dp[n-1];
	}
	
	public static int frogJump2(int n, int heights[]) {
        int iminus1 = 0;
        int iminus2 = 0;
        for(int i = 1; i < n ; i++){
            int fs = iminus1 + Math.abs(heights[i] - heights[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1) ss = iminus2 + Math.abs(heights[i] - heights[i-2]);
            int curr = Math.min(fs,ss);
            iminus2 = iminus1;
            iminus1 = curr;
        }
        return iminus1;
    }   
	
	

	public static void main(String[] args) {
		int a [] = {10, 20 , 30 , 10};
//		System.out.println(energy(a,0));
		System.out.println(frogJump2(a.length,a));
		
	}

}
