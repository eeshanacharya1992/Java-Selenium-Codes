package pocker;
class Murali{
	Murali(String b)
	{   
		System.out.println("7");
	}
}
class Jayasuriya extends Murali{
	Jayasuriya(int b)
	{   super("ji");
		System.out.println("8");
	}
}
public class SuperCallingStatement2 extends Jayasuriya {
     SuperCallingStatement2(int e, String f){
    	 super(55);
    	 System.out.println("9");
     }
	public static void main(String[] args) {
		new  SuperCallingStatement2(228,"kkk") ;

	}

}
