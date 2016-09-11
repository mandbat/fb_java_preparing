package test;

/*
 * Lowest Common Ancestor of a Binary Search Tree
 * 
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: 
 * “The lowest common ancestor is defined between two nodes v and w as the lowest node in T
 * that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 *        _______6______
 *       /              \
 *   ___2__          ___8__
 *  /      \        /      \
 *  0      _4       7       9
 *        /  \
 *        3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. 
 * Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant 
 * of itself according to the LCA definition.
 */

public class App_235 {

	public static void main(String[] args) {
		App_235 app = new App_235();
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		TreeNode l = root.left;
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		TreeNode r = root.left.right;
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);

		root.right = new TreeNode(8);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);

		System.out.println(app.lowestCommonAncestor(root, l, r));
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		TreeNode m = root;

		if (m.val > p.val && m.val < q.val) {
			return m;
		} else if (m.val > p.val && m.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (m.val < p.val && m.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}

		return root;
	}

}
