package Package;

import java.util.ArrayList;

public class RemoveAll2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("ff");
		System.out.println(al); // Output: [aa, bb]
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("cc");
		al2.add("ee");
		al2.removeAll(al);
		
		System.out.println(al2); 

	}

}
