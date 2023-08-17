package thisvssuper;

class Rectangle {
	int length;
	int breadth;
	int x = 10;

	Rectangle(int length, int breadth) {
		this.length = length; // This keyword is a reference to the current object.
		this.breadth = breadth;
	}

}

class Cuboid extends Rectangle {
	int height;
	int x = 20;

	Cuboid(int l, int b, int h) {
		super(l, b);
		height = h;
	}

	void display() {
		System.out.println(super.x); // Super is a reference to the super class.
		System.out.println(x);
	}
}

public class ThisVsSuperEx {

	public static void main(String[] args) {
		Cuboid c = new Cuboid(10, 5, 15);
		c.display();

	}

}
