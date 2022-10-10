
public class LOwestCommonAncestors {

	/*
	 * public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	 * if(root == null ) return root;
	 * 
	 * if((p.val < root.val) && (q.val < root.val) ) return
	 * lowestCommonAncestor(root.left,p,q); if ((p.val > root.val) && (q.val >
	 * root.val) ) return lowestCommonAncestor(root.right,p,q);
	 * 
	 * return root;
	 * 
	 * 
	 * }
	 */
	
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode  q) {
        
        if(root == null ) return null;
        if(root.val == p.val || root.val == q.val)
            return root;
        
        TreeNode L =lowestCommonAncestor(root.left, p,q);
        TreeNode R =lowestCommonAncestor(root.right, p,q);
        
        if(L!=null && R!=null)
            return root;
        else if(L==null && R!=null)
            return R;
        else if(L!=null && R==null)
            return L;
        else return null;
        

    
    }
}
