package Package;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClassEnumerationEx {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add(10);
		v.add("Books");
		v.add(15.2);
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()==true)
		{
			System.out.println(e.nextElement());
		}
			

	}

}
