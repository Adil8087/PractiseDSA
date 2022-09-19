import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        SumCombination(candidates, target, res, cur, 0);
        return res;
            
        }
    private void SumCombination(int[] candidates, int target, List<List<Integer>> res,
                                List<Integer> cur, int index){
        
        
        if(target == 0){
            res.add(new ArrayList(cur));
        }
        if(target < 0){
            return;
        }
        
        for(int i=index;i<candidates.length;i++){
            cur.add(candidates[i]);
            SumCombination(candidates, target-candidates[i], res, cur, i);
            cur.remove(cur.size()-1);
        }
    }
}


