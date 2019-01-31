import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Janghun {
	static int T,answer;
	static int N,temp, B, cnt;
	static int[] arr = new int[200000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			cnt=0;
			while(st.hasMoreTokens()){
				arr[cnt++] = Integer.parseInt(st.nextToken());
			}
			answer=99999999;
			dfs(0,0);
			System.out.println("#"+testCase+" "+(answer-B));
		}
		
		br.close();
		bw.close();
	}
	static void dfs(int n, int sum) {
		if(sum>=B && sum-B < answer-B) {
			answer = sum;
		}
		else if(sum>=B && sum-B > answer-B) {
			return;
		}
		if(n==N) {
			return;
		}
		dfs(n+1,sum+arr[n]);
		dfs(n+1,sum);
	}
}
