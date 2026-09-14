package pocker;

public class ThisKeyword88 {
  int age;
  String name;
  double salary;
  void sub()
  {
	  this.add(age, name, salary);
  }
  void add(int age,String name, double salary ) 
  {
	  this.sub();
  }
	public static void main(String[] args) {
		ThisKeyword88 s1=new ThisKeyword88();
		s1.add(17,"Rama",9876);
		System.out.println(s1.age);
	//	System.out.println(s1.name);
	//	System.out.println(s1.salary);
	}

}
