import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class KeyPad {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T,N,answer;
		String num,a;
		boolean b;
		Map<Integer,Set<Character>> map;
		map = new HashMap<>();
		for(int i =2;i<10;i++) {
			map.put(i, new HashSet<>());
		}
		map.get(2).add('a');map.get(2).add('b');map.get(2).add('c');
		map.get(3).add('d');map.get(3).add('e');map.get(3).add('f');
		map.get(4).add('g');map.get(4).add('h');map.get(4).add('i');
		map.get(5).add('j');map.get(5).add('k');map.get(5).add('l');
		map.get(6).add('m');map.get(6).add('n');map.get(6).add('o');
		map.get(7).add('p');map.get(7).add('q');map.get(7).add('r');map.get(7).add('s');
		map.get(8).add('t');map.get(8).add('u');map.get(8).add('v');
		map.get(9).add('w');map.get(9).add('x');map.get(9).add('y');map.get(9).add('z');
		ArrayList<String> arr;

		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine(), " ");

			num = st.nextToken();
			N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				arr.add(st.nextToken());
			}
			answer=0;
			for(int j =0;j<N;j++) {
				a = arr.get(j);
				if(num.length() == a.length()) {
					b = true;
					for(int k = 0; k < a.length(); k++) {
						if(!map.get(num.charAt(k)-'0').contains(a.charAt(k))) {
							b = false;
							break;
						}
					}
					if(b) {
						answer++;
					}
				}
			}

			bw.write("#"+testCase+" "+answer+'\n');
			bw.flush();
		}


	}
}




