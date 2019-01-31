import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Height5643 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T,N,M;
		int[][] arr, matrix;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine());
			M = Integer.parseInt(br.readLine());
			matrix = new int[N][N];
			arr = new int[M][2];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(i==j) {
						matrix[i][j] = 8;
					}
					else {
						matrix[i][j] = 0;
					}
				}
			}
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			
			
			bw.write("#"+testCase+"\n");
			bw.flush();
		}

	}

}
