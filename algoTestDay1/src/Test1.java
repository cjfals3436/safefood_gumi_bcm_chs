
public class Test1 {

	public static void main(String[] args) {
		System.out.println("main");
		hello(0);
		System.out.println("main2");
			
	}
	static void hello(int num) {
		System.out.println("hello");
		if(num ==5) {
			return;
		}
		hello(++num);
		aa();
		System.out.println("hello2");
	}
	static void aa() {
		System.out.println("aa");
	}
}
