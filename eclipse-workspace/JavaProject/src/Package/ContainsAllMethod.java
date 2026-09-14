package Package;

import java.util.ArrayList;

public class ContainsAllMethod {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("bb");
		al2.add("cc");
	//	System.out.println(al.containsAll(al2)); //Output: true
		System.out.println(al2.containsAll(al));

	}

}
