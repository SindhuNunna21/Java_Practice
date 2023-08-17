package bufferstreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInput {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/MyJava/Test1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		bis.mark(10);
		System.out.print((char) bis.read());
		System.out.print((char) bis.read());
		bis.reset();

		System.out.print((char) bis.read());
		System.out.print((char) bis.read());

		fis.close();
		bis.close();
	}
}
