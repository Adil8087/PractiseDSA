
public class ValidateBST {
	public boolean isValidBST(TreeNode root) {        
        return isValid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    public boolean isValid(TreeNode root, long max, long min){
        if(root == null) return true;
        
        return root.val > min  && root.val < max && 
            isValid(root.left, root.val, min) && 
            isValid(root.right, max, root.val);
    }
	
//	private TreeNode prev;
//	public boolean isValidBST(TreeNode node) {
//		if(node !=null) {
//			isValidBST(node.left);
//			if(prev!=null && node.val <= prev.val)
//				return false;
//			prev=node;
//			isValidBST(node.right);
//		}		
//		return true;
//		
//	}


}
