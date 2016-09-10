package test;

/*
 * Reverse Linked List  
 * 
 * Reverse a singly linked list.
 */

public class App_206 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		System.out.println("" + head.val + head.next.val + head.next.next.val + head.next.next.next.val
				+ head.next.next.next.next.val + head.next.next.next.next.next.val);
		head = reverseList(head);
		System.out.println("" + head.val + head.next.val + head.next.next.val + head.next.next.next.val
				+ head.next.next.next.next.val + head.next.next.next.next.next.val);

	}

	public static ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) return head;
		
		ListNode temp = new ListNode(0);
		temp.next = head.next;
		head.next = null;
		
		ListNode help = new ListNode(0);
		help.next = head;
		
		while (temp.next != null) {
			ListNode t = temp.next;
			temp.next = temp.next.next;
			t.next = help.next;
			help.next = t;
		}

		return help.next;

	}

}
