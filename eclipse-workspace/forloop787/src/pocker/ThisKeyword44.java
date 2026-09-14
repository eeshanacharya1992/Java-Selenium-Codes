package pocker;

public class ThisKeyword44 {
    int marks;
    String name;
    int age;
   void studentdetails(int marks,String name,int age)
   // void studentdetails()
    {
    	this.marks=marks;
    	this.name=name;
    	this.age=age;
    }
    
	public static void main(String[] args) {
		ThisKeyword44 n1= new ThisKeyword44();
		n1.studentdetails(90, "Ram", 25);
		System.out.println(n1.marks);
		System.out.println(n1.name);
		System.out.println(n1.age);

	}

}
