import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        
        getSum(candidates,target, ans, cur, 0 );
        return ans;
        
    }
    private void getSum(int[] candidates, int target,List<List<Integer>> ans, 
                        List<Integer> cur, int pos ){
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        
        if(target < 0)
            return;
        
        
        for(int i=pos;i<candidates.length;i++){
            if(i>pos && candidates[i] == candidates[i-1] )continue;
            cur.add(candidates[i]);
            getSum(candidates,target-candidates[i], ans, cur, i+1 );
            cur.remove(cur.size()-1);
        }
    }
}
