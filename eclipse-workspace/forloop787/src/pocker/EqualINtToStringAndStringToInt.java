package pocker;

public class EqualINtToStringAndStringToInt {

	public static void main(String[] args) {
	
	String c ="SET";
	System.out.println(c.toLowerCase());
	System.out.println(c.toUpperCase());
	String d ="1234";
	int number= Integer.parseInt(d);//string to int
	System.out.println("The number is " +number);
	System.out.println(Integer.toString(number)); // int to string
	char d1='E';
	System.out.println(Character.toLowerCase(d1));
	System.out.println(Character.toUpperCase(d1));
	char c1='1';
	int n=Character.getNumericValue(c1);// char to int
	System.out.println(n);
	int n2 =65;
	System.out.println((char)n2);// int to char is narrowing
	char c3='2';
	int c4=c3;
	int c5=(int)c3;
	System.out.println(c4);
	System.out.println(c5);
	
	
	
	
	
		

	}

}
