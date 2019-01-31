package algoTestDay1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Myzz {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		Queue<Integer> queue = new LinkedList<>();
		int zzu = 20;
		int i = 1,temp=0,out=0;
		while(zzu > 0) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}
			queue.offer(i);
			temp = queue.poll();
			if(zzu - map.get(temp) <= 0) {
				break;
			}
			zzu -= map.get(temp);
			map.put(temp, map.get(temp)+1);
			queue.offer(temp);
			i++;
		}
		System.out.println(temp);
	}
}


