package sam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BinaryIndexedTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Com com = new Com();
		int T,X,Y,O,N,M,sum,orderidx,result;
		int[] arr = new int[100001];
		int[] two;
		int[][] order1 = new int[1000001][2];
		ArrayList<int[]> list = new ArrayList<>();
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 1; i <= N; i++) {
				arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
			}
			bw.write("#"+testCase);
			orderidx = 0;
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				O = Integer.parseInt(st.nextToken());
				X = Integer.parseInt(st.nextToken());
				Y = Integer.parseInt(st.nextToken());
				if(O == 1) {
//					order1[orderidx][0] = X;
//					order1[orderidx++][1] = Y;
					two = new int[2];
					two[0] = X;
					two[1] = Y;
					list.add(two);
				}
				else {
					result = arr[Y] - arr[X-1];
					int j = 0;
					if(X > list.get(list.size()/3)[0]) {
						j = list.size()/3;
					}
					if(X > list.get((list.size()/3)*2)[0]) {
						j = (list.size()/3)*2;
					}
					Collections.sort(list, com);
					for(; j < list.size(); j++) {
						if(list.get(j)[0] > Y) {
							break;
						}
						if(X <= list.get(j)[0] && list.get(j)[0] <= Y) {
							result += list.get(j)[1];
						}
					}
					bw.write(" "+result);
				}
			}
			bw.write("\n");
			bw.flush();
		}
		br.close();
		bw.close();	
	}
	static public class Com implements Comparator<int[]>{

		@Override
		public int compare(int[] o1, int[] o2) {
			return o1[0] - o2[0];
		}
		
	}
}
