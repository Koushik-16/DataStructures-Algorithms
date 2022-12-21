package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import trees.BinaryTree2.Node;
import trees.BinaryTree2.Pair;

public class BinaryTree3 {
	
	
	public static Node buildTree(int [] post , int [] in) {
		if(in == null || post == null || in.length != post.length) return null;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0 ; i < in.length ; i++) {
			hm.put(in[i], i);
		}
		Node root = build(in,0,in.length - 1, post,0,post.length - 1, hm);
		return root;
	}
	

	private static Node build(int[] in, int inStart, int inEnd, int[] post, int postStart, int postEnd, HashMap<Integer, Integer> hm) {
		if(postStart < postEnd || inEnd > inStart)  return null;
		Node root = new Node(post[postEnd], null , null);
		int rootIndex = hm.get(post[postEnd]);
		int numsleft = rootIndex - inStart;
		root.left = build(in,inStart,rootIndex - 1,post,postStart,postStart + numsleft - 1,hm);
		root.right = build(in,rootIndex + 1, inEnd, post, postStart + numsleft,postEnd - 1,hm);
		return root;
	}
	public static ArrayList<Integer> morisInorder(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		Node curr = root;
		
		while(curr != null) {
			Node leftnode = curr.left;
			
			if(leftnode == null) {
				ans.add(curr.data);
				curr = curr.right;
				
			}else {
				Node rightmostNode = getRightMostNode(leftnode,curr);
				
				if(rightmostNode.right == null) {
					rightmostNode.right = curr;
					curr = curr.left;
				}else {
					rightmostNode.right = null;
					ans.add(curr.data);
					curr = curr.right;
				}
			}
		}
		return ans;
	}


	private static Node getRightMostNode(Node leftnode,Node curr) {
		while(leftnode.right != null && leftnode.right != curr) {
			leftnode = leftnode.right;
		}
		return leftnode;
	}
	
	
	public static ArrayList<Integer> morisPreorder(Node root){
		ArrayList<Integer> ans = new ArrayList<>();
		Node curr = root;
		while(curr != null) {
			Node leftnode = curr.left;
			if(leftnode == null) {
				ans.add(curr.data);
				curr = curr.right;
			}else {
				Node rightmostNode = getRightMostNode(leftnode,curr);
				
				if(rightmostNode.right == null) {
					rightmostNode.right = curr;
					ans.add(curr.data);
					curr = curr.left;
				}else {
					rightmostNode.right = null;
					curr = curr.right;
				}
			}
		}
		return ans;
	}
	
	static class HousePair {
	        int with = 0;
	        int without = 0;
	    } 
	    
	    public static  int rob(Node root) {
	        HousePair res = robbery(root);
	        return Math.max(res.with,res.without);     
	    }
	    
	    public static HousePair robbery(Node root ){
	        if(root == null) return new HousePair();
	        
	        HousePair left = robbery(root.left);
	        HousePair right = robbery(root.right);
	        
	        HousePair my = new HousePair();
	        my.with = left.without + right.without + root.data;
	        my.without = Math.max(left.with, left.without) + Math.max(right.with,right.without);
	        return my;
	    }
	    
	 static class Slope {
		 int forward = -1;
		 int backward = -1;
		 int max = 0;
	 }
	 
	 public static int maxZigzacPath(Node root) {
		 Slope ans = helper(root);
		 return ans.max;
	 }
	 
	 public static Slope  helper(Node root) {
		 if(root == null) return new Slope();
		 Slope l = helper(root.left);
		 Slope r = helper(root.right);
		 Slope my = new Slope();
		 my.max = Math.max(Math.max(l.max, r.max),Math.max(l.backward, r.forward) +1);
		 my.forward = l.backward + 1;
		 my.backward = r.forward + 1;
		 return my;
	 }
	 
	 public static ArrayList<Node> nodeToRootPath(Node root, int data){
		 if(root == null) return null;
		 if(root.data == data ){
			 ArrayList<Node> list = new ArrayList<>();
			 list.add(root);
			 return list;
		 }
		 
		 ArrayList<Node> left = nodeToRootPath(root.left, data);
		 if(left!= null) {
			 left.add(root);
			 return left;
		 }
		 
		 ArrayList<Node> right = nodeToRootPath(root.right, data);
		 if(right!= null) {
			 right.add(root);
			 return right;
		 }
		 return null;
	 }
	 
	 public static boolean nodetoRootPath(Node root , int data , ArrayList<Integer> list) {
		 if(root == null) return false;
		 if(root.data == data) {
			 list.add(root.data);
			 return true;
		 }
		 boolean res = nodetoRootPath(root.left,data,list) || nodetoRootPath(root.right,data,list);
		 if(res) list.add(root.data);
		 return res;
	 }
	 public static int countSingleChildNodes(Node root) {
		 if(root == null || (root.left == null && root.right == null)) return 0;
		 int ans = countSingleChildNodes(root.left) + countSingleChildNodes(root.right);
		 if(root.left == null || root.right == null) ans++;
		 return ans;
	 }
	 
	 public static void kDown(Node root, int k , Node block, ArrayList<Integer> ans) {
		 if(root == null || root == block || k < 0) return;
		 if(k == 0 )  {
			 ans.add(root.data);
			 return;
		 }
		 kDown(root.left,k-1,block,ans);
		 kDown(root.right,k-1,block,ans);
	 }

	 
	 public static int distanceK(Node root, int target , int k ,ArrayList<Integer> ans ) {
		 if(root == null) return -1;
		 if(root.data == target) {
			 kDown(root,k - 0,null,ans);
			 return 1;
		 }
		 int ld = distanceK(root.left,target,k,ans);
		 if(ld != -1) {
			 kDown(root,k - ld,root.left,ans);
			 return ld + 1;
		 }
		 int rd = distanceK(root.right,target,k,ans);
		 if(rd != -1) {
			 kDown(root,k - rd,root.right,ans);
			 return rd + 1;
		 }
		 return -1;
	 }
	 
	 
	 public boolean find(Node root, int k)
	    {
	    // Base Case
	        if (root == null)
	            return false;
	        return  (root.data == k || find(root.left, k) ||  find(root.right, k));
	    }
	    
	    public Node lca_util(Node root, int val1, int val2) {
	        
		    if(root == null || root.data == val1 || root.data == val2) return root;
		    Node left = lca_util(root.left, val1 , val2);
		    Node right = lca_util(root.right, val1 , val2);
		    if(left!=null && right!=null) return root;
		    return left!=null ? left : right ;
	    }
	    
		public int lca(Node root, int val1, int val2) {
	        if(!find(root, val1) || !find(root, val2))
	            return -1;
	        Node result =  lca_util(root ,val1, val2); 
	        return result!= null? result.data : -1;
		}
		
		 public void flatten(Node root) {
		       Node cur = root;
				while (cur != null)
				{
					if(cur.left != null)
					{
						Node pre = cur.left;
						while(pre.right != null)
						{
							pre = pre.right;
						}
						pre.right = cur.right;
						cur.right = cur.left;
						cur.left = null;
					}
					cur = cur.right;
				}
		    }
		 static String res = "";
		 public static  String smallestFromLeaf(Node root) {
			    dfs(root , new StringBuilder());
			    return res;
			}
			    public  static void dfs(Node root , StringBuilder currStr) {
			    if(root == null) return;
			    
			    currStr.insert(0,(char)(root.data + 97));
			    
			    if(root.left == null && root.right == null){
			        
					if(res.equals("")) res = currStr.toString();
			        else  res = res.compareTo(currStr.toString()) > 0 ? currStr.toString() :res;
			    
			    } else {
			    
			        dfs(root.left , currStr);
			        dfs(root.right , currStr);
			    
				}
			    
			    currStr.deleteCharAt(0);
			 }
			    //populating next right pointers
	         public Node connect(Node root) {
			        Node start = root;
			        
			        while( start != null && start.left != null){
			          Node s = start;
			            
			            while(true){
			                s.left.next = s.right;
			                if(s.next == null) break;
			                s.right.next = s.next.left;
			                s = s.next;
			            }
			            start = start.left;
			        }
			        return root;
			    }
	       //populating next right pointers 2
	         public Node connect2(Node root) {
	             if(root == null) return null;
	           Node head = root;
	             while(head != null){
	                 Node dummy = new Node();
	                 Node temp = dummy;
	                 while(head != null){
	                     if(head.left != null){
	                         temp.next = head.left;
	                         temp = temp.next;
	                     }
	                     if(head.right != null){
	                         temp.next = head.right;
	                         temp = temp.next;
	                     }
	                     head = head.next;
	                 }
	                 head = dummy.next;
	             }
	             return root;
	         }
	         
            static Node prev  = null;
	         
	         public static  void flatten2(Node root) {
	            if(root == null) return ;
	            flatten2(root.right);
	             flatten2(root.left);
	             root.right = prev;
	             root.left = null;
	             prev = root;
	             
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
		
		ArrayList<Node> res = nodeToRootPath(root,87);
		for(int i = 0 ; i < res.size() ; i++) {
			System.out.print(res.get(i).data + " ");
		}
		

	}


}
