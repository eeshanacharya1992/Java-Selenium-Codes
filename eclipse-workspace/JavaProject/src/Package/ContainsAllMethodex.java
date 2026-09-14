package Package;

import java.util.ArrayList;

public class ContainsAllMethodex {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("bb");
		System.out.println(al.containsAll(al2)); //Output: true
       ArrayList al3= new ArrayList();
       al3.add("bb");
       al3.add("cc");
       al3.add("dd");
       al3.add("aa");
       System.out.println(al.containsAll(al3));
       System.out.println(al3.containsAll(al));
	}

}
