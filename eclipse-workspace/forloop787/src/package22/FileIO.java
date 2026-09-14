package package22;

import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	 public static void main(String[] args) throws IOException 
	  {
		   FileReader s1 = new FileReader("file");
	    
	    System.out.println(s1.read());
	    
	    s1.close();
	  }
}
