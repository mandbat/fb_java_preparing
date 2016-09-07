package test;

public class App_226 {

	public static void main(String[] args) {

		TreeNode t = new TreeNode(0);
		t.left = new TreeNode(1);
		t.left.left = new TreeNode(2);
		t.left.right = new TreeNode(3);
		t.left.right.left = new TreeNode(4);
		t.left.right.right = new TreeNode(5);

		t.right = new TreeNode(6);
		t.right.right = new TreeNode(7);
		t.right.right.right = new TreeNode(8);
		t.right.right.right.left = new TreeNode(9);
		t.right.right.right.left.right = new TreeNode(10);

		System.out.println(invertTree(t));

	}

	public static TreeNode invertTree(TreeNode root) {

		if (root == null)
			return root;

		if (root.left != null || root.right != null) {
			TreeNode temp;
			temp = root.left;
			root.left = root.right;
			root.right = temp;
		}

		if (root.left != null) {
			invertTree(root.left);
		}

		if (root.right != null) {
			invertTree(root.right);
		}

		return root;

	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
