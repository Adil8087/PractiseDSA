
public class PathSum {

	public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean ans=false;
        if(root == null)
            return ans;
        int sum=targetSum-root.val;
        if(sum==0 && root.left==null && root.right==null)
            return ans=true;
        if(root.left!=null)
            ans=ans|| hasPathSum(root.left, sum);
        if(root.right!=null)
            ans=ans|| hasPathSum(root.right, sum);
        
        return ans;
    }
}
