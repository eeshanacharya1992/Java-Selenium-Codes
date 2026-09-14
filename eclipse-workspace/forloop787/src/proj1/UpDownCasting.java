package proj1;
class Doo
{
	void om()
	{
		System.out.println("fooo");
	}
}
public class UpDownCasting extends Doo {
     void om()
     {
    	 System.out.println("lo");
    	 super.om();
     }
	public static void main(String[] args) {
		Doo s1= new UpDownCasting();
		UpDownCasting s2=(UpDownCasting)s1;
		Doo s12= (Doo)new UpDownCasting();
	}

}
