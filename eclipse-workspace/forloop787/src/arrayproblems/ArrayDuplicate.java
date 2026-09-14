package arrayproblems;

public class ArrayDuplicate {

	public static void main(String[] args) {
		String element[]= new String[4];
		element[0]="Ram";
		element[1]="Vishnu";
		element[2]="Bhim";
		element[3]="Bhim";
		for(int i=0,j=0;i<=3&&j<=3;i++,j++)
		{
			if(element[i]==(element[j]))
			{
				System.out.println("Duplicate is"+i);
				
			}
			else
			{
			System.out.println("Duplicate is"+j);
				//System.out.println("No duplicate");
			}
		}
	}

}
