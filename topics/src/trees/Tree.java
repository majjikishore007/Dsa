package trees;

import java.util.Stack;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Tree {
	TreeNode root;

	public Tree(int data) {
		root = new TreeNode(data);
	}

	// Traversals
	// 1.pre order ( Curr , Left and Right)
	// Time complexity O(N)
	// Space O(N) stack space

	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void preOrderIterateive(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();

		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode curr = stack.pop();
			System.out.println(curr.data);

			if (curr.right != null) {
				stack.push(curr.right);

			}
			if (curr.left != null) {

				stack.push(curr.left);
			}
		}

	}

	// postOder (left,right,curr)
	// Time complexity O(N)
	// Space O(N) stack space
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

	// TODO:
	public void postOrderIterative(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		TreeNode prev = null;
		while (!stack.isEmpty()) {
			TreeNode curr = stack.peek();
			if (prev == null || prev.left == curr || prev.right == curr) {
				if (curr.left != null) {
					stack.push(curr.left);
				}
				else if (curr.right != null) {
					stack.push(curr.right);
				}
			} else if (curr.left == prev) {
				if (curr.right != null) {
					stack.push(curr.right);
				}
			} else {
				stack.pop();
				System.out.println(curr.data);
			}
			prev = curr;
		}

	}

	// left curr,right
	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	public void inOrderIterative(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;

		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			System.out.println(curr.data);
			curr = curr.right;

		}

	}

	public static void main(String[] args) {
		Tree tree = new Tree(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);

		tree.postOrderIterative(tree.root);
	}
}
