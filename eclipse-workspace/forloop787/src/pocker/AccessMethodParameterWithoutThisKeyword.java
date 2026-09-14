package pocker;

public class AccessMethodParameterWithoutThisKeyword {
	 int marks;
	    String name;
	    int age;
	   void studentdetails(int marks,String name,int age)
	   // void studentdetails()
	    {
	    	System.out.println("1");
	    	System.out.println(marks);
	    	System.out.println(name);
	    	System.out.println(age);
	    }
	public static void main(String[] args) {
		AccessMethodParameterWithoutThisKeyword  n1= new AccessMethodParameterWithoutThisKeyword ();
		n1.studentdetails(90, "Ram", 25);
		System.out.println(n1.marks);
		System.out.println(n1.name);
		System.out.println(n1.age);

	}

}
