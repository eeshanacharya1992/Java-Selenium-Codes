package giii;

public class AccessSpecifiers {
    public void sam()
    {
    	System.out.println("sam");
    }
    public void home()
    {
    	System.out.println("home");
    }
    private void ram()
    {
    	System.out.println("Ram");
    }
    void hary()
    {
    	System.out.println("Hary");
    }
    protected void sanjay()
    {
    	System.out.println("Sanjay");
    }
	public static void main(String[] args) {
		AccessSpecifiers sd= new AccessSpecifiers();
		sd.hary();
		sd.ram();
		sd.sam();
		sd.sanjay();

	}

}
