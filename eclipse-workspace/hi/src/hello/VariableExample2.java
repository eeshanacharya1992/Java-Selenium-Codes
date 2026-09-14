package hello;

public class VariableExample2 {  
    static int a=23;
 // static global variables can be directly utilised in static and non static method   
    void add()
    {
    	System.out.println(a);
    }
    
	public static void main(String[] args) {
		System.out.println(a);

	}

}
