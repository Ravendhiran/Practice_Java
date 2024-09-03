package ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class checkedExceptions {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Automation\\Practice_Java\\Day-19.txt");
		System.out.println(file.read());

	}

}
