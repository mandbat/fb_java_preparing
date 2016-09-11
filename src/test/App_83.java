package test;

/*
 * Remove Duplicates from Sorted List
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 */

public class App_83 {

	public static void main(String[] args) {

		ListNode list = ListNodeUtils.getListNodeWithDouble(6);
		ListNodeUtils.printList(list);
		list = deleteDuplicates(list);
		ListNodeUtils.printList(list);

	}

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) return head;

		int val = head.val;
		ListNode current = head;
		while (current.next != null) {
			if (val == current.next.val) {
				current.next = current.next.next;
			} else {
				val = current.next.val;
				current = current.next;
			}
		}

		return head;

	}

}
