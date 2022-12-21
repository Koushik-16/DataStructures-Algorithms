package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.Node;


public class GenericTree {
	
	static class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	
	public static  void Display(Node node) {
		String str = node.data + "->";
	  for(Node child: node.children){
		  str += child.data + " ,";
		  
	  }
	  str += ".";
	  System.out.println(str);
	  for(Node child: node.children) {
		  Display(child);
	  }
				
	}
	
	public static int Size(Node node) {
		int s = 0 ;
		for(Node child: node.children) {
			int cs = Size(child);
			s = s + cs;
		}
		s = s + 1;
		return s;
	}
	
	public static int max(Node node) {
		int max = Integer.MIN_VALUE;
		for(Node child: node.children) {
			int cm  = max(child);
			max = Math.max(cm, max);
		}
		max = Math.max(node.data, max);
		return max;
	}
	
	public static int hight(Node node) {
		int hight = -1;
		for(Node child: node.children) {
			int ch = hight(child);
			 hight = Math.max(ch, hight);
		}
		hight += 1;
		return hight;
	}
	
	public static void preOrder(Node node) {
		if(node == null )return ;
		System.out.println(node.data);
		for(Node child : node.children) {
			preOrder(child);
		}
	}
	
	public static void traversals(Node node) {
		System.out.println("Node pre " + node.data); // node pre
		for(Node child: node.children) {
			System.out.println("edge pre " + node.data +" --" + child.data);// edge pre 
			traversals(child);
			System.out.println("edge post " + node.data + " --" + child.data); // edge post
		}
		System.out.println("Node post "+ node.data);// Node post
	}
	
	public static void levelorder(Node node ) {
		Queue<Node> q = new ArrayDeque<>();
		q.add(node);
		while(q.size() > 0) {
			node = q.remove(); // remove 
			
			System.out.print(node.data + " "); // print 
			
			for(Node child: node.children) { // add children
				q.add(child);
			}
		}
		System.out.println(".");
	}
	
	public static void levelorderLinewise(Node node) {
		Queue<Node> mq = new ArrayDeque<>();
		mq.add(node);
		
		Queue<Node> cq = new ArrayDeque<>();
		while(mq.size() > 0) {
			Node curr = mq.remove();
			System.out.print(curr.data + " ");
			for(Node child : curr.children) {
				cq.add(child);
			}
			if(mq.size() == 0) {
				mq = cq;
				cq = new ArrayDeque<>();
				System.out.println();
			}
			
		}
	}
	
	public static void zigzag(Node node) {
		Stack<Node> ms = new Stack<>();
		ms.push(node);
		
		Stack<Node> cs =  new Stack<>();
		int level = 1;
		while(ms.size()  > 0) {
			node = ms.pop();
			System.out.print(node.data+ " ");
			if(level % 2 == 1) {
				for(int i = 0 ; i < node.children.size(); i++) {
					Node child = node.children.get(i);
					cs.push(child);
				}
			} else {
				for(int i = node.children.size() -1 ; i>= 0; i--) {
					Node child = node.children.get(i);
					cs.push(child);
				}
			}
			if(ms.size() == 0 ) {
				ms = cs ;
				cs = new Stack<>();
				level ++;
				System.out.println();
			}
		}
	}
	
     public static void mirror (Node node) {
    	 for(Node child : node.children) {
    		 mirror(child);
    	 }
    	 Collections.reverse(node.children);
     }
     
     public static void removeleaves(Node node ) {
    	 for(int i = node.children.size() -1 ; i >= 0; i--) {
    		 Node child = node.children.get(i);
    		 if(child.children.size() == 0) {
    			 node.children.remove(child);
    		 }
    	 }
    	 for(Node child : node.children) {
    		 removeleaves(child);
    	 }
    	 
     }
     
     public static void Linear(Node node) {
    	 for(Node child: node.children) {
    		 Linear(child);
    	 }
    	 while(node.children.size() > 1) {
    		Node lc =  node.children.remove(node.children.size() -1);
    		 Node sl = node.children.get(node.children.size() -1);
    		 Node slt = getTail(sl);
    		 slt.children.add(lc);
    	 }	 
     }
	
	
	private static Node getTail(Node node) {
		while(node.children.size() == 1) {
			node = node.children.get(0);
		}
		return node;
	}
	
	public static Node Linearise(Node node) {
		if(node.children.size() == 0) {
			return node;
		}
		Node lkt = Linearise(node.children.get(node.children.size() -1));
		while(node.children.size() > 1) {
			Node last = node.children.remove(node.children.size() -1);
			Node sl = node.children.get(node.children.size() -1);
			Node slt = Linearise(sl);
			slt.children.add(last);
		}
		return lkt;
	}
	public static boolean find(Node node, int data) {
		if(node.data == data) {
			return true;
		}
		for(Node child: node.children) {
			boolean flc = find(child, data);
			if(flc) {
				return true;
			}
		}
		return false;
	}
	public static ArrayList<Integer> nodeToRootPath(Node root , int data){
		if(root.data == data) {
			ArrayList<Integer> res = new ArrayList<>();
			res.add(root.data);
			return res;
		}
		for(Node child : root.children) {
			ArrayList<Integer> ptc = nodeToRootPath(child, data);
			if(ptc.size() > 0) return ptc;
		}
		return new ArrayList<>();
	}
	
	static int msn = 0; 
	static int ms = Integer.MIN_VALUE;
	
	public static int maximumSubtreeSum(Node node) {
		int sum  = 0;
		for(Node child: node.children) {
			int csum = maximumSubtreeSum(child);	
			sum += csum;
		}
		sum+= node.data;
		
		if(sum > ms) {
			ms = sum;
			msn = node.data;
		}
		return sum;
	}

	public static boolean areSimilar(Node n1 , Node n2) {
		if(n1.children.size() != n2.children.size()) return false;
		   for(int i = 0 ; i < n1.children.size() ; i++) {
			   Node c1 = n1.children.get(i);
			   Node c2 = n2.children.get(i);
			   if(areSimilar(c1,c2) == false) {
				   return false;
			   }
		   }
		   return true;
	}
	
	public static void main(String[] args) {
		int arr [] = {10 , 20 , 50 ,-1, 60 , -1 , -1, 30, 70 , -1, 80 , 110, -1 , 120, -1, -1, 90 ,-1, -1, 40 , 100, -1  ,-1  ,-1 };
	    Node root = null;
         Stack<Node> st = new Stack<>();
         for(int i = 0 ; i <arr.length; i++){
        	 if(arr[i] == -1){
        		 st.pop();
        	 } else {
        		 Node t = new Node();
        		 t.data = arr[i];
        		 if(st.size() > 0) {
        		 st.peek().children.add(t);
        	     } else {
        		 root = t;
        	 }
        		 st.push(t);
         }
	}
        Display(root);
        preOrder(root);
        int size = Size(root);
        System.out.println();
        System.out.println("size of this tree is " +size);
        System.out.println();
        int max = max(root);
        System.out.println("maximum value among nodes is "+max);
        System.out.println();
        int hight = hight(root);
        System.out.println("hight of this tree is "+hight);
        
        System.out.println();
        
        traversals(root);
        System.out.println();
        
        levelorder(root);
        zigzag(root);
        System.out.println();
         mirror(root);
         System.out.println();
         Display(root);
         
         System.out.println();
         removeleaves(root);
         
         Display(root);
        System.out.println();
        Linearise(root);
         Display(root);
         find(root,100);
         
         maximumSubtreeSum(root);
         System.out.println(msn +" & " + ms);
}
}
