/**
 * Validate BST
 * You can use recursion
 */
package practice.tree;

import java.util.Stack;

/**
 * @author gadar
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class ValidateBinarySearchTree {

	/**
	 * @param args
	 */
	private static class BstNode {
		 
	    private BstNode left;
	    private BstNode right;
	    private Integer data;
	 
	    public BstNode(Integer data) {
	        this.data = data;
	    }
	 
	    public BstNode getLeft() {
	        return left;
	    }
	    public void setLeft(BstNode left) {
	        this.left = left;
	    }
	    public BstNode getRight() {
	        return right;
	    }
	    public void setRight(BstNode right) {
	        this.right = right;
	    }
	 
	    public Integer getData() {
	        return data;
	    }
	} 
	public static void main(String[] args) {
		 BstNode root = new BstNode(1);
		    // left sub tree
		    BstNode node_2 = new BstNode(1); root.setLeft(node_2);
		    /*BstNode node_1 = new BstNode(1); node_2.setLeft(node_1);
		    BstNode node_4 = new BstNode(4); node_2.setRight(node_4);
		    // right sub tree
		    BstNode node_6 = new BstNode(6); root.setRight(node_6);
		    BstNode node_5 = new BstNode(5); node_6.setLeft(node_5);
		    BstNode node_7 = new BstNode(7); node_6.setRight(node_7);*/
		 
		    System.out.println(isBinarySearchTree(root));

	}
	
	public static boolean isBinarySearchTree(BstNode root) {
		 
        if(root == null) return Boolean.TRUE;
        return isBstValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
 
    private static boolean isBstValid(BstNode root, Integer minValue, Integer maxValue) {
 
        if(root == null) return Boolean.TRUE;
        if(root.getData() >= minValue && root.getData() < maxValue
                && isBstValid(root.getLeft(), minValue, root.getData())
                && isBstValid(root.getRight(), root.getData(), maxValue)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}
