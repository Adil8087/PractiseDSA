import java.util.ArrayList;

public class DetectCycleDirectedGraph {
	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]= new boolean[V];
        boolean resS[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(dfs(i,adj,vis,resS))
            return true;
        }
        return false;
    }
    public boolean dfs(int V, ArrayList<ArrayList<Integer>> adj,
                                    boolean vis[],boolean resS[] ){
        vis[V]=true;
        resS[V]=true;
        
        for(Integer neigbour: adj.get(V)){
            if(!vis[neigbour]){
                if(dfs(neigbour, adj,vis,resS))
                return true;
            }else if(resS[neigbour])
            return true;
        }
        resS[V]=false;
        return false;
    }
}
