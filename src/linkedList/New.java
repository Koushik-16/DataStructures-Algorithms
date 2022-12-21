package linkedList;

import java.util.*;

public class New {
	
	public static class Node{
		int data;
		Node next;
	}

	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		
		void addLast(int val ) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			
		    if(size == 0) {
			   head = tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
		  size ++;
		}
		void diaplay() {
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		void removeFirst() {
			if(size == 0) {
				System.out.println(" List is empty");
			} else if (size == 1) {
				head = tail = null;
				size = 0;
			} else {
				head = head.next;
				size--;
			}
		}
		void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head ;
			head = temp;
			
			if(size == 0) {
				tail = temp;
			}
			size ++;
		}
		void addidx(int idx, int val) {
			if(idx < 0 || idx > size) {
				System.out.println("Invalid arguments");
			} else if (idx == 0) {
				addFirst(val);
			} else if (idx == size ) {
				addLast(val);
			} else {
				Node node = new Node();
				node.data = val;
				Node temp = head;
				for(int i = 0 ; i < idx-1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				size++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		

	}

}
