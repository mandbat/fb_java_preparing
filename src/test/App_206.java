package test;

/*
 * Reverse Linked List  
 * 
 * Reverse a singly linked list.
 */

public class App_206 {

	public static void main(String[] args) {

		ListNode head = ListNodeUtils.getListNode(6);
		ListNodeUtils.printList(head);
		head = reverseList(head);
		ListNodeUtils.printList(head);

	}

	public static ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;

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
