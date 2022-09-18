import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeZigZagTransversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        
        boolean checkValue=true;
        List<List<Integer>> anw= new LinkedList<>();
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
        	LinkedList<Integer> list= new LinkedList<Integer>();
        	int size= queue.size();
        	for(int i=0; i<size;i++) {
        		 TreeNode node= queue.poll();
        		 if(checkValue)
        			list.addFirst(node.val);
        		 else
        			 list.addLast(node.val);
        		 if(node.left !=null)
        			 queue.add(node.left);
        		 if(node.right !=null)
        			 queue.add(node.right);
        		 
        		 
        	}
        	checkValue= !checkValue;
        	anw.add(list);
        }
        
        return anw;
    }
	
	
	public ArrayList<Integer> zigZagTraversal(TreeNode root)
	{
		if(root == null)
            return new ArrayList<>();
        
        boolean checkValue=false;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
        	LinkedList<Integer> list= new LinkedList<Integer>();
        	int size= queue.size();
        	for(int i=0; i<size;i++) {
        		 TreeNode node= queue.poll();
        		 if(checkValue)
        			list.addFirst(node.val);
        		 else
        			 list.addLast(node.val);
        		 if(node.left !=null)
        			 queue.add(node.left);
        		 if(node.right !=null)
        			 queue.add(node.right);
        		 
        		 
        	}
        	checkValue= !checkValue;
        	
        	lst.addAll(list);
        }
		
		return lst;
	}
}
