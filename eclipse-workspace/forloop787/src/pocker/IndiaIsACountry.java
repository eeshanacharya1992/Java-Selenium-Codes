package pocker;

public class IndiaIsACountry {

	public static void main(String[] args) {
		String a2="India is a country";
		String a3= a2.substring(0,5);
		String a4= a2.substring(6,8);
		String a5= a2.substring(9,10);
		String a6= a2.substring(11,18);
		String a7= a3.concat(a4).concat(a5).concat(a6);
		System.out.println(a7);
		System.out.print(a2.substring(0,5));
		System.out.print(a2.substring(6,8));
	    System.out.print(a2.substring(9,10));
		System.out.print(a2.substring(11,18));
		

	}

}
