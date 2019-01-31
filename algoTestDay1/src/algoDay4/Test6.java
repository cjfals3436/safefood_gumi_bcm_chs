package algoDay4;

public class Test6 {

	public static void main(String[] args) {
		SSAFYStack stack = new SSAFYStack();
		
		boolean b;
		char[] arr;
		char c;
		String s = "({[{}{[]}]()})";
		arr = s.toCharArray();
		b=true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '('||arr[i] == '{'||arr[i] == '[') {
				if(!stack.isFull()) {
					stack.push(arr[i]);
				}
				else {
					b=false;
					break;
				}
			}
			else if(arr[i] == ')'||arr[i] == '}'||arr[i] == ']') {
				if(!stack.isEmpty()) {
					c = stack.pop();
					if(c+1 != arr[i]&&c+2 != arr[i]) {
						b=false;
						break;
					}
				}
				else {
					b=false;
					break;
				}
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("error");
		}
		else if(b) {
			System.out.println("정상");
		}
	}
}
