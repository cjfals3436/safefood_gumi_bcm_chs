import java.util.Stack;

public class Test33 {

	public static void main(String[] args) {
		String s = "(6+5*(2-8)/2)";
		System.out.println(post(s));
		System.out.println(calc(post(s)));
	}
	static int calc(String s) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		int a,b,c;
		char cc;
		for(int i = 0; i< s.length(); i++) {
			cc = s.charAt(i);
			if(cc-'0' > 0 && cc-'0'<10) {
				stack.push(cc-'0');
			}
			else {
				if(cc == '*') {
					a = stack.pop();
					b = stack.pop();
					c = b * a;
					stack.push(c);
					result = c;
				}
				else if(cc == '/'){
					a = stack.pop();
					b = stack.pop();
					c = b / a;
					stack.push(c);
					result = c;
				}
				else if(cc == '+'){
					a = stack.pop();
					b = stack.pop();
					c = b + a;
					stack.push(c);
					result = c;
				}
				else {
					a = stack.pop();
					b = stack.pop();
					c = b - a;
					stack.push(c);
					result = c;
				}
			}
		}
		return result;
	}
	static String post(String s) {
		String post = "";
		Stack<Character> stack = new Stack<>();
		int top=0;
		char cc;
		int num = 0;
		for(int i = 0; i< s.length(); i++) {
			cc = s.charAt(i);
			if(cc-'0' > 0 && cc-'0'<10) {
				//				post += cc;
				num = num * 10 + (cc - '0');
			}
			else if(cc == '.') {
				post += num;
				post += cc;
				num = 0;
			}
			else {
				if(num != 0) {
					post += num;
					num = 0;
				}
				if(cc == '(') {
					stack.push(cc);
				}
				else if(cc == '*'|| cc == '/') {
					if(isp(cc,stack.peek())) {
						while(isp(cc,stack.peek())) {
							post += stack.pop();
						}
						stack.push(cc);
					}
					else {
						stack.push(cc);
					}
				}
				else if(cc == ')') {
					if(isp(cc,stack.peek())) {
						while(isp(cc,stack.peek())) {
							post += stack.pop();
						}
					}
					stack.pop();
				}
				else {
					stack.push(cc);
				}
			}
		}


		return post;
	}
	static boolean isp(char a, char b) {
		if(a == '*'|| a == '/') {
			if(b == '*'|| b == '/') {
				return true;
			}
		}
		else if(a == ')' && b != '(') {
			return true;
		}
		return false;
	}
}
