package pocker;

public class Replace33 {

	public static void main(String[] args) {
		String f="AYAZ mh 123";
		   String r=f.replaceAll("[0-9]", "");
		  System.out.println(r);
		   System.out.println(r.replaceAll(r, r.toLowerCase()));
		 System.out.println(f.replaceAll("[A-Z]","[a-z]"));
	}

}
