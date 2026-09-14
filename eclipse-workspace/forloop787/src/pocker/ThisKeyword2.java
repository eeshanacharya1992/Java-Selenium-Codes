package pocker;

public class ThisKeyword2 {
	
   String Name="Ameer";
    int age =21;
   String address="Main road UK";
    void details(String FirstName, int YearOfLeave, String HomeAddress)
    {
    	this.Name= FirstName;
    	this.age=YearOfLeave;
    	this.address=HomeAddress;
    	System.out.println(this.Name);	
    	System.out.println(this.age);
    	System.out.println(this.address);
    }
	
		
		public static void main(String[] args) {
			ThisKeyword2 a1= new ThisKeyword2();	
		    a1.details("Pallavi", 18, "ParimalaTalkis 2nd Cross");
		     System.out.println("*****************");
			System.out.println(a1.Name);
			System.out.println(a1.age);
			System.out.println(a1.address);
			
		}
	}


