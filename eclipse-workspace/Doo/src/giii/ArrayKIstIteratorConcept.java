package giii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayKIstIteratorConcept {

	public static void main(String[] args) {
		ArrayList<Object> a1= new ArrayList<Object>();
		a1.add(12);
		a1.add(199);
		a1.add(76);
		a1.add(-9);
		a1.add(87675);
		a1.add("Rakesh");
		a1.add("Rajesh");	
		Iterator <Object>i1= a1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println("Usage of iterator"+i1.next());
		}
        ListIterator <Object>i2= a1.listIterator() ;
        while(i2.hasNext()==true)
        {
        	System.out.println("Usage of List iterator in forward direction"+i2.next());
        }
        while(i2.hasPrevious()==true)
        {
        	System.out.println("Usage of List iterator in backward direction"+i2.previous());
        }
        
	}

}
