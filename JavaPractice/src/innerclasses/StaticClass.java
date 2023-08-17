package innerclasses;

class OuterCls2 {
	int x = 10;
	static int y = 20;

	static class My {
		public void show() {
			System.out.println(y);
		}
	}
}

public class StaticClass {

	public static void main(String[] args) {
		OuterCls2.My m = new OuterCls2.My();
		m.show();

	}

}
