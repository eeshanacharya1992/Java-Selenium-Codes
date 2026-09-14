package pocker;

import java.io.FileReader;
import java.io.IOException;

public class Exception {

	public static void main(String[] args) throws IOException {
		FileReader a1= new FileReader("input.text");
		System.out.println(a1.read());
		
	}

}
