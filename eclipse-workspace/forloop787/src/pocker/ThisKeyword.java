package pocker;

public class ThisKeyword {
	int standard =4;
    int rollnumber=2;
    String Classteacher="Sujay";
    void details(int standard, int rollnumber, String Classteacher)
    {
    	this.standard=standard;
    	this.rollnumber=rollnumber;
    	this.Classteacher=Classteacher; 
    	
    }
	public static void main(String[] args) {
		ThisKeyword a1= new ThisKeyword();	
		System.out.println(a1.standard);
		System.out.println(a1.Classteacher);
		System.out.println(a1.rollnumber);
		a1.details(6, 7, "ana");
		
		System.out.println(a1.standard);
		System.out.println(a1.Classteacher);
		System.out.println(a1.rollnumber);
	}
	

}
