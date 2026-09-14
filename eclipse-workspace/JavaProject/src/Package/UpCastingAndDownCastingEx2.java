package Package;
class EA12
{
	void hashing()
	{
		System.out.println("Hashing");
	}
	void hasing2()
	{
		System.out.println("Hashing2");
	}
}
class EA11 extends EA12
{
	void acts()
	{
		System.out.println("Acts");
	}
	void acts2()
	{
		System.out.println("Acts2");
	}
}
public class UpCastingAndDownCastingEx2 extends EA11 {
     void sop()
     {
    	 System.out.println("Sop");
     }
     void sop1()
     {
    	 System.out.println("Sop1");
     }
	public static void main(String[] args) {
		       EA11 sw=          new UpCastingAndDownCastingEx2();
		       sw.acts();
		       sw.acts2();
		       sw.hashing();
		       sw.hasing2();
		       UpCastingAndDownCastingEx2 u2= (UpCastingAndDownCastingEx2)  sw;
		       u2.acts2();
		       u2.acts2();
		       u2.hashing();
		       u2.hasing2();
		       u2.sop();
		       u2.sop1();

	}

}
