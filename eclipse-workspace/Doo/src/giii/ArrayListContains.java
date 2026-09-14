package giii;

import java.util.ArrayList;

public class ArrayListContains {

	public static void main(String[] args) {
		ArrayList sq= new ArrayList();
		sq.add("Ram");
		sq.add("Vishnu");
		sq.add("Bhim");
		System.out.println(sq);
	//	System.out.println(sq.contains("Ram"));
		System.out.println(sq.contains("Lock"));
        System.out.println(sq.get(1));
    //    System.out.println(sq.set(2, "Hari"));
        sq.set(2, "Hari");
        System.out.println(sq);
      
	}

}
