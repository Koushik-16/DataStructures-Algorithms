package adv;

import java.util.ArrayList;

public class MatrixExponentiation {
	
	public ArrayList<ArrayList<Integer>> multiplyMatrix(ArrayList<ArrayList<Integer>> a ,ArrayList<ArrayList<Integer>> b){
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int rows = a.size();
		int cols = b.get(0).size();
		for(int i = 0; i < rows ; i++) {
			ArrayList<Integer> curr = new ArrayList<>();
			for(int j = 0; j < cols ; j++) {
				int sum = 0;
				for(int k = 0 ; k < a.get(0).size() ; k++) {
					sum += a.get(i).get(k) * b.get(k).get(j);
				}
				curr.add(sum);
			}
			ans.add(curr);
		}
		return ans;
	}
	
	public ArrayList<ArrayList<Integer>> matrixExp(ArrayList<ArrayList<Integer>> a, int n){
		if(n == 0) {
			int size = a.size();
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			for(int i = 0; i < n ; i++) {
				ArrayList<Integer> curr = new ArrayList<>();
				for(int j = 0 ; j < n ; j++) {
					if(i == j) curr.add(1);
					else curr.add(0);
				}
				ans.add(curr);
			}
		}
		if(n == 1) return a;
		
		ArrayList<ArrayList<Integer>> temp = matrixExp(a,n/2);
		ArrayList<ArrayList<Integer>> ans = multiplyMatrix(temp,temp);
		if((n&1) == 1) {
			ans = multiplyMatrix(ans,a);
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		

	}

}
