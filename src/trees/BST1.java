package trees;

public class BST1 {

	static class Node {
		int val  = 0;
		Node left = null;
		Node right = null;
		
		Node(int val){
			this.val = val;
		}
		Node(int val , Node left , Node right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	
	public static Node bToDLL(Node root) {
		Node dummy = new Node(-1);
		prev = dummy;
		convertBSTtoLinkedList(root);
		Node head = dummy.right;
		head.left = null;
		dummy.right = null;
		return head;
	}
	
	private static Node prev = null;
	
	public static void convertBSTtoLinkedList(Node root) {
		if(root == null) return ;
		convertBSTtoLinkedList(root.left);
		prev.right = root;
		root.left = prev;
		prev = root;
		convertBSTtoLinkedList(root.right);
		
	}
	
	public static Node BSTtoDLL(Node root) {
		Node dummy = new Node(-1);
		Node prev = dummy, curr = root;
		while(curr != null) {
			Node leftnode = curr.left;
			if(leftnode == null) {
				prev.right = curr;
				curr.left = prev;
				prev = curr;
				curr = curr.right;
			}else {
				Node rightmost = rightMostNode(leftnode,curr);
				
				if(rightmost.right == null) {
					rightmost.right = curr;
					curr = curr.left;
				}else {
					rightmost.right = null;
					prev.right = curr;
					curr.left = prev;
					prev = curr;
					curr = curr.right;
					
				}
				
			}
		}
		Node head = dummy.right;
		dummy.right = head.left = null;
		return head;
	}
	
	public static Node rightMostNode(Node node , Node curr) {
		while(node.right != null && node.right != curr) {
			node = node.right;
		}
		return node;
	}
	
	public Node trimBST(Node root, int low, int high) {
        if(root == null) return root;
        if(root.val < low) return trimBST(root.right, low, high);
        if(root.val > high) return trimBST(root.left, low, high);
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
	
	public static void main(String[] args) {
		

	}

}
