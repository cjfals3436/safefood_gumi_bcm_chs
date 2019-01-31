import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Palindrome {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] arr;
		int[] alpha;
		int T,answer,odd, even;
		String str;
		T = Integer.parseInt(br.readLine());
		for(int testCase = 1; testCase <= T; testCase++) {
			alpha = new int[26];
			str = br.readLine();
			arr = str.toCharArray();
			for(int i =0;i<arr.length;i++) {
				alpha[arr[i]-'a']++;
			}
			odd=0;
			even=0;
			for(int i = 0; i < alpha.length; i++) {
				if(alpha[i] % 2 == 0) {
					even += alpha[i] / 2;
				}
				else if(alpha[i] % 2 == 1 && odd < alpha[i]) {
					odd = alpha[i];
				}
				else {
					even += (alpha[i]-1) / 2;
				}
			}
			answer = arr.length+even;
			for(int i = 1; i < odd; i++) {
				answer += i;
			}
			bw.write("#"+testCase+" "+answer+'\n');
			bw.flush();
		}
	}
}
