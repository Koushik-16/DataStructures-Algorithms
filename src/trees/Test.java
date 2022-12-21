package trees;

public class Test {
	
	class Solution {
	    public static int longestUnivaluePath(Node root) {
	        int a [] = new int [1];
	        hight(root,a);
	        if(root == null) return 0;
	        return a[0] - 1;
	    }

		private static int hight(Node root, int[] a) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;
		int lh = hight(root.left, a);
		int rh = hight(root.right, a);
		if(root.left != null && root.right!= null && root.data == root.left.data && root.data == root.right.data) {
			a[0] = Math.max(a[0], rh +lh + 1);
			return Math.max(lh, rh) + 1;
		} else if (root.left != null && root.data ==  root.left.data ) {
			a[0] = Math.max(a[0], lh + 1);
			return lh + 1;
		} else if(root.right != null && root.data == root.right.data) {
			a[0] = Math.max(a[0], rh + 1);
			return rh + 1;
		}else {
			a[0] = Math.max(a[0], 1);
			return 1;
		}
		}  
	}

	public static void main(String[] args) {
		System.out.println(Long.MIN_VALUE);

	}

}
