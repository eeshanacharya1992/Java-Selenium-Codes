package Package;

public class REverse2 {

	public static void main(String[] args) {
		String a="my name is shailendra singh";
		String output="";
		for(int i=a.length()-1;i>=0;i--)
		{
			output=output+a.charAt(i);
		}
		System.out.println(output);
	}

}
