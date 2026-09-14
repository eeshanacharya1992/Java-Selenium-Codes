package giii;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationConcept {

	public static void main(String[] args) {
		List v=new Vector();
		v.add(10);
		v.add("Jyoti");
		v.add(15.2);
		Enumeration e= ((Vector) v).elements();
		while(e.hasMoreElements())
		{
		System.out.println(e.nextElement());
		}
        
	}

}
