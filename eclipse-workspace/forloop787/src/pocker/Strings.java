package pocker;

public class Strings {

	public static void main(String[] args) {
	 String name="India";
	 int a= name.length();
	 System.out.println(a);
	 name.length();
	 System.out.println(name.length());
     String name1="    is a country   ";
     name1.length();
     System.out.println(name1.length());
     System.out.println(name.concat(name1));
     System.out.println(name1.concat(name));
     System.out.println(name.concat(name));
     System.out.println(name1.concat(name1));
     String name2="is a country";
     System.out.println(name.concat(name2));
     System.out.println(name);
     System.out.println(name1);
     System.out.println(name2);
     System.out.println(name.concat(" Capital is Delhi"));
     System.out.println(name.toUpperCase());
     String name3=name.concat(name2);
     System.out.println(name3.toUpperCase());
     System.out.println(name.toLowerCase());
     System.out.println(name1.trim());
     System.out.println(name.substring(1));
     System.out.println(name.substring(1, 4));
     System.out.println(name.charAt(2));
     System.out.println(name.indexOf('i'));
     System.out.println(name.lastIndexOf('i'));
     System.out.println(name.isEmpty());
     System.out.println(name.contains("ia"));
     String d="GroTechMinds";
     System.out.println(d.substring(0, 3));
     System.out.println(d.substring(3, 7));
     System.out.println(d.substring(7, 12));
     System.out.println(name1.substring(0,19));
     System.out.println(name1);
	}

}
