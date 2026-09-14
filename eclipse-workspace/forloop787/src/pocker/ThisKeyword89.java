package pocker;

public class ThisKeyword89 {
	int age1;
	  String name1;
	  double salary1;
	  void sub11()
	  {
		 System.out.println("hi");
	  }
	  void add11(int age1,String name1, double salary1 ) 
	  {
		  this.sub11();
	  }
	public static void main(String[] args) {
		ThisKeyword89 s2=new ThisKeyword89();
		s2.add11(17,"Rama",9876);
		System.out.println(s2.age1);

	}

}
