package test;

import java.util.ArrayList;

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

		if (head == null) return null;
		if (head.next == null) return head;
		ArrayList<ListNode> list = new ArrayList<>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}

		int i = list.size() - 1;
		head = list.get(i);
		i--;
		ListNode current = head;
		while (i >= 0) {
			current.next = list.get(i);
			current = current.next;
			i--;
		}

		return head;

	}

}
