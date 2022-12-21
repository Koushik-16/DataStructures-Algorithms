package dp;

public class JumpGame2 {
	
	public int canJump(int[] arr) {
        if(arr.length == 1) return 1;
        if(arr[0] == 0) return 0;
        boolean dp [] = new boolean[arr.length];
		dp[0] = true;
		for(int i = 0 ; i < arr.length -1; i++) {
			if(dp[i] == true) {
			int j = 1;
			while(j <= arr[i]) {
				if(j+ i  < arr.length) dp[j+i] = true;
				j++;
			}
		}
		}
		return dp[arr.length - 1] == true ? 1 : 0;
    }

	
	public static void main(String[] args) {
		int a [] = {3,2,1 ,0,4};
		System.out.println(a.length);
//       System.out.println(canJump(a));
	}

}
