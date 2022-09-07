
public class AscArraytoBSTHeightBalnced {
	
}



 
class Solution {
    
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return sortedArrayToBST(nums, 0, nums.length-1);
        
    }
    public TreeNode sortedArrayToBST(int[] nums, int start,int end) {
        int rootPos= (start+end)/2;
        TreeNode root= new TreeNode(nums[rootPos]);
        if(start < rootPos)
        root.left = sortedArrayToBST(nums, start, rootPos-1);
        if(end > rootPos)
        root.right= sortedArrayToBST(nums, rootPos+1, end);
        
        return root;
        
        
    }
}
