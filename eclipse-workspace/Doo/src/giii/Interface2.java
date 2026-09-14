package giii;
interface book{
	void book23();
}
interface copy extends book
{
	void copy34();
}

public class Interface2 implements copy {

	public static void main(String[] args) {
		Interface2 sa= new Interface2();
		sa.book23();
		sa.copy34();

	}

	@Override
	public void book23() {
		System.out.println("Books");
		
	}

	@Override
	public void copy34() {
		System.out.println("Copy");
		
	}

}
