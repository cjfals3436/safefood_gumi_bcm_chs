package algoDay4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test10 {
	 static int temp;
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,2,4,2,5,4,6,5,6,6,7,3,7};
		Graph graph = new Graph();
		for(int i = 0; i < arr.length; i+=2) {
			graph.map.get(arr[i]).add(arr[i+1]);
			graph.map.get(arr[i+1]).add(arr[i]);
		}
		dfs(graph,1);
	}
	
	static class Graph{
		Map<Integer,Set<Integer>> map;
		Set<Integer> check;
		
		Graph(){
			map = new HashMap<>();
			check = new HashSet<>();
			for(int i = 1; i < 8; i++) {
				map.put(i, new HashSet<>());
			}
			
		}
	}
	
	static void dfs(Graph graph, int start) {
		System.out.println(start+" ");
		graph.check.add(start);
		Iterator<Integer> it = graph.map.get(start).iterator();
		while(it.hasNext()) {
			temp = it.next();
			if(!graph.check.contains(temp)) {
				dfs(graph,temp);
			}
		}
	}
}
