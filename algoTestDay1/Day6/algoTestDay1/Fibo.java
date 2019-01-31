package algoTestDay1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fibo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T,N;
		int[][] arr = new int[41][2];
		arr[0][0] = 1;
		arr[1][1] = 1;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine());
			for(int i = 2; i <= N; i++) {
				arr[i][0] = arr[i-1][0]+arr[i-2][0];
				arr[i][1] = arr[i-1][1]+arr[i-2][1];
			}
			bw.write(arr[N][0]+" "+arr[N][1]+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
	
}
