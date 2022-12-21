package segmentTrees;
import java.util.*;

public class SumOfInterval {
	
	 static class SGTree{
		int seg [];
		
	    public SGTree(int n ){
			seg = new int[n*4];
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
	    
	    public int query(int ind , int low , int high ,int l , int r) {
	    	if(high < l || low > r) return 0;
	    	if(low >= l && high <= r) return seg[ind];
	    	int mid = (low + high)>>1;
	    	int left  = query(2 *ind + 1, low ,mid , l,r);
	    	int right = query(2*ind + 2, mid + 1,high ,l,r);
	    	return left+right;
	    }
	    
	    public void update(int ind , int low , int high , int i , int val) {
	    	if(low == high) {
	    		seg[ind] = val;
	    		return;
	    	}
	    	int mid = (low + high)>>1;
	    	if(i <= mid) update(2*ind + 1,low,mid,i,val);
	    	else update(2*ind + 2,mid + 1,high,i,val);
	    	seg[ind] = seg[2*ind +1] + seg[2*ind + 2];
	    }
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i =0 ; i < n ;i++) arr[i] = sc.nextInt();
		SGTree sg = new SGTree(n);
		sg.build(0, 0, n-1, arr);
		int q = sc.nextInt();
		while(q-- > 0) {
			int type = sc.nextInt();
			if(type == 1) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				int ans = sg.query(0, 0, n-1,l , r);
				System.out.println(ans);
			}else {
				int ind = sc.nextInt();
				int val = sc.nextInt();
				sg.update(0, 0, n-1, ind, val);
				arr[ind] = val;
			}
		}
		
		
	}

}
