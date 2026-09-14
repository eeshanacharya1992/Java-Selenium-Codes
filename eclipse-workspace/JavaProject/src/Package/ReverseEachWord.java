package Package;

public class ReverseEachWord {

	public static void main(String[] args) {
	String c="Hello World";
	String d[]=c.split(" ");
	String output="";
	
	for(String e:d)
	{
		String rev="";
		for(int i=e.length()-1;i>=0;i--)
		{
			rev=rev+e.charAt(i);
		}
		System.out.print(rev+" ");
	//	output=output+rev;
	}
//System.out.println(output);
}
}