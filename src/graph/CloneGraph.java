package graph;
import java.util.*;

public class CloneGraph {
	
	static class Node{
		public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
	
	public static Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Integer,Node> map = new HashMap<>();
        Node f = new Node(node.val);
        map.put(f.val,f);
        dfs(node,f,map);
        return f; 
        
    }
    public static void dfs(Node node,Node curr,HashMap<Integer,Node> map){
              
        for(Node it : node.neighbors ){
            if(curr.neighbors == null){
              ArrayList<Node> list   = new ArrayList<>();
              curr.neighbors = list;
            }
            if(map.containsKey(it.val))curr.neighbors.add(map.get(it.val));
            if(!map.containsKey(it.val)){
               Node n = new Node(it.val);
               curr.neighbors.add(n);
                map.put(n.val,n);
                dfs(it,n,map);
            }
            
        } 
    }

	public static void main(String[] args) {
		

	}

}
