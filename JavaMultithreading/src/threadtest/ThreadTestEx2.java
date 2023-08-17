package threadtest;

public class ThreadTestEx2 implements Runnable {
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(i + " Hello");
			i++;
		}
	}

	public static void main(String[] args) {
		ThreadTestEx2 t = new ThreadTestEx2();
		Thread th = new Thread(t);
		th.start();
		int i = 1;
		while (true) {
			System.out.println(i + " World");
			i++;
		}

	}

}
