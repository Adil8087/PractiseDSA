import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations2 {
	public List<List<Integer>> permute(int[] nums) {
        HashSet<List<Integer>> res= new HashSet<List<Integer>>();
        boolean[] visited = new boolean[nums.length];
        perm(nums, res, visited, new ArrayList<>());
        return new ArrayList<List<Integer>>(res);
    }
    
    private void perm(int[] nums,HashSet<List<Integer>> res,boolean[] visited,List<Integer> cur){
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
