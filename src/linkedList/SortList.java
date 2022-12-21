package linkedList;

import linkedList.All.ListNode;

public class SortList {
	
	public static  ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        temp.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left,right);
    }
    public static  ListNode merge(ListNode l1 , ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null){
            curr.next = l1;
            l1 = l1.next;
            curr = curr.next;
        }
         if(l2 != null){
            curr.next = l2;
            l2 = l2.next;
            curr = curr.next;
        }
        return temp.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
