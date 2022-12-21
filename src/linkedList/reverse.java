//package linkedList;
//
//public class reverse {
//	
//	public static ListNode reverse(ListNode head) {
//		if(head == null || head.next == null) return head;
//		ListNode newHead = reverse(head.next);
//		ListNode headNext  = head.next;
//		headNext.next = head;
//		head.next = null;
//		return newHead;
//	}
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}
