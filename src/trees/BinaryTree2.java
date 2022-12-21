package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import trees.BinaryTree.Node;
import trees.BinaryTree.Pair;

public class BinaryTree2 {
	
	public static class Node {
		int data;
		Node left;
		Node right;
		Node next;
		
		Node(){};
		
		Node(int data , Node left , Node right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	public static class Pair{
		Node node ;
		int state;
		
		Pair(Node node , int  state){
			this.node = node;
			this.state = state;
		}
	}
	
	public ArrayList<Integer> solve(Node root , int x){
		ArrayList<Integer> res = new ArrayList<>();
		if(root == null) return res;
		NodetorootPath(root, res, x);
		return res;
	}
	
	
	public static boolean NodetorootPath(Node root , ArrayList<Integer> res , int x) {
		if(root == null) return false;
		res.add(root.data);
		if(root.data == x) return true;
		if(NodetorootPath(root.left, res, x) || NodetorootPath(root.right, res, x)) return true;
		res.remove(res.size() - 1);
		return false;
	}
	
	
	 private static void markParents(Node root, Map<Node, Node> parent_track, Node target) {
	        Queue<Node> queue = new LinkedList<Node>();
	        queue.offer(root);
	        while(!queue.isEmpty()) { 
	            Node current = queue.poll(); 
	            if(current.left != null) {
	                parent_track.put(current.left, current);
	                queue.offer(current.left);
	            }
	            if(current.right != null) {
	                parent_track.put(current.right, current);
	                queue.offer(current.right);
	            }
	        }
	    }
	    public static List<Integer> distanceK(Node root, Node target, int k) {
	        Map<Node, Node> parent_track = new HashMap<>();
	        markParents(root, parent_track, root); 
	        Map<Node, Boolean> visited = new HashMap<>(); 
	        Queue<Node> queue = new LinkedList<Node>();
	        queue.offer(target);
	        visited.put(target, true);
	        int curr_level = 0;
	        while(!queue.isEmpty()) { /*Second BFS to go upto K level from target node and using our hashtable info*/
	            int size = queue.size();
	            if(curr_level == k) break;
	            curr_level++;
	            for(int i=0; i<size; i++) {
	                Node current = queue.poll(); 
	                if(current.left != null && visited.get(current.left) == null) {
	                    queue.offer(current.left);
	                    visited.put(current.left, true);
	                }
	                if(current.right != null && visited.get(current.right) == null ) {
	                    queue.offer(current.right);
	                    visited.put(current.right, true);
	                }
	                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
	                    queue.offer(parent_track.get(current));
	                    visited.put(parent_track.get(current), true);
	                }
	            }
	        }
	        List<Integer> result = new ArrayList<>(); 
	        while(!queue.isEmpty()) {
	            Node current = queue.poll(); 
	            result.add(current.data);
	        }
	        return result;
	    }
	
	public static void changeTree(Node root) {
		if(root == null) return ;
		int child = 0;
		if(root.left != null) child += root.left.data;
		if(root.right != null) child += root.right.data;
		if(child >= root.data) root.data = child;
		else {
			if(root.left != null) root.left.data = root.data;
			if(root.right != null) root.right.data = root.data;
		}
		changeTree(root.left);
		changeTree(root.right);
		int tot = 0;
		if(root.left != null) tot += root.left.data;
		if(root.right != null) tot += root.right.data;
		if(root.left != null || root.right != null) root.data = tot;
	}
	
	public static int countNodes(Node root) {
		if(root == null) return 0;
		int left = getLeftHight(root);
		int right = getRightHight(root);
		if(left == right) return ((2<<left) - 1);
		else return countNodes(root.left) + countNodes(root.right) + 1;
	}
	
	private static int getRightHight(Node root) {
		int count  = 0;
		while(root.left != null ) {
		   count ++;
		   root = root.left;
		}
		return count;
	}


	private static int getLeftHight(Node root) {
		int count  = 0;
		while(root.right != null) {
			count ++;
			root = root.right;
		}
		return count;
	}
	
	public static Node buildTree(int preOrder[] , int inOrder[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0 ; i < inOrder.length ; i++) {
			hm.put(inOrder[i], i);
		}
		Node root = build(preOrder, 0, preOrder.length - 1, inOrder, 0 , inOrder.length - 1, hm );
		return root;
	}
	
	public static Node build(int preOrder [], int preStart, int preEnd, int inOrder[], int inStart,int inEnd, Map<Integer, Integer> hm) {
		if(preStart > preEnd || inStart > inEnd) return null;
		Node root = new Node(preOrder[preStart], null , null);
		int inroot = hm.get(root.data);
		int numsleft = inroot - inStart;
		root.left = build(preOrder, preStart + 1, preStart + numsleft, inOrder,inStart, inroot - 1, hm);
		root.right = build(preOrder , preStart + numsleft + 1, preEnd, inOrder, inroot + 1, inEnd, hm);
		return root;
	}
	
	 public String serialize(Node root) {
	        if(root == null) return "";
			Queue<Node> q = new LinkedList<>();
			StringBuilder res = new StringBuilder();
			q.add(root);
			while(!q.isEmpty()) {
				Node node = q.poll();
				if(node == null) {
					res.append("n ");
	                continue;
				}
				res.append(node.data + " ");
				q.add(node.left);
				q.add(node.right);
	            
			}
			return res.toString();
	    }

	    // Decodes your encoded data to tree.
	    public Node deserialize(String data) {
	        if(data == "") return null;
			Queue<Node> q = new LinkedList<>();
			String [] values = data.split(" ");
			Node root = new Node(Integer.parseInt(values[0]),null,null);
	        q.add(root);
			for(int i = 1 ; i < values.length ; i++) {
				Node parent = q.poll();
				if (!values[i].equals("n")) {
					Node left = new Node(Integer.parseInt(values[i]),null,null);
	                parent.left = left;
	                q.add(left);
	            }
	            if (!values[++i].equals("n")) {
	            	Node right = new Node(Integer.parseInt(values[i]),null,null);
	                parent.right = right;
	                q.add(right);
	            }
	        }
	        return root;
	    }
	
	public static List<Integer> moris(Node root){
		List<Integer> inorder = new ArrayList<>();
		Node curr = root;
		while(curr != null) {
			if(curr.left == null) {
				inorder.add(curr.data);
				curr = curr.right;
			} else {
				Node prev = curr.left;
				while(prev.right != null && prev.right != curr) {
					prev = prev.right;
				}
				
				if(prev.right == null) {
					prev.right = curr;
					curr = curr.left;
				} else {
					prev.right = null;
					inorder.add(curr.data);
					curr = curr.right;
				}
			}
		}
		return inorder;
	}
	
	public static int minDepth(Node root) {
        if(root == null) return 0;
        return height(root) + 1;
    }
    public static  int height(Node root){
       if(root.left == null && root.right == null) return 0;
        int l = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;
        if(root.left != null) l = height(root.left);
        if(root.right != null) r = height(root.right);
        return Math.min(l,r)  + 1;
        
    }


	public static void main(String[] args) {
		Integer [] arr = {50 , 25 , 12 ,null, null , 37 ,30 ,null , null, null , 75 , 62 , null, 70 , null, null , 87 , null , null};
		Node root = new Node(arr[0], null , null);
		Pair rtp = new Pair(root , 1);
		Stack<Pair> st = new Stack<>();
		st.push(rtp);
		int index = 0;
		while( st.size() > 0) {
			Pair top = st.peek();
			if(top.state == 1) {
				index ++;
				if(arr[index] != null) {
					Node ln = new Node(arr[index], null , null);
					top.node.left = ln;
					Pair lp = new Pair(ln, 1);
					st.push(lp);
				} else {
					top.node.left = null;
				}
				top.state ++;
			} else if (top.state == 2) {
				index ++;
				if(arr[index] != null) {
					Node rn = new Node(arr[index], null , null);
					top.node.right = rn;
					Pair rp = new Pair(rn, 1);
					st.push(rp);
				} else {
					top.node.right = null;
				}
				top.state ++;
			} else {
				st.pop();
			}
		}

	}

}
