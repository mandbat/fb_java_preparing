package test;

/*
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */

public class App_237 {

	public static void main(String[] args) {

		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);

		deleteNode(list);
	}

	public static void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;

	}

}
