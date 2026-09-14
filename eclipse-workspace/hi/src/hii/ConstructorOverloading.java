package hii;

public class ConstructorOverloading {
  ConstructorOverloading()
  {
	  System.out.println("HI");
  }
 ConstructorOverloading(String a)
 {
	 System.out.println(a);
 }
	public static void main(String[] args) {
	 new ConstructorOverloading();
	 new ConstructorOverloading("Hello World");
	}

}
