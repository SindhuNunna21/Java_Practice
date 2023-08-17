package cylindertest;

class Cylinder {

	// Properties
	private int radius;
	private int height;

	// Constructors
	public Cylinder() { // Non-parameterized constructors
		radius = height = 1;
	}

	public Cylinder(int r) {
		radius = r;
		height = 1;
	}

	public Cylinder(int r, int h) { // Parameterized constructors
		radius = r;
		height = h;
	}

	// Property Methods
	public int getRadius() { // getter method
		return radius;
	}

	public int getHeight() {
		return height;
	}

	public void setRadius(int r) { // setter method
		if (r >= 0)
			radius = r;
		else
			radius = 0;
	}

	public void setHeight(int h) {
		if (h >= 0)
			height = h;
		else
			height = 0;
	}

	public void setDimensions(int r, int h) {
		radius = r;
		height = h;
	}

	// Methods
	public double lidArea() {
		return Math.PI * radius * radius;
	}

	public double totalSurfaceArea() {
		return 2 * lidArea() + circumference() * height;
	}

	public double circumference() {
		return 2 * Math.PI * radius;
	}

	public double volume() {
		return lidArea() * height;
	}
}

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setRadius(7);
		c.setHeight(10);
		c.setDimensions(7, 10);

		System.out.println("Lid Area is " + c.lidArea());
		System.out.println("Total Surface Area is " + c.totalSurfaceArea());
		System.out.println("Circumference is " + c.circumference());
		System.out.println("Volume is " + c.volume());
		System.out.println("Radius is " + c.getRadius());
		System.out.println("Height is " + c.getHeight());

	}

}
