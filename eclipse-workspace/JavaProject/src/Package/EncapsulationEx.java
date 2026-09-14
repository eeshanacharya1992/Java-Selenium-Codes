package Package;

class CustomerData
{
	private String username="contact@gmail.com";
	private String password="password@235";
	private int age=34;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}		
}
public class EncapsulationEx {

	public static void main(String[] args) {
		CustomerData cs= new CustomerData();
		cs.setUsername("contact@yahoo.com");
		System.out.println(cs.getUsername());
		cs.setAge(45);
		System.out.println(cs.getAge());
		cs.setPassword("harish@1991");
		System.out.println(cs.getPassword());
		
	}
}
