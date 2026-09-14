package package22;

public class ConstroctorOverloading_SNsatic
{
	ConstroctorOverloading_SNsatic()
	{
		System.out.println("Hiii i am constuctor hear  and we are overloading aswell  1");
	}
	ConstroctorOverloading_SNsatic(int a, int b)
	{
		System.out.println("Hiii i am constuctor hear  and we are overloading aswell   2");
	}
	ConstroctorOverloading_SNsatic(char a)
	{
		System.out.println("Hiii i am constuctor hear  and we are overloading aswell   3");
	}
	ConstroctorOverloading_SNsatic(boolean b)
	{
		System.out.println("Hiii i am constuctor hear  and we are overloading aswell    4");
	}
	static void main()
	{
		System.out.println("Hiii i am staic method");
	}
	void main1()
	{
		System.out.println("Hiii i am non-staic method");
	}

	public static void main(String[] args) 
	{
		
		new ConstroctorOverloading_SNsatic();
		new ConstroctorOverloading_SNsatic(10, 39);
		new ConstroctorOverloading_SNsatic('d');
		new ConstroctorOverloading_SNsatic(true);
		main();
		ConstroctorOverloading_SNsatic c1=new ConstroctorOverloading_SNsatic();
		c1.main1();
		
		
		}
	
		
	}
