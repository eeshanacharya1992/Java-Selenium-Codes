package pocker;

public class Replace {

	public static void main(String[] args) {
	//	  String name1="GRowTech";
	      // System.out.println(name1.replaceAll(name1, name1.toUpperCase()));
      //    System.out.println(name1.replaceAll(name1, ""));
	String name2="Eeshan2811";
	// System.out.println(name2.replaceAll("Eeshan", "")); 
	System.out.println(name2.replaceAll("[A-Z][a-z]", "[0-9]"));
	}

}
