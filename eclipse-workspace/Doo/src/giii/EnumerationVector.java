package giii;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationVector {

	public static void main(String[] args) {
		Vector sw= new Vector();
		sw.add("Hello");
		sw.add("World");
		sw.add("Pop");
		
		Enumeration as= sw.elements();
		while(as.hasMoreElements()==true)
		{
			System.out.println(as.nextElement());
		}
		

	}

}
