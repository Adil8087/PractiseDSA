import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubSet2 {

	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        HashSet<List<Integer>> ans= new HashSet<>();
	        
	        List<Integer> cur= new ArrayList<>();
	        
	        Arrays.sort(nums);
	        subset(nums, 0, ans, cur);
	        return new ArrayList<List<Integer>>(ans);
	    }
	    
	    private void subset(int[] nums, int i,HashSet<List<Integer>> ans,List<Integer> cur ){
	        
	        if(i==nums.length){
	            ans.add(new ArrayList<>(cur));
	            return;
	        }
	    
	           
	        cur.add(nums[i]);
	        subset(nums, i+1, ans, cur);
	        cur.remove(cur.size()-1);
	        subset(nums, i+1, ans, cur);
	        
	    }
}
