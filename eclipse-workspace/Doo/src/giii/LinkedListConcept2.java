package giii;

import java.util.LinkedList;

public class LinkedListConcept2 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList();
		 l1.add(34);
	 l1.add(56);
		 l1.add(555);
		 l1.add(455);
		 System.out.println(l1);
		// l1.pollFirst();
	  //  System.out.println(l1);
         l1.pollLast();
         System.out.println(l1);
         
	}

}
