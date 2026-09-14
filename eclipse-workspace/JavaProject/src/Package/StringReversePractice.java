package Package;

public class StringReversePractice {

	public static void main(String[] args) {
	String a="Rama";
	String output="";
	for(int i=a.length()-1;i>=0;i--)
	{
		output=output+a.charAt(i);
	}
      System.out.println(output);
      if(a.equalsIgnoreCase(output))
      {
    	  System.out.println("Pallindrome");
      }
      else
      {
    	  System.out.println("Not Pallindrome");
      }
	}

}
