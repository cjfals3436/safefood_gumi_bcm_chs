import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T,N,cnt;
		int[][] arr = new int[1001][3];
		int[][] dp = new int[1001][3];
		N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			cnt = 0;
			while(st.hasMoreTokens()) {
				arr[i][cnt++] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				dp[i][j] = arr[i][j] + dp[i-1][(j+1)%3] < arr[i][j] + dp[i-1][(j+2)%3] ? arr[i][j] + dp[i-1][(j+1)%3] : arr[i][j] + dp[i-1][(j+2)%3];
			}
		}
		T=Integer.MAX_VALUE;
		for(int j = 0; j < 3; j++) {
			if(T > dp[N-1][j]) {
				T = dp[N-1][j];
			}
		}

		System.out.println(T);
		
		br.close();
	}
}
