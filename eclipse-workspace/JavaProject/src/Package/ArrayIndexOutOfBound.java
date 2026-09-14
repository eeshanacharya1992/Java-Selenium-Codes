package Package;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int rollno[]= new int[3];
		rollno[0]=60;
		rollno[1]=20;
		rollno[2]=30;
	//  rollno[3]=10;
		
		try
		{  
		  for(int i=0;i<=3;i++)
		   {
			System.out.println(rollno[i]);
		    }
			System.out.println("Element of Index 10:"+rollno[3]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Looo");
		}
	}

}
