import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class One {
	static int[][] arr = new int[10000][3];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N,cnt;
		N = 1000000000;
		N = Integer.parseInt(br.readLine());
		arr[0][0] = N;
		arr[0][1] = N;
		arr[0][2] = N;
		cnt = 1;
		while(true) {
			div3(cnt,0);
			div2(cnt,1);
			minus(cnt,2);
			if(arr[cnt][0] == 1 || arr[cnt][1] == 1 || arr[cnt][2] == 1) {
				break;
			}
			cnt++;
		}
		bw.write(Integer.toString(cnt));
		
		br.close();
		bw.close();
	}
	static void div3(int idx, int j) {
		int min=Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			if(arr[idx-1][i] % 3 == 0 && min > arr[idx-1][i] / 3) {
				min = arr[idx-1][i] / 3;
			}
		}
		if(min != Integer.MAX_VALUE) {
			arr[idx][j] = min;
			return;
		}
		div2(idx,j);
	}
	static void div2(int idx, int j) {
		int min=Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			if(arr[idx-1][i] % 2 == 0 && min > arr[idx-1][i] / 2) {
				min = arr[idx-1][i] / 2;
			}
		}
		if(min != Integer.MAX_VALUE) {
			arr[idx][j] = min;
			return;
		}
		minus(idx,j);
	}
	static void minus(int idx, int j) {
		int min=Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++) {
			if(min > arr[idx-1][i]) {
				min = arr[idx-1][i];
			}
		}
		arr[idx][j] = min - 1;
	}
}
