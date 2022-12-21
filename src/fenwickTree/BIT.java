package fenwickTree;

 class BinaryIndexedTree {
	 
	static  int fen [];
	 
	 BinaryIndexedTree(int n,int arr []){
		 fen = new int[n + 1];
		 preProcess(arr);
	 }
	 
	
	public static void preProcess(int arr []) {
		for(int i = 1; i < arr.length ; i++) {
			update(i,arr[i]);
		}
	}
	
	public int query(int l , int r) {
		return prefixSum(r) - prefixSum(l-1);
	}
	
	public int prefixSum(int ind) {
		int sum = 0;
		while(ind > 0) {
			sum += fen[ind];
			ind -= (ind & -ind);
		}
		return sum;
	}
	
	public static void update(int ind , int delta) {
		while(ind < fen.length) {
			fen[ind] += delta;
			ind += (ind & -ind);
		}
	
	}

	

}
 
 public class BIT{
	 
	 
	 public static void main(String[] args) {
			

		}
 }
