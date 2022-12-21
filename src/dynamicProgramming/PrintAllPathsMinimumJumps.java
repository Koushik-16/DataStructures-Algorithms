package dynamicProgramming;

import java.util.ArrayDeque;

public class PrintAllPathsMinimumJumps {
	
	static class pair{
		int index;
		int size ;
		int jumps;
		String psf;
		pair(int index , int size , int jumps , String psf){
			this.index = index;
			this.size = size;
			this.jumps = jumps;
			this.psf = psf;
			
		}
	}
	
	public static void printAllPaths(int a []) {
		Integer dp []  = new Integer[a.length]; 
		  dp[dp.length - 1] = 0;
		  for(int i = dp.length - 2 ; i>= 0 ; i--) {
			  int steps = a[i];
			  int min = Integer.MAX_VALUE;
			  for(int j = 1 ; j <= steps && i + j <a.length; j++ ) {
				  if(dp[i + j] != null &&  dp[i+j] < min) {
					  min = dp[i + j];
				  }
			  }
			  if(min != Integer.MAX_VALUE) {
				  dp[i] = min + 1;
			  }
		  }
		  System.out.println(dp[0]);
		  ArrayDeque<pair> q = new ArrayDeque<>();
		  q.add(new pair(0,a[0],dp[0],0 + ""));
		  while(q.size() > 0) {
			  pair rem = q.removeFirst();
			  if(rem.jumps == 0) System.out.println(rem.psf);
			  for(int j = 1 ; j <= rem.size && rem.index + j < a.length; j ++) {
				  if(dp[rem.index + j] != null && dp[rem.index + j] == rem.jumps - 1) {
					  q.add(new pair(rem.index + j,a[rem.index + j],dp[rem.index + j],rem.psf + "->" + rem.index + j));
				  }
			  }
		  }
	}

	public static void main(String[] args) {
		System.out.println('5' - '0');
	}

}
