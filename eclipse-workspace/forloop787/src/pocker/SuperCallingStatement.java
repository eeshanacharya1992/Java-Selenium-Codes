package pocker;
 class Antara{
	Antara()
	{  
		System.out.println("1");
	}
}
 class Harish extends Antara{
	Harish()
	{  super();
		System.out.println("2");
	}
}
public class SuperCallingStatement extends Harish {
     SuperCallingStatement()
     {   super();
    	 System.out.println("3");
     }
	public static void main(String[] args) {
		new SuperCallingStatement();
	}

}
