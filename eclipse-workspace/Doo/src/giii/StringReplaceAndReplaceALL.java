package giii;

public class StringReplaceAndReplaceALL {

	public static void main(String[] args) {
		String s="HariRama3456";
		String c=s.replaceAll("[A-Z]", "");
		String d=s.replaceAll("[a-z]", "");
		String e=s.replaceAll("[a-z][A-Z]", "");//combination of firstsmalllettersandnextcapital
		String f=s.replaceAll("[A-Z][a-z]", "");//combination of firstcapitalandnextsmall
		System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
       
	}

}
