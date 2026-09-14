package pocker;

public class CharDigits {

	public static void main(String[] args) {
		String name= "Rahul1234";
	String name2 =name.replaceAll(name, name.toUpperCase());
	
	String name3=name2.replaceAll("[A-Z]", "");
	System.out.println("The number of digits present are "+name3.length());
	String name4=name2.replaceAll("[0-9]", "");
	System.out.println("The number of characters present are "+name4.length());
    
}}
