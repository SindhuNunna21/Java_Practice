package methodoverriding;

class Car {
	public void start() {
		System.out.println("Car started");
	}

	public void accelerate() {
		System.out.println("Car is accelerated");
	}

	public void changeGear() {
		System.out.println("Car gear changed");
	}
}

class LuxuryCar extends Car {
	public void changeGear() {
		System.out.println("Automatic Gear");
	}

	public void openRoof() {
		System.out.println("Sun Roof is opened");
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		// object of super class
		Car c = new Car();
		c.start();
		c.accelerate();
		c.changeGear();

		// object of sub class
		LuxuryCar l = new LuxuryCar();
		l.start();
		l.accelerate();
		l.changeGear();
		l.openRoof();

		// reference of super class and object of sub class
		Car x = new LuxuryCar();
		x.start();
		x.accelerate();
		x.changeGear();
	}
}
