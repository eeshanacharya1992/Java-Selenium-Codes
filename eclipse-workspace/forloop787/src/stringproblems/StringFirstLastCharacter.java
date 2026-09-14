package stringproblems;

public class StringFirstLastCharacter {
	
	
	public static void main(String[] args) {
		String a="Manish Kumar Tiwari";
	//	char s1= a.charAt(0);
		for(int i=0;i<=a.length()-1;i++)
		{
			char s11= a.charAt(i);
		//	System.out.print(s11);
		}
		 
		
		String b=a.replaceAll("M", "");
		String c=b.replaceAll("i", "");
		System.out.println(c);

	}

}
