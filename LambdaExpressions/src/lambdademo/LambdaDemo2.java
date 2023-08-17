package lambdademo;

interface MyLambdaCapture {
	public void display();
}

class UseLambda {
	public void callLambda(MyLambda ml) {
		ml.display();
	}
}

class Demo {
	public void method1() {
		UseLambda ul = new UseLambda();
		ul.callLambda(() -> {
			System.out.println("Hello");
		});

		/*
		 * int temp=10;
		 * 
		 * public void method1() { int count=0;
		 * 
		 * MyLambda ml=()-> { //int count=0; //count++; int x=0;
		 * System.out.println("Hi"); System.out.println("Bye"+(++temp)); };
		 * 
		 * ml.display();
		 */
	}
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.method1();

	}

}