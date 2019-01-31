import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AA {
	static int T,answer;
	static long N, temp;
	static long[] arr = new long[31];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean x;
		T = Integer.parseInt(br.readLine());
		temp=1;
		arr[0]=1;
		for(int i = 1; i < 30;i++) {
			temp = temp*2+1;
			temp = temp*2+1;
			arr[i]=temp;
		}
		arr[30]=Long.parseLong("123456789123456789");
		for(int i = 1; i < 31;i++) {
			System.out.println(arr[i]);
		}

		for(int testCase = 1; testCase <= T; testCase++) {
			N = Long.parseLong(br.readLine());
			x=true;
			for(int i=0;i<=30;i++) {
				if(arr[i]==N) {
					System.out.println("#"+testCase+" Bob");
					x=false;
					break;
				}
//				else if(arr[i]>N) {
//					break;
//				}
			}
			if(x) {
				System.out.println("#"+testCase+" Alice");
			}
		}
		br.close();
		bw.close();
	}
}