package accessspecifierForMethods;

public class AccessSpecifierINsidetheClass {
    public void add()
    {
    	System.out.println("Add");
    }
    void subtract()
    {
    	System.out.println("Subtract");
    }
    private void multiplication()
    {
    	System.out.println("Multiplication");
    }
    protected void division()
    {
    	System.out.println("Division");
    }
	public static void main(String[] args) {
		AccessSpecifierINsidetheClass ds= new AccessSpecifierINsidetheClass();
		ds.add();
		ds.subtract();
		ds.multiplication();
		ds.division();

	}

}
