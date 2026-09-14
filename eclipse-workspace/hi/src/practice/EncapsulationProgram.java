package practice;
class User
{
	private String username="eeshan";
	private String password="45JJJ";
	
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
}
public class EncapsulationProgram {

	public static void main(String[] args) {
		User ss= new User();
		ss.setusername("vvvv");
		System.out.println(ss.getusername());
		ss.setpassword("ffff");
		System.out.println(ss.getpassword());

	}

}
