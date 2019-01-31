import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Plus {
	static int T,N,K;
	static String n1,n2;
	static int[] num1,num2,sum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int length, cnt;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			st = new StringTokenizer(br.readLine(), " ");
			n1 = st.nextToken();
			n2 = st.nextToken();
			length = n1.length() > n2.length() ? n1.length() : n2.length();
			num1 = new int[length];
			num2 = new int[length];
			sum = new int[length+1];
			cnt=0;
			for(int i = n1.length() - 1; i >= 0; i--) {
				num1[cnt++] = n1.charAt(i)-'0';
			}
			cnt=0;
			for(int i = n2.length() - 1; i >= 0; i--) {
				num2[cnt++] = n2.charAt(i)-'0';
			}
			for(int i = 0; i < length; i++) {
				if(num1[i] + num2[i] > 9) {
					sum[i] += (num1[i] + num2[i]) % 10;
					if(sum[i] > 9) {
						sum[i] = sum[i] % 10;
						sum[i + 1]++;
					}
					sum[i + 1]++;
				}
				else {
					sum[i] += num1[i] + num2[i];
					if(sum[i] > 9) {
						sum[i] = sum[i] % 10;
						sum[i + 1]++;
					}
				}
			}
			System.out.print("#"+testCase+" ");
			if(sum[length] != 0) {
				System.out.print(sum[length]);
			}
			for(int i = length-1; i >= 0; i--) {
				System.out.print(sum[i]);
			}
			System.out.println();
		}

	}

}
