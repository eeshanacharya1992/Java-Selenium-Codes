package Package;

public class ForEachex2 {

	public static void main(String[] args) {
		String a[]= {"Ram","Vishnu","Bhim"};
		//String a[]= {"Ram"};
		int index=0;
		for(String b:a)
		{  if(b.equals("Vishnu"))
			System.out.println(index+" "+b);
			index++;
		//	System.out.print(b+" "+a);
		}
      /* for(int i=0;i<a.length;i++)
       {
    	   if(a[i].equals("Vishnu"))
    	   {
    		  System.out.println("Index of Vishnu "+i); 
    	   }
       }*/
	}

}
