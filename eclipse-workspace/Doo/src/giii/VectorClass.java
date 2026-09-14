package giii;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector as= new Vector();
		as.addElement("Job");
		as.addElement("Hold");
		as.addElement("Action");
		as.addElement("Home");
		as.addElement("House");
		as.addElement("Place");
		as.addElement("Drag");
		as.addElement("Drop");
		as.addElement("Job");
		
		System.out.println("Before using remove method elements are"+as);
	//	System.out.println(as);
		//as.firstElement();
	//	System.out.println(as.firstElement());
	//	System.out.println(as.lastElement());
	//	as.remove("Action");
//		System.out.println("After using remove method elements are"+as);
	//	System.out.println(as);
	//	as.removeElementAt(5);
		//System.out.println(as);
		as.removeAllElements();
		System.out.println(as);
	//	System.out.println(as.capacity());
	}

}
