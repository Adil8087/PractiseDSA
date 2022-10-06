import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctWindow {
	ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        int i=0;
        for( i=0;i<k;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        ans.add(map.size());
        
        for(i=k; i<a.length;i++){
            if(map.get(a[i-k]) == 1){
                map.remove(a[i-k]);
            }else{
                map.put(a[i-k], map.get(a[i-k])-1);
            }
            map.put(a[i], map.getOrDefault(a[i],0)+1);
            
            ans.add(map.size());
        }
        
        return ans;
    }

}
