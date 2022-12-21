package trees;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.Node;

public class BinaryTree {
	
	public static class Node {
		int data;
		Node left;
		Node right;
		
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
	
	public static int Sum(Node node ) {
		if(node == null) {
			return 0;
		}
	   int ls = Sum(node.left);
	   int rs = Sum(node.right);
	   return ls + rs + node.data;
	   
	}
	
	public static int Size(Node node) {
		if(node == null) {
			return 0;
		}
		int ls = Size(node.left);
		int rs = Size(node.right);
		return ls+rs+1;
	}
	
	public static int Max(Node node) {
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		int lm  = Max(node.left);
		int rm = Max(node.right);
		int pr = Math.max(lm, rm);
		return Math.max(node.data, pr);
	}
	
	public static int Hight(Node node) {
		if(node == null) {
			return -1; // for edges return -1 & for nodes return 0
		}
		int lh = Hight(node.left);
		int rh = Hight(node.right);
		int hight = Math.max(lh, rh)+1;
		return hight;
		
	}
	
	public static void PreTraversal(Node node) {
		if(node == null)  return ;
		System.out.println(node.data);
		PreTraversal(node.left);
		PreTraversal(node.right);
	}
	
	public static void InTraversal(Node node) {
		if(node == null) return ;
		InTraversal(node.left);
		System.out.println(node.data);
	    InTraversal(node.right);
	}
	
	public static void PostTraversal(Node node) {
		if(node == null) return ;
		PostTraversal(node.left);
		PostTraversal(node.right);
		System.out.println(node.data);
	}
	
	public static void LevelOrder(Node node) {

		Queue<Node> mq = new ArrayDeque<>();
		mq.add(node);
		
		while(mq.size() > 0) {
			int count = mq.size();
			for(int i = 0 ; i < count; i++) {
				node = mq.remove();
				System.out.print(node.data +" ");
				if(node.left != null) {
					mq.add(node.left);
				}
				if(node.right != null) {
					mq.add(node.right);
				}
			}
			System.out.println();
		}
	}
	
	public static ArrayList<Integer> Level(Node node){
		ArrayList<Integer> res = new ArrayList<>();
		Queue<Node> mq = new ArrayDeque<>();
		mq.add(node);
		while(mq.size() > 0) {
			Node remove = mq.remove();
			res.add(remove.data);
			if(remove.left != null) {
				mq.add(remove.left);
			}
			if(remove.right != null) {
				mq.add(remove.right);
			}
		}
		return res;
	}
	

	public static void iterative(Node node) {
		Stack<Pair> st = new Stack<>();
		Pair rtp = new Pair(node , 1);
		st.push(rtp);
		String pre = "";
		String post = "";
		String in = "";
		while(st.size() > 0) {
			Pair top = st.peek();
			if(top.state == 1) {
				pre += top.node.data + " ";
				top.state++;
				if(top.node.left != null) {
					Pair lp = new Pair (top.node.left , 1);
					st.push(lp);
				}
			}
	       else if (top.state == 2) {
			  in += top.node.data + " ";
			  top.state++;
			  if(top.node.right != null) {
				  Pair rp = new Pair(top.node.right, 1);
				  st.push(rp);
			  }
			  
		} else {
			post +=top.node.data + " ";
			st.pop();
		}
	}
		System.out.println(pre);
		System.out.println(post);
		System.out.println(in);
	}
	
	static ArrayList<Integer> path;
	
	public static boolean Find(Node node , int data) { 
		if(node == null) return false;
		if(node.data == data) {
			path.add(node.data);
			return true;
		}
	    boolean filc = Find(node.left,data);
	    if(filc ) {
	    	path.add(node.data);
			return true;
	    }
	    boolean firc = Find(node.right,data);
	    if(firc) {
	    	path.add(node.data);
			return true;
	    }
	    return false;
	}
	
	public static void NodetoRootPath(Node node ,int data ){
		path = new ArrayList<>();
		Find(node, data);
		for(int i = 0 ; i < path.size() ; i++) {
			System.out.print(path.get(i) + " ");
		}
	}
	
	public static void PrintKLevelsDeep(Node  node , int k ) {
		if(node == null || k < 0) {
			return ;
		}
		if(k == 0) {
			System.out.print(node.data + " ");
		}
		PrintKLevelsDeep(node.left , k-1);
		PrintKLevelsDeep(node.right , k-1);
		
	}
	
	public static Node LeftCloneTree(Node node) {
		if(node == null) {
			return null;
		}
		Node lcr = LeftCloneTree(node.left);
		Node rcr = LeftCloneTree(node.right);
		
		Node nn = new Node(node.data,lcr,null);
		node.left = nn;
		node.right = rcr;
		return node;
	}
	
	public static Node TransformLeftCloneTree(Node node) {
		if(node == null ) {
			return null;
		}
		Node nl = TransformLeftCloneTree(node.left.left);
		Node nr = TransformLeftCloneTree(node.right);
		node.left = nl;
		node.right = nr;
		return node;
	}
	
	public static boolean isBalanced(Node node) {
		return dfsHight(node) != -1;
	}
	
	public static int dfsHight(Node node) {
		if(node == null) return 0;
		int leftHight = dfsHight(node.left);
		if(leftHight == -1) return -1;
		int rightHight = dfsHight(node.right);
		if(rightHight == - 1) return -1;
		
		if(Math.abs(leftHight - rightHight) > 1) return -1;
		return Math.max(leftHight, rightHight) +1;
	}
	
	public static int Diameter(Node node) {
		int [] diameter = new int [1];
		hight(node, diameter);
		return diameter[0];
	}
	
	public static int hight(Node node, int [] diameter) {
		if(node == null) return 0;
		int lh = hight(node.left , diameter);
		int rh = hight(node.right, diameter);
		diameter[0] = Math.max(diameter[0], lh+rh);
		return Math.max(lh, rh) + 1;
	}
	
	public static int maxPathSum(Node node) {
		int maxValue [] = new int [1];
		maxValue[0] = Integer.MIN_VALUE;
		MaxPathDown(node,maxValue);
		return maxValue[0];
	}
	
	public static int MaxPathDown(Node node, int [] maxValue) {
		if(node == null) return 0;
		int left = Math.max(0,MaxPathDown(node.left , maxValue));
		int right =  Math.max(0,MaxPathDown(node.right, maxValue));
		maxValue[0] = Math.max(maxValue[0],left + right + node.data);
		return Math.max(left , right) + node.data;
	}
	
	public static boolean isSame(Node node1 , Node node2) {
		if(node1 == null || node2 == null) return node1 == node2;
		return (node1.data == node2.data) && isSame(node1.left,node2.left) && isSame(node1.right, node2.right);
	}
	
	public static void leftBoundery(Node node, ArrayList<Integer> res ) {
		Node curr = node.left;
		while(curr != null) {
			if(isLeaf(curr) == false ) res.add(curr.data);
			if(curr.left != null)  curr =curr.left;
			else curr = curr.right;
		}
	}
	
	public static boolean isLeaf(Node node) {
		return (node.left == null && node.right == null);
	}

	public static void rightBoundery(Node node, ArrayList<Integer> res ) {
		Node curr = node.right;
		ArrayList<Integer> temp = new ArrayList<>();
		while(curr != null) {
			if(isLeaf(curr) == false) temp.add(curr.data);
			if(curr.right != null ) curr = curr.right;
			else curr = curr.left;
		}
		int i  ;
		for( i = temp.size()-1;i >= 0; --i) {
			res.add(temp.get(i));
		}
	}
	
	public static void addLeaves(Node node , ArrayList<Integer> res) {
		if(isLeaf(node))  {
			res.add(node.data);
		return ;
		}
		if(node.left != null) addLeaves(node.left, res);
		if(node.right != null) addLeaves(node.right, res);
	}
	
	public static ArrayList<Integer> PrintBoundery(Node node){
		ArrayList<Integer> ans = new ArrayList<>();
		if(isLeaf(node)== false) ans.add(node.data);
		leftBoundery(node.left, ans);
		addLeaves(node, ans);
		rightBoundery(node.right, ans);
		return ans;
	}
	
	public static List<List<Integer>> zigzag(Node node){
		Queue<Node> mq = new LinkedList<>();
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		if(node == null) return null;
		mq.offer(node);
		boolean flag = true;
		while(!mq.isEmpty()) {
			int level = mq.size();
			List<Integer> sublist = new ArrayList<>(level);
			for(int i = 0 ; i < level; i++) {
				if(mq.peek().left != null ) mq.offer(mq.peek().left);
				if(mq.peek().right != null ) mq.offer(mq.peek().right);
				if(flag == true) sublist.add(mq.poll().data);
				else sublist.add(0,mq.poll().data);
			}
			flag = !flag;
			res.add(sublist);
		}
		return res;
	}
	
	public static void printSingleChild(Node node, Node parent) {
		if(node == null) return ;
		if(parent != null && parent.left == node && parent.right ==null) {
			System.out.println(node.data);
		} else if (parent != null && parent.right == node && parent.left == null) {
			System.out.println(node.data);
		}
		printSingleChild(node.left, node);
		printSingleChild(node.right, node);
	}
	
	public static Node removeLeves(Node node) {
		if(node == null) return null;
		if(node.left == null && node.right == null) {
			return null;
		}
		node.left = removeLeves(node.left);
		node.right = removeLeves(node.right);
		return node;
	}
	
	static int tilt = 0;
	
	public static int Tilt(Node node) {
		
		if(node == null ) return 0;
		
		int ls = Tilt(node.left);
		int rs = Tilt(node.right);
		
		int ltilt = Math.abs(ls - rs);
		tilt += ltilt;
		int ts = ls + rs + node.data;
		return ts;
	}
	
	public static Node LCA(Node root , Node p, Node q) {
		if(root == null || root == p || root == q) return root;
		Node left = LCA(root.left , p , q);
		Node right = LCA(root.right , p, q);
		
	   if(left == null) return right;
	   else if(right == null) return left;
	   else return root;
		
	}
	
public static List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null) return wrapList;   
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void one(Node node) {
	Stack<Pair> st = new Stack<>();
	st.push(new Pair(node, 1));
	List<Integer> pre = new ArrayList<>();
	List<Integer> in = new ArrayList<>();
	List<Integer> post = new ArrayList<>();
	if(node == null) return;
	while(!st.isEmpty()) {
		Pair it = st.pop();
		if(it.state == 1) {
			pre.add(it.node.data);
			it.state ++;
			st.push(it);
			if(it.node.left != null) {
				st.push(new Pair(it.node.left,1));
			}
			
		} else if(it.state == 2) {
			in.add(it.node.data);
			it.state++;
			st.push(it);
			if(it.node.right != null) {
				st.push(new Pair(it.node.right, 1));
			}
		} else {
			post.add(it.node.data);
		}
	}
}
    public static boolean isSymetric(Node node) {
    	return (node == null || isSymetricChild(node.left , node.right));
    }

	private static boolean isSymetricChild(Node left, Node right) {
		if(left == null || right == null) return left == right;
		if(left.data != right.data) return false;
	return isSymetricChild(left.left, right.right) && isSymetricChild(left.right,right.left);
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
		Display(root);
		
		List<List<Integer>> a =  levelOrder(root);
		for(List<Integer> val : a ) {
			System.out.println(val);
		}
		System.out.println();
		System.out.println( "size of this tree is " + Size(root));
		System.out.println("sum =" + Sum(root));
		System.out.println(" maximum value among nodes =" + Max(root));
		System.out.println("height of this tree = " + Hight(root));
		System.out.println();
		System.out.println("level order traversal");
		ArrayList<Integer> ans = Level(root);
		for(int i = 0 ; i < ans.size() ; i++) {
			System.out.print(ans.get(i) + " ");
		}
		PreTraversal(root);
		System.out.println();
		InTraversal(root);
		System.out.println();
		PostTraversal(root);
		System.out.println();
		System.out.println();
		LevelOrder(root);
		System.out.println();
		NodetoRootPath(root, 70);
		System.out.println();
		System.out.println();
		PrintKLevelsDeep(root , 2);
		System.out.println();
		System.out.println();
//		List<List<Integer>> ans = zigzag(root);
//		for(int i = 0; i < ans.size(); i++) {
//			System.out.println(ans.get(i));
//		}
		System.out.println();
//		LeftCloneTree(root);
//		TransformLeftCloneTree(root);
		System.out.println(Diameter(root));
		System.out.println(Tilt(root));
		System.out.println(maxPathSum(root));
		
	}

}
