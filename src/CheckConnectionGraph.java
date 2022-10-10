import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckConnectionGraph {
	
	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edges;
	public CheckConnectionGraph( int vertices) {
		this.vertices = vertices;
		this.adj= new LinkedList[vertices];
		
		for(int i=0;i<adj.length;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(vertices+ " vertices" + edges + " edges");
		for(int v=0;v<vertices;v++) {
			sb.append(vertices + ":");
			for(int w: adj[vertices]) {
				sb.append(w +" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	public int checkConnectedComponents() {
		boolean visited[] = new boolean[vertices];
		int countId[]= new int[vertices];
		int count=0;
		
		for(int v=0;v<vertices;v++) {
			if(!visited[v]) {
				dfsConnected(v,visited,countId,count);
				count++;
			}
		}
		return count;
	}
	

	
	private void dfsConnected(int v, boolean[] visited, int[] countId, int count) {
		visited[v]=true;
		countId[v]=count;
		for(int w: adj[v]) {
			if(!visited[w]) {
				dfsConnected(w, visited, countId, count);
			}
		}
		
	}
	public static void main(String[] args) {
		CheckConnectionGraph g= new CheckConnectionGraph(8);
		g.addEndge(0, 1);
		g.addEndge(1, 2);
		g.addEndge(3, 2);
		g.addEndge(5, 4);
		
		g.addEndge(1, 3);
		g.addEndge(6, 7);
//		System.out.println(g);
		System.out.println(g.checkConnectedComponents());
	}
	private void addEndge(int i, int j) {
		adj[i].add(j);
		adj[j].add(i);
		
	}
	
	
	
	

}
