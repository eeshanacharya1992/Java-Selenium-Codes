package Package;

import java.util.ArrayList;

public class IsEmptyEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("");
		al.add("");
		System.out.println(al.isEmpty()); // Output: false
		ArrayList a2=new ArrayList();
		System.out.println(a2.isEmpty());//Output:true

	}

}
