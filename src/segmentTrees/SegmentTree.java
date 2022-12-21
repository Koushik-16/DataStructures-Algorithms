package segmentTrees;
import java.util.*;

class SGTree{
	int seg [];
	
    public SGTree(int n ){
		seg = new int[n*4];
	}
    
  public  void build(int ind , int low , int high,int arr []) {
    	if(low == high) {
    		seg[ind] = arr[low];
    		return;
    	}
    	int mid = (low + high)>>1;
    	build(2*ind + 1,low ,mid,arr);
    	build(2*ind + 2,mid + 1 ,high,arr);
    	seg[ind] = Math.min(seg[2 * ind + 1], seg[2 * ind + 2]);
    }
  
   public int query(int ind , int low , int high , int l , int r) {
	   if(high < l || low > r) return Integer.MAX_VALUE;
	   else  if(low >= l && high <= r) return seg[ind];
	   int mid = (low + high)>>1;
	   int left = query(2 *ind + 1,low ,mid,l,r);
	   int right = query(2 *ind + 2,mid + 1 ,high,l,r);
	   return Math.min(left, right);
   }
   
   public void update(int ind , int low , int high , int i , int val) {
	   if(low == high) {
		   seg[ind] = val;
		   return ;
	   }
	   int mid = (low + high)>>1;
	   if(i <= mid) update(2 * ind + 1,low ,mid,i,val);
	   else update(2 * ind + 2,mid + 1 ,high,i,val);
	   seg[ind] = Math.min(seg[2 * ind + 1], seg[2 * ind + 2]);
   }
    
}

public class SegmentTree {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int arr1 [] = new int[n1];
		for(int i = 0 ; i < n1 ; i++) arr1[i] = sc.nextInt();
		int n2 = sc.nextInt();
		int arr2 [] = new int[n2];
		for(int i = 0 ; i < n2 ; i++) arr2[i] = sc.nextInt();
		int q = sc.nextInt();
		SGTree sg1 = new SGTree(n1);
		SGTree sg2 = new SGTree(n2);
		sg1.build(0, 0, n1 - 1, arr1);
		sg2.build(0, 0, n2-1, arr2);
		while(q-- > 0) {
			int type = sc.nextInt();
			if(type == 1) {
				int l1 = sc.nextInt();
				int r1 = sc.nextInt();
				int l2 = sc.nextInt();
				int r2 = sc.nextInt();
				int min1 = sg1.query(0, 0, n1-1, l1, r1);
				int min2 = sg2.query(0, 0, n2-1, l2, r2);
				System.out.println(Math.min(min1, min2));
			}else {
				int arrNo = sc.nextInt();
				int i = sc.nextInt();
				int val = sc.nextInt();
				if(arrNo == 1) {
					sg1.update(0, 0, n1-1, i, val);
					arr1[i] = val;
				}else {
					sg2.update(0, 0, n2-1, i, val);
					arr2[i] = val;
				}
			}
		}
		

	}

}
