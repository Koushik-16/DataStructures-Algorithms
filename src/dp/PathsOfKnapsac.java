package dp;

import java.util.ArrayDeque;

public class PathsOfKnapsac {
	static class Pair{
		int i ; 
		int j;
		String psf;
		Pair(int i , int j , String psf){
			this.i = i;
			this.j = j;
			this.psf = psf;
		}
	}
	public void maxValue(int values [] , int weights [], int w ) {
		int dp [][] = new int[values.length +1][w + 1];
		for(int i = 1; i < dp.length ; i++ ) {
			for(int j = 1; j < dp[0].length ; j++) {
				if(j >= weights[i-1]) {
					int rcap = j - weights[i-1];
					dp[i][j] = Math.max(dp[i-1][rcap] + values[i-1], dp[i-1][j]); 
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		 System.out.println(dp[dp.length - 1][dp[0].length -1]);
		 
		 ArrayDeque<Pair> q = new ArrayDeque<>();
		 q.add(new Pair(values.length,w,""));
		 while(q.size() > 0) {
			 Pair rem = q.removeFirst();
			 if(rem.i == 0 || rem.j == 0) {
				 System.out.println(rem.psf);
			 }else {
				 int exc = dp[rem.i -1][rem.j];
				 if(rem.j >= weights[rem.i - 1] ) {
				 int inc = dp[rem.i - 1][rem.j - weights[rem.i - 1]] + values[rem.i - 1];
				 if(dp[rem.i][rem.j] == inc) {
					 q.add(new Pair(rem.i,rem.j - weights[rem.i -1],  (rem.i-1) + " " + rem.psf));
				 }
				 }
				 if(dp[rem.i][rem.j] == exc) {
					 q.add(new Pair(rem.i-1,rem.j, rem.psf ));
				 }
			 }
			 
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
