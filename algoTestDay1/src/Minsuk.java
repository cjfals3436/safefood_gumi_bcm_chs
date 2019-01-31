import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Minsuk {
	static int T,answer;
	static int N, je, length, max, idx;
	static int[] arr = new int[100 + 1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			je = Integer.parseInt(st.nextToken());
			for(int i=0;i<=N;i++) {
				arr[i]=0;
			}
			idx=0;
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()){
				arr[Integer.parseInt(st.nextToken())] = 1;
			}
			
			System.out.print("#"+testCase+" ");
			
			for(int i =1;i<=N;i++) {
				if(arr[i]!=1) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
			
		}
		
		br.close();
		bw.close();
	}
}
