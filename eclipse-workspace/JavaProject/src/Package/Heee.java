package Package;

public class Heee {

	public static void main(String[] args) {
		double[] rollnu = new double[4]; // array can store roll nu of max 3 people 0,1,2
		rollnu[0] =34;  // always assign value from right to left
		rollnu[1] =44;
		rollnu[2] =84;
		rollnu[3] =56;
		double sum=0;
		double average=0;

		for(int i=0;i<=3;i++)
		{
		//sum= sum+rollnu(i);      //getting error on rollnu()
			sum=sum+ rollnu[i];
		}

		 System.out.println(sum);
		 average= sum/rollnu.length;
		 
		 System.out.println(average);


	}

}
