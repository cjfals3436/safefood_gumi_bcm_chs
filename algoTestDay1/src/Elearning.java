import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Elearning {
	static int T,N,K;
	static double answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int i;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			i=0;
			int[] arr = new int[N];
			while(st.hasMoreTokens()) {
				arr[i++] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			answer=0.0;
			for(i = N-K;i<N;i++) {
				answer = (answer+arr[i])/2;
			}
			bw.write("#"+testCase+" "+String.format("%.6f",answer)+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
