import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	List<String> nums= new ArrayList<String>();
	
	public static void main(String[] args) {
		
		String s="";
		
		s+= "new";
		
		s += "->>>>> New";
		
		System.out.println(s);
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
        treePath(root,"");
        return nums;
  }

	private void treePath(TreeNode root, String ans) {
		
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null ) {
			ans += root.val;
			nums.add(ans);
			return;
		}
		ans +=root.val+"->";
		treePath(root.left, ans);
		treePath(root.right,ans);
		
	}

	

}
