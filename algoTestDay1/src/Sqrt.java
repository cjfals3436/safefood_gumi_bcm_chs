import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sqrt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T, N, M, answer;
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			T = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			answer = 1;
			
			for(int i = 0; i < M; i++) {
				answer *= N;
			}
			
			bw.write("#"+testCase+" "+answer+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}

}