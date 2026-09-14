package Package;

import java.util.ArrayList;

public class ArrayListClass3 {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(100);
		al.add(200);
		System.out.println(al); // output:- [100, 200]
		ArrayList<Object> al2=new ArrayList<Object>();
		al2.add("aa");
		al2.add("bb");
		al2.add("cc");
		System.out.println(al2); // output:- [aa, bb]
		al.addAll(al2);
		System.out.println(al); // output:- [100, 200, aa, bb]
        al2.addAll(al);
        System.out.println(al2);
	}

}
