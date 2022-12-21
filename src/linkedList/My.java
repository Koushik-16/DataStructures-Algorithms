package linkedList;

public class My {
	
	class ListNode {
		int val;
		ListNode next;
		
		ListNode(){
			
		}
		ListNode(int val){
			this.val = val;
		}
	}
	
//	public static ListNode reverseInKGroups(ListNode head, int k) {
//		if(head == null || head.next == null) return head;
//		ListNode oh = null , ot = null;
//		int length  = length(head);
//		ListNode curr = head;
//		while(length >= k) {
//			int tempk = k;
//			while(tempk -- > 0) {
//				
//			}
//		}
//		
//	}
	
	
	
	private static int length(ListNode head) {
		int length = 0; ListNode curr = head;
		while(curr != null) {
			curr = curr.next;
			length++;
		}
		return length;
	}



	public static void main(String[] args) {
		
	}

}
