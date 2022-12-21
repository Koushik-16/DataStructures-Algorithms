package fenwickTree;

public class TwoDBit {
	
	int fen [][];
	int arr [][];
	
	public void preProcess() {
		for(int i = 1; i < arr.length ; i++) {
			for(int j = 1; j < arr[0].length ; j++) {
				update(i,j,arr[i][j]);
			}
		}
	}
	
	public void update(int x , int y , int delta) {
		int xdash = x;
		while(xdash < fen.length) {
			int ydash = y;
			while(ydash < fen[0].length) {
				fen[xdash][ydash] += delta;
				ydash += (ydash & -ydash);
			}
			xdash += (xdash & -xdash);
		}
	}
	
	public int  query(int x1, int y1 ,int x2 , int y2 ) {
		return prefixSum(x2,y2) - prefixSum(x2-1,y1) - prefixSum(x1 - 1, y2) + prefixSum(x1- 1, y1 - 1);
	}
	
	public int prefixSum(int x , int y) {
		int sum = 0;
		int xdash = x;
		while(xdash > 0) {
		   int ydash = y;
		   while(ydash > 0) {
			   sum += fen[xdash][ydash];
			   ydash -= (ydash & -ydash);
		   }
		   xdash -= (xdash & -xdash);   
		}
		return sum;
	}

	public static void main(String[] args) {
		

	}

}
