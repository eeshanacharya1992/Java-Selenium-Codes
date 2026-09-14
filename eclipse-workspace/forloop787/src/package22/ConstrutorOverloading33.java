package package22;

public class ConstrutorOverloading33 {
	ConstrutorOverloading33(int a, int b)
	{
		System.out.println("Hii i am constuctor hear  and we are overloading as well 1");
	}
	ConstrutorOverloading33(char a)
	{
	System.out.println("Hii i am constuctor hear  and we are overloading as well 2");
	}
	ConstrutorOverloading33(String a)
	{
	System.out.println("Hii i am constuctor hear  and we are overloading as well 3");
	}
	ConstrutorOverloading33(String a,int b)
	{
	System.out.println("Hii i am constuctor hear  and we are overloading as well 4");
	}
	ConstrutorOverloading33()
	{
	System.out.println("Hii i am constuctor hear  and we are overloading as well 5");
	}
	public static void main(String[] args) {
		new ConstrutorOverloading33(3,4); 
		new ConstrutorOverloading33('s'); 
		new ConstrutorOverloading33("hi"); 
		new ConstrutorOverloading33("hi",6); 
		new ConstrutorOverloading33(); 
		
	}

}
