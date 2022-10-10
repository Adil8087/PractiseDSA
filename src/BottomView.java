

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;



class Pair{
    int hd;
    Node node;
    
    public Pair(int hd, Node node){
        this.hd= hd;
        this.node = node;
    }
}

public class BottomView
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q= new ArrayDeque<>();
        Map<Integer, Integer> map= new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair p= q.poll();
            if(!map.containsKey(p.hd)){
                map.put(p.hd,p.node.data);
            }
            
            if(p.node.left!=null){
                q.add(new Pair(p.hd-1, p.node.left));
            }
            if(p.node.right!=null){
                q.add(new Pair(p.hd+1, p.node.right));
            }
        }
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
        
        
        
    }
}

