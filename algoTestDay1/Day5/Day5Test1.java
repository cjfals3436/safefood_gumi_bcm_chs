import java.util.Iterator;
import java.util.LinkedList;

public class Day5Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(7+1);
		graph.addEdge(1,2);
		graph.addEdge(2,1);
		graph.addEdge(1,3);
		graph.addEdge(3,1);
		graph.addEdge(2,4);
		graph.addEdge(4,2);
		graph.addEdge(2,5);
		graph.addEdge(5,2);
		graph.addEdge(3,5);
		graph.addEdge(5,3);
		graph.addEdge(4,6);
		graph.addEdge(6,4);
		graph.addEdge(5,6);
		graph.addEdge(6,5);
		graph.addEdge(6,7);
		graph.addEdge(7,6);
		boolean[] visited = new boolean[7 + 1];
		dfs(graph, visited, 1);
	}
	static void dfs(Graph graph, boolean[] visited, int v) {
		visited[v] = true;
		System.out.println((char)(v+64)+" ");
		Iterator<Integer> data = graph.datas[v].iterator();
		while(data.hasNext()) {
			int i = data.next();
			if(!visited[i]) {
				dfs(graph, visited, i);
			}
		}
	}
	static class Graph{
		int v;
		LinkedList<Integer> datas[];
		public Graph(int size) {
			v = size;
			datas = new LinkedList[size];
			for(int i = 0; i < datas.length; i++) {
				datas[i] = new LinkedList<>();
			}
		}
		public void addEdge(int v, int w) {
			datas[v].add(w);
		}
	}
}
