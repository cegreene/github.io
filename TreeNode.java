
public class TreeNode {
	private int value;
	TreeNode left;
	TreeNode right;
	
	/*
	 * TreeNode constructor with no inputs
	 */
	public TreeNode() {
		value = 0;
		left = null;
		right = null;
	}
	
	/*
	 * TreeNode constructor given value
	 */
	public TreeNode(int val) {
		value = val;
		left = null;
		right = null;
	}
	
	/*
	 * Getters and setters for left, right, and value instance variables
	 */
	public TreeNode getLeft() {
		return left;
	}
	public TreeNode getRight() {
		return right;
	}
	public int getValue() {
		return value;
	}
	public void setRight(TreeNode tr) {
		right = tr;
	}
	public void setLeft(TreeNode tr) {
		left = tr;
	}
	public void setValue(int val) {
		value = val;
	}
	
}
