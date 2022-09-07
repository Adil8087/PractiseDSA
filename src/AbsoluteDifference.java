import java.util.ArrayList;
import java.util.List;

public class AbsoluteDifference {
//	class Solution {
//	     public static int min = Integer. MAX_VALUE;
//	     public int getMinimumDifference(TreeNode root) {
//	         if(root == null)
//	             return Integer. MAX_VALUE;
//	         if(root.left !=null )
//	             min= Math.min(min, Math.abs(root.val- root.left.val));
//	         if(root.right != null)
//	             min= Math.min(min, Math.abs(root.val- root.right.val));

//	         int fmin= Math.min(getMinimumDifference(root.left), getMinimumDifference(root.right));

//	         return Math.min(min,fmin);
//	     }
	// }

	public List<Integer> nums = new ArrayList<>();

	public int getMinimumDifference(TreeNode root) {
		inorder(root);
		int min = Integer.MAX_VALUE;

		for (int i = 1; i < nums.size(); i++) {
			min = Math.min(min, nums.get(i) - nums.get(i - 1));
		}
		return min;

	}

	private void inorder(TreeNode root) {
		if (root.left != null)
			inorder(root.left);

		nums.add(root.val);

		if (root.right != null)
			inorder(root.right);

	}

}
