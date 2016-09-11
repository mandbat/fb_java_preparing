package test;

/*
 * Swap Nodes in Pairs
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. 
 * You may not modify the values in the list, only nodes itself can be changed.
 */

public class App_24 {

	public static void main(String[] args) {

		ListNode list = ListNodeUtils.getListNode(6);

		ListNodeUtils.printList(list);
		list = swapPairs(list);
		ListNodeUtils.printList(list);

	}

	public static ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode veryFirst = new ListNode(0);
		veryFirst.next = head;
		ListNode current = veryFirst;

		while (current.next != null && current.next.next != null) {
			ListNode l1 = current.next;
			ListNode l2 = current.next.next;

			current.next = l2;
			l1.next = l2.next;
			l2.next = l1;
			current = l1;
		}
		return veryFirst.next;
	}
}
