package trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import trees.BinaryTree.Node;

public class BinarySearchTree {
	
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
		Node(int data){
			this.data = data;
		}
	}
	public static Node ConstructBST(int  a[], int low , int high) {
		if( low > high) return  null;
		int mid = (low + high) / 2;
		int data = a[mid];
		Node lc = ConstructBST(a,low , mid - 1);
		Node rc = ConstructBST(a, mid + 1 , high);
		Node root =  new Node(data,lc , rc);
		return root;
	}
	
	public static void Display(Node node) {
		if(node == null) {
			return ;
		}
		String str = "";
		str += node.left == null? "." : node.left.data + "";
		str += "<-" + node.data + "->";
		str += node.right == null ? "." : node.right.data +"";
		System.out.println(str);
		Display(node.left);
		Display(node.right);
	}	
	public static int Max(Node root) {
		if(root.right != null) {
			return Max(root.right);
		} else {
			return root.data;
		}
	}
	public static int Min(Node root) {
		if(root.left != null) {
			return Min(root.left);
		} else {
			return root.data;
		}
	}
	
	public static Node Search(Node root,int val) {
		while(root != null && root.data != val) {
			root = val < root.data ? root.left : root.right;
		}
		return root;
	}
	public static int findCeil(Node root, int key) {
		int ceil = -1;
		while(root != null) {
			if(root.data == key) {
				ceil = root.data;
				return ceil;
			}
			if(key > root.data) {
				root = root.right;
			}
			else {
				ceil = root.data;
				root = root.left;
			}
		}
		return ceil;
	}
	
	public static int findFloor(Node root , int key) {
		int floor = -1;
		while(root != null) {
			if(root.data == key) {
				floor = root.data;
				return floor;
			}
			if(root.data > key) {
				root = root.left;
			}
			else {
				floor = root.data;
				root = root.right;
			}
		}
		return floor;
	}
	
	public static Node insertBST(Node root, int key) {
		if(root == null) return new Node(key,null,null);
		Node curr = root;
	    while(true) {
	    	if(curr.data <= key) {
	    		if(curr.right != null) curr = curr.right;
	    		else {
	    			curr.right = new Node(key,null,null);
	    			break;
	    		}
	    	} else {
	    		if(curr.left != null) curr = curr.left;
	    		else {
	    			curr.left = new Node(key,null,null);
	    			break;
	    		}
	    		
	    	}
	    }	
		return root;
	}
	
	public static Node deleteNode(Node root, int key) {
		if(root == null) return null;
		if(root.data == key) return helper(root);
		Node dummy = root;
		while(root != null) {
			if(root.data > key) {
				if(root.left != null && root.left.data == key) {
					root.left = helper(root.left);
					break;
				}
				else root = root.left;
				
			} else {
				if(root.right != null && root.right.data == key)  {
					root.right = helper(root.right);
					break;
				}
				else root = root.right;
			}
		}
		return dummy;
	}
	
	private static Node helper(Node root) {
		if(root.left == null ) return root.right;
		else if(root.right == null ) return root.left;
		Node rightchild = root.right;
		Node lastchild = findLast(root.left);
		lastchild.right = rightchild;
		return root.left;
	}

	private static Node findLast(Node root) {
		if(root.right == null) return root;
		return findLast(root.right);
	}
	
	public static void moris(Node root, int count, int k){
		
		Node curr = root;
		while(curr != null) {
			if(curr.left == null) {
				if(count == k) System.out.println(curr.data);
				count++;
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
					if(count == k) System.out.println(curr.data);
					count++;
					curr = curr.right;
				}
			}
		}
	}
	
	public static boolean isBST(Node root) {
		return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private static boolean isValid(Node root, long minValue, long maxValue) {
		if(root == null) return true;
		if(root.data >= maxValue || root.data <= minValue) return false;
		return isValid(root.left , minValue, root.data) && isValid(root.right , root.data, maxValue);
	}
	
	public static Node LCAofBST(Node root , Node p , Node q) {
		if(root == null ) return null;
		if(root.data < p.data && root.data < q.data)  return LCAofBST(root.right, p , q);
		if(root.data  > p.data && root.data > q.data) return LCAofBST(root.left , p , q); 
	    return root;	
	}
	
	public static Node BSTfromPreorder(int a []) {
		return CreateBSTfromPre(a,new int [] {0},Integer.MAX_VALUE);
	}
	
	public static Node CreateBSTfromPre(int  a[], int[] i, int ub) {
		if(i[0] == a.length || a[i[0]] > ub) return null;
		Node root = new Node();
		root.data = a[i[0]++];
		root.left = CreateBSTfromPre(a,i,root.data);
		root.right = CreateBSTfromPre(a,i,ub);
		return root;
	}
	
	public static Node successor(Node root, Node p) {
		Node successor = null;
		while(root != null) {
			if(p.data >= root.data) root = root.right;
			else {
				successor = root;
				root = root.left;
			}
		}
		return successor;
	}
	 private static  Node first;
	    private static  Node prev;
	    private static  Node middle;
	    private static  Node last; 
	    private void inorder(Node root) {
	        if(root == null) return; 
	        inorder(root.left); 
	        if (prev != null && (root.data < prev.data))
	        {   
	            // If this is first violation, mark these two nodes as
	            // 'first' and 'middle'
	            if ( first == null )  {
	                first = prev;
	                middle = root;
	            }
	            // If this is second violation, mark this node as last
	            else
	                last = root;
	        }
	 
	        // Mark this node as previous
	        prev = root;
	        inorder(root.right); 
	    }
	    public void recoverTree(Node root) {
	        first = middle = last = null; 
	        prev = new Node(Integer.MIN_VALUE); 
	        inorder(root);
	        if(first!=null && last!=null) {
	            int t = first.data;
	            first.data = last.data;
	            last.data = t; 
	        }
	        else if(first!=null && middle!=null)  {
	            int t = first.data;
	            first.data = middle.data;
	            middle.data = t; 
	        }
	    }
	
	public static void main(String[] args) {
		int arr []  = {2, 5, 8, 9, 14, 19 , 21};
		Node root = ConstructBST(arr,0,arr.length - 1);
		
		Set<Integer> set = new HashSet<>();
        Display(root);
//        System.out.println(Max(root));
//        int a  [] = {8, 5, 1, 7 , 10 , 12};
//       Node node =  BSTfromPreorder(a);
//       Display(node);
	}

}
