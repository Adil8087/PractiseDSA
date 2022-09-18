import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        perm(nums, res, visited, new ArrayList<>());
        return res;
    }
    
    private void perm(int[] nums,List<List<Integer>> res,boolean[] visited,List<Integer> cur){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int i=0;i<nums.length; i++){
            if(visited[i]==true) continue;
            cur.add(nums[i]);
            visited[i]=true;
            perm(nums,res,visited,cur);
            cur.remove(cur.size()-1);
            visited[i]=false;
        }
    }
}
