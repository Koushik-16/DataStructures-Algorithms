package linkedList;

//import java.util.*;
//
//public class HackerRank {
//	 static void reversePrint(SinglyLinkedListNode head) {
//	        if(head == null) return;
//	        
//	        Stack<SinglyLinkedListNode> stack = new Stack();
//	        SinglyLinkedListNode temp = head;
//	        while(temp != null) {
//	            stack.add(temp);
//	            temp = temp.next;
//	        }
//	        while(!stack.isEmpty()) {
//	            SinglyLinkedListNode node = stack.pop();
//	            System.out.println(node.data);
//	        }
//
//
//	    }
//	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//        SinglyLinkedListNode temp1 = head1;
//        SinglyLinkedListNode temp2 = head2;
//        
//        while(temp1 != temp2) {
//            if(temp1.next == null) {
//                temp1 = head2;
//            } else {
//                temp1 = temp1.next;
//            }
//            if(temp2.next == null) {
//                temp2 = head1;
//            } else {
//                temp2 = temp2.next;
//            }
//        }
//
//         return temp1.data;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//
//}
//static boolean hasCycle(SinglyLinkedListNode head) {
//    if(head == null) return false;
//    
//    SinglyLinkedListNode slow = head;
//    SinglyLinkedListNode fast = head.next;
//    
//    while(fast != null && fast.next != null) {
//        if( slow == fast) {
//            return true;
//        }
//        slow = slow.next;
//        fast = fast.next.next;
//    }
//
//     return false;
//}
//static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
//    if(head == null ) return head;
//    SinglyLinkedListNode temp = head;
//    
//    while(head.next != null) {
//        if(head.data == head.next.data) {
//            head.next = head.next.next;
//          } else {
//           head = head.next; 
//        }
//    }
//
//    return temp;
//}
//static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
//    if(head == null) return head;
//    SinglyLinkedListNode prev = null;
//    SinglyLinkedListNode temp = head;
//    while(temp != null ) {
//        SinglyLinkedListNode nextnode = temp.next;
//        temp.next = prev;
//        prev = temp;
//        temp = nextnode;
//    }
//    return prev;

//static void removeDuplicate(node head)
//{
//    // Hash to store seen values
//    HashSet<Integer> hs = new HashSet<>();
// 
//    /* Pick elements one by one */
//    node current = head;
//    node prev = null;
//    while (current != null)
//    {
//        int curval = current.val;
//         
//         // If current value is seen before
//        if (hs.contains(curval)) {
//            prev.next = current.next;
//        } else {
//            hs.add(curval);
//            prev = current;
//        }
//        current = current.next;
//    }
////}
//static boolean removeLoop(Node h)
//{
//    HashSet<Node> s = new HashSet<Node>();
//    Node prev = null;
//    while (h != null) {
//        // If we have already has this node
//        // in hashmap it means their is a cycle and we
//        // need to remove this cycle so set the next of
//        // the previous pointer with null.
//
//        if (s.contains(h)) {
//            prev.next = null;
//            return true;
//        }
//
//        // If we are seeing the node for
//        // the first time, insert it in hash
//        else {
//            s.add(h);
//            prev = h;
//            h = h.next;
//        }
//    }
//
//    return false;
//}