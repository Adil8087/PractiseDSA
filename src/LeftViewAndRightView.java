import java.util.ArrayList;
import java.util.List;

public class LeftViewAndRightView {

	
public List<Integer> rightSideView(TreeNode root) {
        
        if (root == null)
			return new ArrayList<Integer>();
        
        
        ArrayList<Integer> ans= new ArrayList<>();
		
        
        printRightView(root, ans, 0);
        
    
        
        return ans;
	
    }
    
    private void printRightView(TreeNode root, ArrayList<Integer> list, int height){
        if(root == null){
            return;}
        if(list.size() == height){
            
            list.add(height, root.val);
        }
        
        printRightView(root.right, list, height+1);
        printRightView(root.left, list, height+1);
    }
}
