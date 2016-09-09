package test;

public class App_24 {

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next = new ListNode(6);

		System.out.println(list.val + " " + list.next.val + " " + list.next.next.val + " " + list.next.next.next.val
				+ " " + list.next.next.next.next.val + " " + list.next.next.next.next.next.val);
		list = swapPairs(list);
		System.out.println(list.val + " " + list.next.val + " " + list.next.next.val + " " + list.next.next.next.val
				+ " " + list.next.next.next.next.val + " " + list.next.next.next.next.next.val);

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
