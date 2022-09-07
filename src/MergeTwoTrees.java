


class MergeTwoTrees {
    public TreeNode mergeTrees(TreeNode P, TreeNode Q) {
     
        if(P == null && Q== null)
            return null;
        
        
        if(P == null && Q!= null)
            return Q;
        if(P != null && Q== null)
            return P;
            
        
        TreeNode ans= new TreeNode(P.val+ Q.val);
        ans.left= mergeTrees(P.left, Q.left);
        ans.right= mergeTrees(P.right, Q.right);
    
        return ans;
    }
}