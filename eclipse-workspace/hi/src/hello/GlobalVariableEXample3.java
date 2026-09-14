package hello;

public class GlobalVariableEXample3 {
    static int s=34;
    
   private static void mulmethod()
    {
    	s=13;
    	System.out.println(s);
    }
    void div()
    {
    //	s=23;
    	System.out.println(s);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	s=100;
	//	System.out.println("The original value of global variable is "+s);
		mulmethod();
		System.out.println("The original value of global variable is "+s);
		GlobalVariableEXample3 sa= new GlobalVariableEXample3();
         sa.div();
         System.out.println("The original value of global variable is "+s);
	}

}
