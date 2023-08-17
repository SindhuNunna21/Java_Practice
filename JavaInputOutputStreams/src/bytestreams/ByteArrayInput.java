package bytestreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInput {

	public static void main(String[] args) throws Exception {
		byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		String str = new String(bis.readAllBytes());
		System.out.println(str);
		System.out.println(bis.markSupported());
		bis.close();

	}

}
