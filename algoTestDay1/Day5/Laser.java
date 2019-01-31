import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Laser {
	static int T,N,K;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String s,s2;
		int n,cnt,length;
		char c;
		int[] arr, answer;
		Map<Integer,Integer> map;
		Stack<Integer> stack;
		ArrayList<Integer> list;
		Iterator<Integer> it;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			cnt=1;
			map = new HashMap<>();
			stack = new Stack<>();
			list = new ArrayList<>();
			arr = new int[N+1];
			while(st.hasMoreTokens()) {
				n = Integer.parseInt(st.nextToken());
				stack.push(n);
				map.put(n, cnt);
				cnt++;
			}
			for(int i = 1; i < N;i++) {
				n = stack.pop();
				length = list.size();
				for(int j =0; j < length;j++) {
					if(n > list.get(j)) {
						arr[map.get(list.get(j))] = map.get(n);
						list.remove(j);
					}
				}
				list.add(n);
			}
			for(Integer num : list) {
				arr[map.get(num)] = 0;
			}
			for(int i = 1; i < N; i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
