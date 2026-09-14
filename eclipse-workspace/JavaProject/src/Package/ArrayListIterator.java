package Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(12);
		a1.add(199);
		a1.add(76);
		a1.add(-9);
		a1.add(87675);
		a1.add("Harish");
		a1.add("Harshdeep");
		
		Iterator i1= a1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}
		
		ListIterator a2= a1.listIterator();
		while(a2.hasNext()==true)
		{
			System.out.println("Next method "+a2.next());
		}
		
		while(a2.hasPrevious()==true)
		{
			System.out.println("Previous method "+a2.previous());
		}
		

	}

}
