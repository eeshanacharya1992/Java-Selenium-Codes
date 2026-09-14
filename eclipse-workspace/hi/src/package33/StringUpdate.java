package package33;

public class StringUpdate {

	public static void main(String[] args) {
		String a="1,234";
		String b="65";
		String c=a+b;
		System.out.println(c);
		String a0=a.replaceAll(",", "");
		int a1= Integer.parseInt(a0);
		int b1=Integer.parseInt(b);
		
		int sum= a1+b1;
		System.out.println(sum);
	
	}

}
