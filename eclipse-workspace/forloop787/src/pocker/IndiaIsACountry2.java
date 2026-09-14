package pocker;

public class IndiaIsACountry2 {

	public static void main(String[] args) {
		String a= "IndiaisaCountry";
        String a1= a.substring(0,5);
      
        String a2= a.substring(5,7);
        
        String a3 = a.substring(7,8);
       
        String a4= a.substring(8,15);
        String a5= a1.concat(" ").concat(a2).concat(" ").concat(a3).concat(" ").concat(a4);
	    System.out.println(a5);
	}

}
