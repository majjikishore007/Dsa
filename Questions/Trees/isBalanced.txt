class Solution {
	/* This is the Node class definition
	
	class Node {
		public Node left;
		public Node right;
		public int data;

		public Node(int data) {
			this.data = data;
		}
	}
	*/
    boolean res=true;
	boolean isBinaryTreeBalanced(Node root) {
	    // add your logic here
        helper(root);
        return res;
	}
    public int helper(Node root) {
        if (root==null) {
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        if(Math.abs(left-right)>1){
            res=false;
        }
        return 1+Math.max(left,right);
    }
}