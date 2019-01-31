import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T,N,cnt;
		int[][] dp = new int[501][501];
		N = Integer.parseInt(br.readLine());

		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			cnt = 0;
			while(st.hasMoreTokens()) {
				dp[i][cnt++] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = N-1; i >= 0; i--) {
			for(int j = i; j >= 0; j--) {
				dp[i][j] += dp[i+1][j] > dp[i+1][j+1] ? dp[i+1][j] : dp[i+1][j+1];
			}
		}
		

		System.out.println(dp[0][0]);
		
		br.close();
	}
}
