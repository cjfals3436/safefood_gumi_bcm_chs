import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Vertical {
	static int T;
	static String[] arr = new String[5];
	static char[] answer = new char[75];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int i, j, max;
		String str;
		int[] length = new int[5];
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {

			str="";
			i=0;
			max=0;
			for(i = 0; i < 5; i++) {
				arr[i] = br.readLine();
				length[i] = arr[i].length();
				if(max<length[i]) {
					max=length[i];
				}
			}
			j=0;
			for(int k =0; k < max; k++) {
				for(i = 0; i < 5; i++) {
					if(k < length[i]) {
						str+=arr[i].charAt(k);
					}
				}
			}
			System.out.print("#"+testCase+" "+str);
//			for(i=0;i<j;i++) {
//				System.out.print(answer[i]);
//			}
			System.out.println();

			
		}

		br.close();
		bw.close();
	}

}
