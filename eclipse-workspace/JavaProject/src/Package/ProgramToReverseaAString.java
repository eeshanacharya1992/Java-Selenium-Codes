package Package;

public class ProgramToReverseaAString {

	public static void main(String[] args) {
		String a="Madam";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
      System.out.println(b);
      if(a.equalsIgnoreCase(b))
      {
    	  System.out.println("Pallindrome");
      }
      else
      {
    	  System.out.println("Not Pallindrome");
      }
	}
	

}
