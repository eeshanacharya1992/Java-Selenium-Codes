package hii;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;




public class CheckedPropertyFile {

	public static void main(String[] args) throws IOException  {
		FileReader reader = new FileReader("NewFile.properties");
		
		 Properties sw= new Properties();
		sw.load(reader);
          System.out.println(sw.getProperty("EmployeeName"));
          System.out.println(sw.getProperty("EmployeeID"));
	}

}
