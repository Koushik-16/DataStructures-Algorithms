package trees;

public class Maxdepth {
	
	class Solution {
	    public int maxDepth(Node root) {
	        if (root == null) 
	            return 0; 
	        else  { 
	            int lDepth = maxDepth(root.left); 
	            int rDepth = maxDepth(root.right);
	            if (lDepth > rDepth) 
	                return (lDepth + 1); 
	             else 
	                return (rDepth + 1);
	        }
	        
	    }
	}

}
