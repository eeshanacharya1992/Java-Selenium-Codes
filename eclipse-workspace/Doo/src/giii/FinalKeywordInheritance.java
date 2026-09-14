package giii;
  class Books{
	final static void add()
	 {
		 System.out.println("Hello world");
	 }
 }
public class FinalKeywordInheritance extends Books {
    static void add()
     {
    	 System.out.println("Hi");
     }
	public static void main(String[] args) {
		add();

	}

}
