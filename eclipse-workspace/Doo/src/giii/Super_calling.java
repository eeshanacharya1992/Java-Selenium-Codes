package giii;


class testcase1 {
	testcase1(){
		
		System.out.println("super");
		}
}
class screenshot extends testcase1	{
	screenshot(){
		
		System.out.println("screenshot");
	}
}
	
	public class Super_calling extends screenshot{
		Super_calling(){
			super();//implicitly and explicitly
			System.out.println("testcase");
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Super_calling();}
		
	}