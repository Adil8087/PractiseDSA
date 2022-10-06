import java.util.ArrayList;
import java.util.List;

public class CombinatioSum3 {
	 public List<List<Integer>> ans= new ArrayList<>();
	    public List<List<Integer>> combinationSum3(int k, int n) {
	        
	        List<Integer> cur= new ArrayList<>();
	        sumCombination(k,n,ans,cur, 1);
	        return ans;
	    }
	    private void sumCombination(int k,int n,List<List<Integer>> ans,List<Integer> cur, int pos){
	        if( n == 0 && cur.size()==k){
	        ans.add(new ArrayList<>(cur));
	        return;    
	        }
	        if(n<0 || cur.size() > k )
	            return;
	        
	        for(int i=pos; i<=9;i++){
	            cur.add(i);
	            sumCombination(k,n-i,ans,cur, i+1);
	            cur.remove(cur.size()-1);
	        }
	    }
}
