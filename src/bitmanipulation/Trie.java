package bitmanipulation;

class Node {
	Node links [] = new Node[2];
	
	public Node() {};
	
	boolean containsKey(int bit) {
		return links[bit] != null;
	}
	
     Node get(int bit) {
    	 return links[bit];
     }
     
     void put(int ind, Node node) {
    	 links[ind] = node;
     }
        
}

public class Trie {
	
   private static Node root;
	
	Trie(){
		root = new Node();
	};
	
	public static void insert(int num) {
		Node node = root;
		for(int i = 31 ; i  > 0 ; i--) {
			int bit = ((num >> i) & 1);
			if(!node.containsKey(bit)) {
				node.put(bit, new Node());
			}
			node = node.get(bit);
		}
	}
	
	public static int getMax(int num) {
		Node node = root;
		int maxNum = 0;
		for(int i = 31 ; i >= 0; i--) {
			int bit = ((num >> i) & 1);
			if(node.containsKey(1 - bit)) {
				maxNum = (maxNum | (1<<i));
				node.get(1- bit);
			}else {
				node.get(bit);
			}
		}
		return maxNum;
	}
	
	
	public static int maxXor(int arr1 [], int arr2[]) {
		for(int val : arr1) insert(val);
		int max = 0;
		for(int val : arr2) {
			max = Math.max(max, getMax(val));
		}
		return max;
	}
	
	
	
	
	

	public static void main(String[] args) {
	

	}

}
