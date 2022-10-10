import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private LinkedList<Integer>[] adj;
	private int vertices;
	private int edges;
	public Graph( int vertices) {
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
	
	public void BFS(int s) {
		boolean []visited= new boolean[vertices];
		Queue<Integer> q= new LinkedList<Integer>();
		visited[s]=true;
		q.offer(s);
		
		while(!q.isEmpty()) {
			int u=q.poll();
			System.out.print(u+ " ");

			for(int v:adj[u]) {
				if(!visited[v]) {
					visited[v]=true;
					q.offer(v);
				}
			}
		}
	}
	public void DFS(int s) {
		boolean []visited= new boolean[vertices];
		Stack<Integer> stack= new Stack<Integer>();
		visited[s]=true;
		stack.add(s);
		
		while(!stack.isEmpty()) {
			int u=stack.pop();
			System.out.print(u+ " ");
			for(int v: adj[u]) {
				if(!visited[v]) {
					visited[v]=true;
					stack.add(v);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Graph g= new Graph(5);
		g.addEndge(0,1);
		g.addEndge(1, 2);
		g.addEndge(3, 2);
		g.addEndge(2, 4);
		g.addEndge(1, 4);
		g.addEndge(1, 3);
		g.addEndge(4, 3);
//		System.out.println(g);
		g.BFS(0);
		System.out.println();
		g.DFS(0);
		System.out.println();
	}
	private void addEndge(int i, int j) {
		adj[i].add(j);
		adj[j].add(i);
		
	}
	
	
	
	

}
