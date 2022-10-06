import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
public List<Integer> getRow(int n) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> pre=new ArrayList<>();
        pre.add(1);
        res.add(pre);
        for(int i=2;i<=n+1;i++){
        	List<Integer> next=new ArrayList<>();
            next.add(1);
            for(int j=0;j<pre.size()-1;j++){
                next.add(pre.get(j)+pre.get(j+1));
            }
            next.add(1);
            res.add(next);
            pre=next;
            
        }
        return res.get(n);
        
    }

}
