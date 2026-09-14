package Package;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		System.out.println(al); // output:- [100, 200]
	/*	ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("bb");
		System.out.println(al2); // output:- [aa, bb]
		al.addAll(al2);
		System.out.println(al); // output:- [100, 200, aa, bb]*/
		ArrayList al3= new ArrayList();
		al3.add("Wood");
		al3.add("Cart");
		al.addAll(al3);
		System.out.println(al);

	}

}
