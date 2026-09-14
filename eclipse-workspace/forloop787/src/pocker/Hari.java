package pocker;

public class Hari {
    int standard;
    int rollnumber;
    String Classteacher;
	
    void details(int standard, int rollnumber, String Classteacher)
    {
    	this.standard=standard;
    	this.rollnumber=rollnumber;
    	this.Classteacher=Classteacher;
    	System.out.println("My");
    }
    
	public static void main(String[] args) {
		
		Hari h1=new Hari();
		h1.details(6, 2, "Sujata Parija");
		System.out.println(h1.standard);
		System.out.println(h1.rollnumber);
		System.out.println(h1.Classteacher);
		h1.details(4, 2,"Lana");
		System.out.println(h1.standard);
		System.out.println(h1.rollnumber);
		System.out.println(h1.Classteacher);
		
	}

}
