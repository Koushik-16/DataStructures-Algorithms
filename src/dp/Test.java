package dp;

import java.util.HashMap;

public class Test {
	
 static class Pair {
	 int x ; 
	 int y ;
	Pair(){};
	Pair(int x , int y ){
		this.x = x;
		this.y = y;
	}
 }
	
	public static int maxArea(int mat [][]) {
		int  n = mat.length;
		int m = mat[0].length;
		int maxi = 0;
		for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0)mat[i][j]=-1;
            }
		}
		HashMap<Integer,Pair> map = new HashMap<>();
		Integer parr [][] = new Integer[n + 1][m + 1];
		for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                parr[i][j]=parr[i-1][j]+parr[i][j-1]+mat[i-1][j-1];
                if(map.get(parr[i][j])!= null){
                Pair a =map.get(parr[i][j]);
                maxi=Math.max(maxi,(i-a.x+1)*(j-a.y+1));
            	}
                 map.putIfAbsent(parr[i][j],new Pair(i,j));
            }
        }
		return maxi;
	}

	public static void main(String[] args) {
		

	}

}
