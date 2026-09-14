package stringproblems;

public class Demo2 {

	public static void main(String[] args) {
		String name="Dinesh12";
		char a1[]=name.toCharArray();
		
		boolean ans= Character.isAlphabetic(a1[6]);
		System.out.println(ans);
		boolean ans33= Character.isAlphabetic(a1[2]);
		System.out.println(ans33);
		boolean ans34= Character.isAlphabetic(2);
		System.out.println(ans34);
		boolean ans1= Character.isAlphabetic('i');
		System.out.println(ans1);
		boolean ans2= Character.isDigit('D');
		System.out.println(ans2);
	}

}
