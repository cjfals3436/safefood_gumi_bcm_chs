import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Mountain {
	static int T,N;
	static int[] arr = new int[50005];
	static int[][] mountains = new int[30000][3];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int s = 0, h = 0, cnt = 0, answer;
		boolean de = true;
		st = new StringTokenizer(br.readLine(), " ");
		T = Integer.parseInt(st.nextToken());
		for(int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			cnt = 0;
			while(st.hasMoreTokens()) {
				arr[cnt++]=Integer.parseInt(st.nextToken());
			}
			if(arr[0] > arr[1]) {
				de = false;
			}
			else {
				de = true;
			}
			s = 0;
			h = 0;
			cnt = 0;
			for(int i = 1; i < N; i++) {
				if(de && arr[i] < arr[i-1]) {
					h = i - 1;
					de = false;
				}
				else if(!de && arr[i] > arr[i-1]) {
					if(h != 0) {
						mountains[cnt][0] = s;
						mountains[cnt][1] = h;
						mountains[cnt++][2] = i-1;
					}
					s = i - 1;
					h = 0;
					de = true;
				}
			}
			if(h != 0) {
				mountains[cnt][0] = s;
				mountains[cnt][1] = h;
				mountains[cnt++][2] = N-1;
			}
			answer = 0;
			for(int i = 0; i < cnt; i++) {
				answer += ((mountains[i][1] - mountains[i][0]) * (mountains[i][2] - mountains[i][1]));
			}
			bw.write("#"+testCase+" "+answer+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
