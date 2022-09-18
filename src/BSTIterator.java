import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import org.w3c.dom.Node;

/*
 * public class BSTIterator {
 * 
 * private List<Integer> BSTlist; private int curr = -1;
 * 
 * public BSTIterator(TreeNode root) { BSTlist = new ArrayList<Integer>();
 * inorder(root); }
 * 
 * // private void inorder(TreeNode root) { // if (root == null) // return; //
 * if (root.left != null) // inorder(root.left); // BSTlist.add(root.val); // if
 * (root.right != null) // inorder(root.right); // // } private void
 * inorder(TreeNode root) { if (root == null) return;
 * 
 * 
 * Stack<TreeNode> s = new Stack<TreeNode>(); TreeNode curr = root; while (curr
 * != null || s.size() > 0) { while (curr != null) { s.push(curr); curr =
 * curr.left; } curr = s.pop(); BSTlist.add(curr.val); curr = curr.right; } }
 * 
 * public int next() {
 * 
 * return BSTlist.get(++curr);
 * 
 * }
 * 
 * public boolean hasNext() {
 * 
 * if((curr + 1) < BSTlist.size()) return true; return false;
 * 
 * } }
 */

public class BSTIterator {
	
	TreeNode curr;
	TreeNode prev;
	public BSTIterator(TreeNode root) {
		curr= root;
		while(curr.left != null) {
			prev=curr;
			curr=curr.left;
		}
	}
	
	public int next() {
		int val=curr.val;
		if(curr.right!=null) {
			TreeNode inOrderSuc= curr.right;
			while(inOrderSuc.left != null)
				inOrderSuc= inOrderSuc.left;
			
			curr=inOrderSuc;
			
		}
		else
			curr=prev;
		
		return val;
	}
	
	public boolean hasNext() {
		return curr !=null ? true : false;
	}
	
}
