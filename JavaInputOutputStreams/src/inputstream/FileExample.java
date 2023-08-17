package inputstream;

import java.io.FileInputStream;

public class FileExample {

	public static void main(String[] args) throws Exception {
		try (FileInputStream fis = new FileInputStream("C:/MyJava/Test.txt")) {
			byte b[] = new byte[fis.available()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);

			/*
			 * int x; while((x=fis.read())!=-1){ System.out.println((char)x);
			 */
		}

	}

}
