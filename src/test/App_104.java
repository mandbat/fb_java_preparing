package test;
/* 
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */


public class App_104 {

	public static void main(String[] args) {

		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(1);
		t.left.left = new TreeNode(1);
		t.left.right = new TreeNode(1);
		t.left.right.left = new TreeNode(1);

		t.right = new TreeNode(1);
		t.right.right = new TreeNode(1);
		t.right.right.right = new TreeNode(1);
		t.right.right.right.left = new TreeNode(1);
		t.right.right.right.left.right = new TreeNode(1);

		System.out.println(maxDepth(t));
	}

	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		int bigger = Math.max(leftDepth, rightDepth);
		return bigger + 1;
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
