package innerclasses;

abstract class My {
	abstract public void show();
}

class OuterCls1 {
	public void display() {
		My m = new My() {
			public void show() {
				System.out.println("Hello");
			}
		};
		m.show();
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		OuterCls1 o = new OuterCls1();
		o.display();

	}

}
