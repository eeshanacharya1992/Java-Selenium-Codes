package giii;
class enca
{
	private String username="eeesha";
	
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
}
public class EncapsulationPractice {

	public static void main(String[] args) {
		enca s= new enca();
		s.setusername("lll");
		System.out.println(s.getusername());
	}

}
