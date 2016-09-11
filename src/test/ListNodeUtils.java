package test;

public class ListNodeUtils {

	public static void printList(ListNode list) {

		ListNode help = new ListNode(0);
		help.next = list;

		while (help.next != null) {
			System.out.print("[" + help.next.val + "] -> ");
			help = help.next;
		}
		System.out.println("NULL");

	}

	public static ListNode getListNode(int count) {

		if (count == 0)
			return null;
		ListNode help = new ListNode(0);
		ListNode current = help;
		for (int i = 1; i <= count; i++) {
			ListNode newNode = new ListNode(i);
			current.next = newNode;
			current = newNode;
		}
		return help.next;

	}

}
