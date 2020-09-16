
public class BinarySearchTree {
	TreeNode head;
	
	/*
	 * BinarySearchTree constructor
	 */
	public BinarySearchTree () {
		head = null;
	}
	/*
	 * Getter for head variable
	 */
	public TreeNode getHead() {
		return head;
	}

	/*
	 * overloaded method that sets head TreeNode by delegating to other insert method
	 */
	public void insert(int val) {
		head = insert(head, val);
	}
	
	/*
	 * Method that takes in a value and inserts it into the BinarySearchTree
	 */
	public TreeNode insert(TreeNode node, int val) {
		if(node == null) {
			TreeNode newNode = new TreeNode(val);
			return newNode;
		} 
		if(val <= node.getValue()) {
			node.setLeft(insert(node.getLeft(), val));
		}
	        else if (val > node.getValue()) {  
	        	node.setRight(insert(node.getRight(), val));
		}
		return node;
	}
	
	/*
	 * Method that takes in a value and delegates to another overloaded search method
	 */
	public boolean search(int val) {
		return search(head, val);
	}

	/*
	 * Method that takes in a value and the node of a binary search tree to check if the value passed in is in the 
	 * binary search tree  
	 */
	public boolean search(TreeNode node, int val) {
		while(node != null) {
			
			if(node.getValue() == val) {
				return true;
			}
			else if(node.getRight() != null && node.getRight().getValue() == val) {
				return true;
			} 
			else if(node.getLeft() != null && node.getLeft().getValue() == val) {
				return true;
			}
			else return  search(node.getRight(), val) || search(node.getLeft(), val);
		}

		return false;
	}
	
	/*
	 *  In order traversal of the binary search tree that returns the content of the tree as a string
	 */
	public String toString(TreeNode node) {
		String result = "";
		if(node != null) {
			result += toString(node.getLeft());
			result += node.getValue() + " ";
			result += toString(node.getRight());
		}
			return result;
	}
	
	/*
	 *  Pre-order traversal of the binary search tree that returns the content of the tree as a string
	 */
	public String preOrderToString(TreeNode node) {
		String result = "";
		if(node != null) {
			result += node.getValue() + " ";
			result += preOrderToString(node.getLeft());
			result += preOrderToString(node.getRight());
		}
			return result;
	}
	
	/*
	 *  Post-order traversal of the binary search tree that returns the content of the tree as a string
	 */
	public String postOrderToString(TreeNode node) {
		String result = "";
		if(node != null) {
			result += postOrderToString(node.getLeft());
			result += postOrderToString(node.getRight());
			result += node.getValue() + " ";
		}
			return result;
	}
	
	public static void main(String[] args) {
		BinarySearchTree tr = new BinarySearchTree();
		tr.insert(41);
		tr.insert(55);
		tr.insert(34);
		tr.insert(21);
		tr.insert(5);
		tr.insert(55);
		tr.insert(32);
		tr.insert(12);
		tr.insert(68);
		
		System.out.println("In-order traversal of the binary search tree:");
		System.out.println(tr.toString(tr.getHead()) + "\n");
		
		System.out.println("Pre-order traversal of the binary search tree: ");
		System.out.println(tr.preOrderToString(tr.getHead()) + "\n");
		
		System.out.println("Post-order traversal of the binary search tree: ");
		System.out.println(tr.postOrderToString(tr.getHead()) + "\n");
		
		int[] nums = {33, 41, 55, 68, 21, 57};
		
		for(int e: nums) {
			System.out.println("Is " + e + " in the binary search tree?");
			if(tr.search(e) == true)
				System.out.println("Yes\n");
			else System.out.println("No\n");
		}
		
	}
	}







