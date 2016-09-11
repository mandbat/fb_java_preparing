package test;

/*
 * Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */

public class App_21 {

	public static void main(String[] args) {
		App_21 app = new App_21();
		ListNode list1 = ListNodeUtils.getListNodeWithDouble(6);
		ListNode list2 = ListNodeUtils.getListNodeWithDouble(6);

		ListNodeUtils.printList(list1);
		ListNodeUtils.printList(list2);

		ListNode listResult = app.mergeTwoLists(list1, list2);
		ListNodeUtils.printList(listResult);
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode help = new ListNode(0);
		ListNode current = help;
		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					current.next = l1;
					l1 = l1.next;
				} else {
					current.next = l2;
					l2 = l2.next;
				}
				current = current.next;
			} else if (l1 != null) {
				current.next = l1;
				l1 = l1.next;
				current = current.next;
			} else {
				current.next = l2;
				l2 = l2.next;
				current = current.next;
			}
		}
		return help.next;
	}
}
