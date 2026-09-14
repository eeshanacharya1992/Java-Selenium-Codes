package Package;
interface Codes
{
	void ash();
}
public class ClassProperty implements Codes{
      
	public static void main(String[] args) {
		
		ClassProperty s1= new ClassProperty();
		s1.ash();
	}

	@Override
	public void ash() {
		System.out.println("Hello");
	}

}
