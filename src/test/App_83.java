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

		ListNode list = ListNodeUtils.getListNode(6);
		ListNodeUtils.printList(list);
		list = deleteDuplicates(list);
		ListNodeUtils.printList(list);

	}

	public static ListNode deleteDuplicates(ListNode head) {

		return head;

	}

}
