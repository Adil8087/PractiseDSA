import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class RightView {

	public List<Integer> rightSideView(TreeNode root) {
		if (root == null)
			return null;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 1; i <= n; i++) {
				TreeNode temp = queue.poll();
				if (i == n)
					list.add(temp.val);
				if (temp.left != null) {
					// values
					queue.offer(temp.left);
				}
				if (temp.right != null) {
					queue.offer(temp.right);
				}
			}
		}
		return list;
	}


}
