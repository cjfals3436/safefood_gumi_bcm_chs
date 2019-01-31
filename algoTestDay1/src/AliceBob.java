import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AliceBob {
	static int T,answer;
	static long N,temp;
	static long[] arr = new long[1000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		T = Integer.parseInt(br.readLine());
		temp=1;
		for(int i = 1; i < 30;i++) {
			temp = temp*2+1;
			temp = temp*2+1;
			arr[i]=temp;
		}
		arr[30]=Long.parseLong("12345678913456798");
		for(int i = 1; i < 30;i++) {
			System.out.println(arr[i]);
		}
		for(int testCase = 1; testCase <= T; testCase++) {
//			N = Long.parseLong(br.readLine());
			for(long i=1;i<Long.MAX_VALUE;i++) {
				N=i;
				if(dfs(false,1)) {
					System.out.println("#"+i);
				}
			}
//			System.out.println("#"+testCase+" "+dfs(false,1));
		}
		
		br.close();
		bw.close();
	}
	
	static boolean dfs(boolean ab, long num) {
		if(N<num) {
			return ab;
		}
		boolean a = dfs(!ab,num*2);
		if(!a) {
			return a;
		}
		boolean b = dfs(!ab,num*2+1);
		return a&&b;
	}
	
}
