package test;

import java.util.Random;

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

	public static ListNode getListNodeWithDouble(int count) {

		if (count == 0)
			return null;
		ListNode help = new ListNode(0);
		ListNode current = help;
		int i = 1;
		while (i <= count) {
			ListNode newNode = new ListNode(i);
			current.next = newNode;
			current = newNode;

			Random rn = new Random();
			int rv = rn.nextInt(10);
			if (rv > 2) {
				i++;
			}

		}
		return help.next;

	}

}
