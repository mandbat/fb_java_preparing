package test;

/*
 * Same Tree
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */

public class App_100 {

	public static void main(String[] args) {

		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.left.left = new TreeNode(3);

		System.out.println(isSameTree(p, q));
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;

		if (p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else {
			return false;
		}

	}

}
