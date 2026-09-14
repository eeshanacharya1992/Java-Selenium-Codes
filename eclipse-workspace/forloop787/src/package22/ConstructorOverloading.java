package package22;

public class ConstructorOverloading {
	ConstructorOverloading(int a, int b)
	{
		System.out.println("Hii i am constuctor hear  and we are overloading as well2");
	}
	ConstructorOverloading(char a)
	{
	System.out.println("Hii i am constuctor hear  and we are overloading as well3");
	}
	public static void main(String[] args) {
	//	new ConstroctorOverloading(10, 39);
	//	new ConstroctorOverloading('d');
         new  ConstroctorOverloading_SNsatic(10,39);
         new  ConstroctorOverloading_SNsatic('d'); 
	}

}
