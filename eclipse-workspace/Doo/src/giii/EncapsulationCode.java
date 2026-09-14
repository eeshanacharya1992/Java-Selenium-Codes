package giii;
class Customer_Data
{
	private String username="contact@grotechminds.com";
	private String password="password@123";
	private int age=30;
	public int get_age()
	{
		return age;
	}
	public void set_age(int age)
	{
		this.age=age;
	}
	public String get_username()
	{
		return username;
	}
	public void set_username(String username)
	{
		this.username=username;
	}
	public String get_password()
	{
		return password;
	}
	public void set_password(String password)
	{
		this.password=password;
	}
}
public class EncapsulationCode {

	public static void main(String[] args) {
		Customer_Data c1= new Customer_Data();
		c1.set_username("eeshan@grotechminds.com");
		System.out.println(c1.get_username());
	c1.set_age(25);
		System.out.println(c1.get_age());
		c1.set_password("weww");
		System.out.println(c1.get_password());

	}

}
