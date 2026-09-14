package Package;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		 Stack<String> s1=new Stack<String> ();
		s1.add("11");
		 s1.add("11");
		 s1.add("11");
		 s1.add("24") ;
		 s1.add("11");
		 s1.add("13");
		 s1.add("12");
		 System.out.println("Before using pop"+s1);
		 s1.pop() ;
		 System.out.println("After using pop"+s1);
		 System.out.println(s1.peek());
		 System.out.println(s1);
		 System.out.println(s1.push("111"));
		 System.out.println(s1);
		 System.out.println(s1.search("24"));

	}

}
