package proj1;

import java.util.Enumeration;
import java.util.Vector;

public class EnumClass {

	public static void main(String[] args) {
		Vector s1= new Vector();
		s1.add("hi");
		s1.add("Hello");
		s1.add("Hey");
		s1.add("loo");
	
		Enumeration e1= s1.elements();
		while(e1.hasMoreElements()==true)
		{
			System.out.println(e1.nextElement());
		}

	}

}
