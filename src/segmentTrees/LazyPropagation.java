package segmentTrees;

public class LazyPropagation {
	
	static class SGTree{
		
		int seg[],lazy[];
		
		public SGTree(int n) {
			seg = new int[4*n];
			lazy = new int[4*n];
		}
		
		public void build(int ind , int low , int high , int arr []) {
			if(low == high) {
	    		seg[ind] = arr[low];
	    		return ;
	    	}
	    	int mid = (low + high)>>1;
	    	build(2 * ind + 1,low,mid,arr);
	    	build(2 * ind + 2,mid + 1,high ,arr);
	    	seg[ind] = seg[2*ind +1] + seg[2*ind + 2];
		}
		
		public void update(int ind , int low , int high , int l , int r, int val) {
			// update the previous remaining updates 
			if(lazy[ind] != 0) {
				seg[ind] += (high - low + 1) * lazy[ind];
				if(low != high) { // propagate down
					lazy[2 * ind + 1] += lazy[ind];
					lazy[2 * ind + 2] += lazy[ind];
				}
				lazy[ind] = 0;
			}
			
			// no overlap
			if(high < l || low > r) return ;
			//complete overlap
			if(low >= l && high <= r) {
				seg[ind] += (high - low + 1) * val;
				if(low != high) {
					lazy[2 *ind + 1] += val;
					lazy[2 *ind + 2] += val;
				}
				return ;
			}
			
			//partial overlap
			int mid = (low + high)>>1;
			update(2 *ind + 1,low , mid , l , r , val);
			update(2 *ind + 2,mid + 1 , high , l , r , val);
			seg[ind] = seg[2*ind +1] + seg[2*ind + 2];
			
			
		}
		
		public int query(int ind , int low , int high , int l , int r) {
			// update the previous remaining updates 
			if(lazy[ind] != 0) {
				seg[ind] += (high - low + 1) * lazy[ind];
				if(low != high) { // propagate down
					lazy[2 * ind + 1] += lazy[ind];
					lazy[2 * ind + 2] += lazy[ind];
				}
				lazy[ind] = 0;
			}
			//no overlap
			if(high < l || low > r) return 0;
			
			//complete overlap
	    	if(low >= l && high <= r) return seg[ind];
	    	
	    	//partial
	    	int mid = (low + high)>>1;
	    	int left  = query(2 *ind + 1, low ,mid , l,r);
	    	int right = query(2*ind + 2, mid + 1,high ,l,r);
	    	return left+right;
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
