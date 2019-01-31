import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class calculater {
	static int T,N,K, answer;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String s,s2;
		int n1,n2,n3;
		char c;
		Stack<Character> cs = new Stack<>();
		Stack<Integer> is = new Stack<>();
		for(int testCase = 1; testCase <= 10; testCase++) {
			s = br.readLine();
			s = br.readLine();
			s2="";
			for(int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				if(c >= '0' && c <='9') {
					s2 += c - '0';
				}
				else if(c == '(') {
					cs.push(c);
				}
				else if(c == ')') {
					while(isb(c,cs.peek())) {
						s2 += cs.pop();
					}
					cs.pop();
				}
				else if(c == '+') {
					while(isb(c,cs.peek())) {
						s2 += cs.pop();
					}
					cs.push(c);
				}
				else {
					while(isb(c,cs.peek())) {
						s2 += cs.pop();
					}
					cs.push(c);
				}
			}
			answer = 0;
			for(int i = 0; i < s2.length(); i++) {
				c = s2.charAt(i);
				if(c >= '0' && c <='9') {
					is.push(c-'0');
				}
				else if(c == '+') {
					n2 = is.pop();
					n1 = is.pop();
					n3 = n1 + n2;
					is.push(n3);
				}
				else {
					n2 = is.pop();
					n1 = is.pop();
					n3 = n1 * n2;
					is.push(n3);
				}
			}
			bw.write("#"+testCase+" "+is.pop()+"\n");
			bw.flush();
		}
	}
	static boolean isb(char a, char b) {
		if(a == '+') {
			if(b == '*') {
				return true;
			}
		}
		else if(a == '*') {
			if(b == '*') {
				return true;
			}
		}
		else if(a == ')') {
			if(b != '(') {
				return true;
			}
		}
		return false;
	}
}
