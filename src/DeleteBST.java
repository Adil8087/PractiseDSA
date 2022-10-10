
public class DeleteBST {
public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
            return root;
        if(key < root.val){
            root.left=deleteNode(root.left,key);
        }else if(key > root.val){
            root.right= deleteNode(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
             root.val= minValue(root.right);
            root.right= deleteNode(root.right, root.val);
            
        }
        return root;
        
    }
    
    private int minValue(TreeNode current){
        int minV=current.val;
        while(current.left != null){
            minV=current.left.val;
            current=current.left;
        }
        
        return minV;
    }
}
