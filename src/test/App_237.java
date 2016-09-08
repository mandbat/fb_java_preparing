package test;

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
