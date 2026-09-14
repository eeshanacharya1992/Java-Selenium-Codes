package Package;

public class ThisKeywordEx {
    int a=12;
    String b="Harish";
    
    void addon(int w, String e)
    {this.a=w;
    	this.b=e;
    	System.out.println("Integer value of addon method is "+w);
    	System.out.println("String value of addon method is "+e);
    }
	public static void main(String[] args) {
		ThisKeywordEx se= new ThisKeywordEx();
		System.out.println("Initial value of a "+se.a);
		System.out.println("Initial value of b "+se.b);
		se.addon(23, "Girish");
		System.out.println("Updated value of a "+se.a);
		System.out.println("Updated value of b "+se.b);

	}

}
