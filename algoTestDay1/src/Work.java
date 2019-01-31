import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Work {
	static double[][] arr = new double[100][100];
	static boolean[] tf = new boolean[100];
	static int T,N;
	static double answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out),true);
		StringTokenizer st;

		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine());
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < N; j++) {
					arr[i][j] = Double.parseDouble(st.nextToken()) / 100.0;
				}
				tf[i] = true;
			}
			answer = 0;
			dfs(0, 1);
			pw.printf("#%d %.6f\n", testCase, answer*100);
		}
		br.close();
		pw.close();

	}
	public static void dfs(int n, double sum) {
		if(n == N) {
			if(answer < sum) {
				answer = sum;
			}
			return;
		}
		for(int i = 0; i < N; i++) {
			if(tf[i]) {
				tf[i] = false;
				dfs(n+1,sum * arr[n][i]);
				tf[i] = true;
			}
		}
	}

}
