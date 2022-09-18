import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        rec(nums, 0, ans, cur);
        return ans;
    }
    private void rec(int[] nums, int i, List<List<Integer>> ans,List<Integer> cur){
        if(i == nums.length){
            ans.add(new ArrayList<Integer>(cur));
            return;
        }
        cur.add(nums[i]);
        rec(nums, i+1, ans,cur);
        cur.remove(cur.size()-1);
        rec(nums, i+1, ans,cur);
    }
}
