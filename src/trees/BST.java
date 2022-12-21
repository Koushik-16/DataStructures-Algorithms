package trees;

import java.util.Stack;

public class BST {
	public static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data , Node left , Node right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
		Node (){
			
		}
        Node (int data){
			this.data = data;
		}
	}
	public static class BSTiterator {
		private Stack<Node> st = new Stack<>();
		boolean reverse = true;
		
		public BSTiterator(Node root , boolean isReverse) {
			reverse = isReverse;
			pushAll(root);
		}
	
	public void pushAll(Node node) {
		while(node != null) {
			st.push(node);
			if(reverse == true) {
				node = node.right;
			}else {
				node = node.left;
			}
		}
		
	}
	public int next() {
		Node temp = st.pop();
		if(reverse == false) pushAll(temp.right);
		else pushAll(temp.left);
		return temp.data;
	}
	
	public boolean hasNext() {
		return !st.isEmpty();
	}
	
	}
	public class NodeValue{
		public int maxNode , minNode, maxSize;
		
		public NodeValue(int minNode , int maxNode , int maxSize) {
			this.maxNode = maxNode;
			this.minNode = minNode;
			this.maxSize = maxSize;
		}
	}	
	public	class Question {
		public int largestBSTInBT(Node root) {
			return helper(root).maxSize;
		}

		public NodeValue helper(Node root) {
			if(root == null) return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
			
			NodeValue left = helper(root.left);
			NodeValue right = helper(root.right);
			
			if(left.maxNode < root.data && root.data < right.minNode) {
				return new NodeValue(Math.min(root.data, left.minNode), Math.max(root.data, right.maxNode)
						,left.maxSize + right.maxSize + 1);
			}
			
			return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 
					Math.max(left.maxSize,right.maxSize));
		}
			
		}
		
	static Node prev = null;
	    
	    public Node increasingBST(Node root) {
	    	Node ans = new Node(0);
	        prev = ans;
	        helper(root);
	        return ans.right;
	       
	    }
	    public static void helper(Node root){
	        if(root == null) return ;
	        helper(root.left);
	        root.left = null;
	        prev.right = root;
	        prev = root;
	        helper(root.right);
	    }
	
	
	class Solution {
		public boolean findTarget (Node root , int k) {
			if(root == null) return false;
			BSTiterator l = new BSTiterator(root , false);
			BSTiterator r = new BSTiterator(root , true);
					int i = l.next();
					int j = r.next();
					while(i < j) {
						if((i + j) == k) return true;
						else if ((i + j ) < k) i = l.next();
						else j = r.next();
					}
					return false;
		}
	}

}
