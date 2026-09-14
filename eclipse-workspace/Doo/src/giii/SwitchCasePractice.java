package giii;
interface does
{
	void soo();
}
abstract class Hello
{
	abstract void add();
}
public class SwitchCasePractice extends Hello implements does{

	public static void main(String[] args) {
		int a=12;
		switch(a)
		{
		case 1:System.out.println("H");
		case 2:System.out.println("d");
		//break;
		default:System.out.println("j");
		}
		SwitchCasePractice ass= new SwitchCasePractice();
		ass.add();
	ass.soo();
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("Ho");
	}

	@Override
	public void soo() {
		System.out.println("lo");
		
	}

}
