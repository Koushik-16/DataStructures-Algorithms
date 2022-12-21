package linkedList;

public class ReverseInKGroups {
	
	class ListNode {
		int val;
		ListNode next; 
	}
	
	
	
	  private int size(ListNode node){
	        int n=0;
	        while(node!=null){
	            node=node.next;
	            n++;
	        }
	        return n;
	    }
	    
	    private ListNode reverseKGroup_(ListNode node, int k,int size){
	        
	        if(size<k){
	            return node;
	        }
	        if(node==null) return null;
	        ListNode current = node;
	        ListNode next = null, prev = null;
	        int count = 0;
	 
	        /*1) reverse first k nodes of the linked list */
	        while (current != null && count < k) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	            count++;
	        }
	         
	        if (current != null) {
	            node.next=reverseKGroup_(current,k,size-k);
	        }
	        
	        return prev;
	        
	        
	    }
	    public ListNode reverseKGroup(ListNode node, int k) {
	        
	        int n=size(node);
	        
	        return reverseKGroup_(node,k,n);
	        
	    }

	public static void main(String[] args) {
		

	}

}
