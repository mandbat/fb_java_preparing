package test;

public class App_100 {

	public static void main(String[] args) {

		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(2);

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
