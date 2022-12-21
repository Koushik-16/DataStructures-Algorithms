package trees;

import java.util.*;

class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(){};
	
	TreeNode(int val){
		this.val = val;
	}
	
	TreeNode(int val , TreeNode left , TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Touple {
	TreeNode node;
	int row ;
	int col;
	
	Touple(){};
	
	Touple(TreeNode node, int row , int col){
		this.node = node;
		this.row = row;
		this.col = col;
	}
}

public class View {
	
	static class Pair{
		TreeNode node;
		int x;
		Pair(){}
		Pair(TreeNode node, int x){
			this.node = node;
			this.x = x;
		}
	}
	
	public static List<List<Integer>> verticleOrder(TreeNode root){
		TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
		Queue<Touple> q = new LinkedList<>();
		q.add(new Touple(root,0,0));
		while(!q.isEmpty()) {
			Touple t = q.poll();
			TreeNode node = t.node;
			int x = t.row;
			int y = t.col;
			if(!map.containsKey(x)) map.put(x, new TreeMap<>());
			if(!map.get(x).containsKey(y)) map.get(x).put(y, new PriorityQueue<>());
			map.get(x).get(y).add(node.val);
			if(node.left != null) q.add(new Touple(node.left,x-1,y + 1));
			if(node.right != null)q.add(new Touple(node.right,x + 1,y + 1));
		}
		List<List<Integer>> ans = new ArrayList<>();
		for(TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()) {
			ans.add(new ArrayList<>());
			for(PriorityQueue<Integer> nodes : ys.values()) {
				while(!nodes.isEmpty()) {
					ans.get(ans.size() - 1).add(nodes.poll());
				}
			}
		}
		return ans;
		
	}
	
	public static ArrayList<Integer> topView(TreeNode root){
		ArrayList<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			int x = curr.x;
			TreeNode temp = curr.node;
			if(map.containsKey(x) == false) map.put(x, temp.val);
			if(temp.left != null) q.add(new Pair(temp.left,x -1));
			if(temp.right != null) q.add(new Pair(temp.right,x + 1));
		}
		
		for(int x : map.keySet()) {
			ans.add(map.get(x));
		}
		return  ans;
	}
	
	public static ArrayList<Integer> bottomView(TreeNode root){
		ArrayList<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			int x = curr.x;
			TreeNode temp = curr.node;
			 map.put(x, temp.val);
			if(temp.left != null) q.add(new Pair(temp.left,x -1));
			if(temp.right != null) q.add(new Pair(temp.right,x + 1));
		}
		
		for(int x : map.keySet()) {
			ans.add(map.get(x));
		}
		return  ans;
		
	}

	public static void main(String[] args) {
		

	}

}
