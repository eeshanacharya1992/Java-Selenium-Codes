package proj1;

public class NoOfchar {

	public static void main(String[] args) {
		String a=" Ramu@# 456 ";
		int count=0; int temp=0;int space=0;int spec=0;
		char b[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{   
			boolean s= Character.isAlphabetic(b[i]);
			boolean s2= Character.isDigit(b[i]);
			boolean s3= Character.isSpaceChar(b[i]);
			if(s==true)
			{
				count++;
			}
			
			else if(s2== true)
			{
				temp++;
			}
			
			else if(s3==true)
			{
				space++;
			}
			else
			{
				spec++;
			}
					
		}
             System.out.println(count);
             System.out.println(temp);
             System.out.println(space);
             System.out.println(spec);
             if(a.length()==count+temp+space+spec)
             {
            	 System.out.println("Special characters");
             }
             else
             {
            	 System.out.println("No special");
             }
	}

}
