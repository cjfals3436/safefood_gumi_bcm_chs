import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stair {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T,N,cnt;
		int[][] dp = new int[301][3];
		int[] arr = new int[301];
		N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[0][0]=arr[0];
		dp[0][1]=arr[0];
		for(int i = 1; i < N; i++) {
			dp[i][0] = dp[i-1][1] > dp[i-1][2] ? dp[i-1][1] + arr[i] : dp[i-1][2] + arr[i];
			dp[i][1] = dp[i-1][2] + arr[i];
			dp[i][2] = dp[i-1][1] > dp[i-1][0] ? dp[i-1][1] : dp[i-1][0];
		}

		T = dp[N-1][0] > dp[N-1][1] ? dp[N-1][0] : dp[N-1][1];
		System.out.println(T);
		br.close();
	}
}
