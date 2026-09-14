package Package;

public class Reverse {

	public static void main(String[] args) {
	    String input="my name is shailendra singh";
		String reverse="";
		String s[]=input.split(" ");
	//	System.out.println(Arrays.toString(s));

		for(int i=0;i<=s.length-1;i++)
		{
			char c[]=s[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				reverse=reverse+c[j];
			}


		}
               String reverse2=reverse;
           //    System.out.print(reverse2);
               String a1=reverse2.substring(0, 2);
               String a2=reverse2.substring(2, 6);
               String a3=reverse2.substring(6, 8);
               String a4=reverse2.substring(8, 17);
               String a5=reverse2.substring(17, 22);
               String a6=a1.concat(" ").concat(a2).concat(" ").concat(a3).concat(" ").concat(a4).concat(" ").concat(a5);
               System.out.println(a6);



	}

}
