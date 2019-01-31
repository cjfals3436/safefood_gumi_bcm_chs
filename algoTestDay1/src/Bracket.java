import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Bracket {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] arr;
		int T,answer;
		char temp;
		String str;
		Stack<Character> stack;
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			T = Integer.parseInt(br.readLine());
			str = br.readLine();
			arr = str.toCharArray();
			stack = new Stack<>();
			answer = 1;
			for(int i =0;i<arr.length;i++) {
				if(arr[i] == '<'||arr[i] == '('||arr[i] == '{'||arr[i] == '[') {
					stack.push(arr[i]);
				}
				else {
					temp = stack.pop();
					if(temp+1 != arr[i]&&temp+2 != arr[i]) {
						answer = 0;
						break;
					}
				}
			}
			
			
			bw.write("#"+testCase+" "+answer+'\n');
			
		}
		bw.flush();
	}
}
