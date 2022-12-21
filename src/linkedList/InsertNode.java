package linkedList;

import linkedList.All.ListNode;

public class InsertNode {
	
	public static class ListNode{
		int val;
		ListNode next;
		
		ListNode(){}
		
		ListNode(int val){
			this.val = val;
		}
		
		ListNode(int val , ListNode next){
			this.val = val ;
			this.next = next;
		}
	}
	
	
//	public static ListNode insert(ListNode head , int position , int data) {
//		ListNode dummy = new ListNode();
//		dummy.next = head;
//		ListNode toadd = new ListNode(data);
//		if(position == 1) {
//			dummy.next = toadd;
//			toadd.next = head;
//			return dummy.next;
//		}else {
//			
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
