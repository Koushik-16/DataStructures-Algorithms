package linkedList;

public class All {
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode random;
		
		ListNode(){}
		
		ListNode(int val){
			this.val = val;
		}
		
		ListNode(int val , ListNode next){
			this.val = val ;
			this.next = next;
		}
	}
	
	public static ListNode swapPairs(ListNode A) {
        if(A== null || A.next == null) return A;
        ListNode dummy = new ListNode(-1);
        dummy.next = A;
        ListNode pre = dummy;
        ListNode curr = A;
        while(curr != null && curr.next != null){
            pre.next = curr.next;
            curr.next = curr.next.next;
            pre.next.next = curr;
            curr = curr.next;
            pre = pre.next.next;
        }
        return dummy.next;
    }
	
	public static ListNode reverse(ListNode head) {
		ListNode newHead = null;
		while(head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}
	
	public static ListNode removeNthNode(ListNode head, int position) {
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode fast = dummy;
		ListNode slow = dummy;
		for(int i = 1; i <= position; ++i) {
			fast = fast.next;
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
	
	public static ListNode findMid(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static ListNode mergeTwoSortedList(ListNode l1 , ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val > l2.val) {
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		ListNode res = l1;
		while(l1 != null && l2 != null) {
			ListNode tmp = null;
			while(l1 != null && l1.val <= l2.val) {
				tmp = l1;
				l1 = l1.next;
			}
			tmp.next = l2;
			
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		return res;
	}
	
	public static void deleteTheNode(ListNode node) {
		if(node.next == null) {
			node = null;
		} else {
	     node.val = node.next.val;
	     node.next = node.next.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		int carry = 0;
		while(l1 != null || l2 != null || carry == 1) {
			int sum = 0;
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null)  {
				sum += l2.val;
				l2 = l2.next;
			}
			sum +=carry;
			carry = sum / 10;
			ListNode node = new ListNode(sum %10);
			temp.next = node;
			temp = temp.next;	
		}
		return dummy.next;
	}
	
	public static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) return true;
		ListNode slow = findMid(head);
		slow.next = reverse(slow.next);
		slow = slow.next;
		while(slow != null) {
			if(head.val != slow.val) {
				return false;
			} else {
				head = head.next;
				slow = slow.next;
			}
		}
		return true;	
	}
	
	public static boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) return false;
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast  = fast.next.next;
			if(slow == fast) return true;
		}
		return false;
		
	}
	
	public static ListNode reverseInKGroup(ListNode head, int k) {
		if(head == null || k == 1) return head;
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode curr = dummy, nex = dummy , pre = dummy;
		int count = 0;
		while(curr.next != null) {
			curr = curr.next;
			count ++;
		}
		while(count >= k) {
			curr = pre.next;
			nex = curr.next;
			for(int i = 1 ; i < k ; i++) {
				curr.next = nex.next;
				nex.next = pre.next;
				pre.next = nex;
				nex = curr.next;
			}
			pre = curr;
			count -= k;
		}
		return dummy.next;
	}
	
	public static ListNode startingPointOfCycle(ListNode head) {
		if(head == null || head.next == null) return null;
		ListNode slow = head;
		ListNode fast = head;
		ListNode entry = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		    if(slow == fast ) {
		    	while(slow != entry ) {
		    		slow = slow.next;
		    		entry = entry.next;
		    	}
		    	return slow;
		    }
		}
		return null;
	}
	
	public static ListNode rotate(ListNode head, int k ) {
		if(head == null || head.next == null || k ==0) return head;
		int count = 1;
		ListNode curr = head;
		while(curr.next != null) {
			curr = curr.next;
			count ++;
		}
		if(k == count ) return head;
		 k = count - k % count;
		curr.next = head;
		while(k -- > 0) {
			curr = curr.next;
		}
		head = curr.next;
		curr.next = null;
        return head;
		
	}
	
	public static void copyList(ListNode head) {
	   ListNode curr = head ;
	   while(curr != null ) {
		   ListNode forw = curr.next;
		   ListNode node = new ListNode(curr.val);
		   curr.next =  node;
		   node.next =  forw;
		   curr = forw;
	   }
	}
	
	public static void copyRandomPointer(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			ListNode random =  curr.random;
			if(random != null) {
				curr.next.random = random.next;
				curr = curr.next.next;
			}
		}
		
	}
	
	public static ListNode extractDeepCopy(ListNode head) {
		ListNode dummy = new ListNode();
		ListNode prev = dummy,curr = head;
		while(curr != null) {
			prev.next =  curr.next;
			curr.next = curr.next.next;
			prev = prev.next;
			curr = curr.next;
		}
		return dummy.next;
	}
	
	public static ListNode copyRandomList(ListNode head) {
		copyList(head);
		copyRandomPointer(head);
		return  extractDeepCopy(head);
	}
	
	
	public ListNode reverseInKGroup2(ListNode head , int k ) {
		if(head == null || head.next == null) return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;
		
		while(prev.next != null) {
			ListNode nn = prev.next;
			int c = 1;
			while(c < k && nn.next != null) {
				nn = nn.next;
				c++;
			}
			ListNode tail = nn.next;
			nn.next = null;
			prev.next = reverse(prev.next);
			
			while(prev.next != null) prev = prev.next;
			prev.next = tail;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		
	}

}
