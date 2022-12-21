package graph;

import java.util.ArrayList;
import java.util.HashMap;



public class LongestPath {
	
	static class Node {
		int val;
		ArrayList<Node> child;
		Node(){}
		Node(int val){
			this.val = val;
		}
		Node(int val , ArrayList<Node> child){
			this.val = val;
			this.child = child;
		}
	}
	
	 public static  int longestDistance(int[] arr) {
	        if(arr.length == 1) return 0;
	        HashMap<Integer,Node> map = new HashMap<>();
			Node root = null;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] != -1) {
					if(map.containsKey(arr[i]) == false) map.put(arr[i], new Node(arr[i],new ArrayList<>()));
					if(map.containsKey(i) == false) map.put(i, new Node(i,new ArrayList<>()));
					Node par = map.get(arr[i]);
					par.child.add(map.get(i));
						
				}else {
				    root = new Node(i,new ArrayList<>());
					map.put(i, root);
				}
			}
			
			int a [] = new int[1];
			height(root,a);
			return a[0];
	    }

	    public static int height(Node root, int[] a) {
			if(root == null) return 0;
			int max1 = 0;
			int max2 = 0;
			for(Node c : root.child) {
				int h = height(c,a);
				if(h > max2) {
					max1 = max2;
					max2 = h;
				}else if(h > max1) max1 = h;
			}
			a[0] = Math.max(a[0], max2 + max1);
			return Math.max(max1, max2) + 1;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
