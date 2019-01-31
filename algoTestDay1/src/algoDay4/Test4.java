package algoDay4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		Data d2 = new Data();
		d1.num = 10;
		d2.num = 10;
		System.out.println(d1.equals(d2));
	}
	static class Data{
		int num;

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof Data)) {
				return false;
			}
			return this.num == ((Data)obj).num;
		}
		
	}
}
