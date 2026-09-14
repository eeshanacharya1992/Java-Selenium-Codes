import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandled {

	public static void main(String[] args) {
		try
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter size of array please");
			int ar[]=new int[s1.nextInt()];
		}
		catch(InputMismatchException e)
		
		{
			System.out.println("HandlesInputMistmatchRunTimeException");
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter only integer of array please");
			int ar[]=new int[s1.nextInt()];
		}
		catch(NegativeArraySizeException e1)
		{
			System.out.println("NegativeArraySizeException handled");
			System.out.println("Enter only Positive array size");
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter size  of array please with integer value only");
			try {
			int ar[]=new int[s1.nextInt()];
		       }
			catch(InputMismatchException e)
			{
				System.out.println("Exception handled for entering array size with integer value only");
			}
	}

}}
