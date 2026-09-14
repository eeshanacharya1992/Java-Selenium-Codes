package practiceInterview;

public class Swap2Strings {

	public static void main(String[] args) {
String str1="ABC";
		
		String str2="DEF";
		
		str1=str1+str2;///ABCDEF
		
		str2=str1.substring(0,str1.length()-str2.length());
		
		/// ABCDEF(0,3)
		
		str1= str1.substring(str2.length());
		
		///ABCDEF.substring(3)
		
		System.out.println("String after is " +str1);
		System.out.println("Second String after is "+str2);
		

	}

}
