package Package;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter M for male and F for female");
		String a = s1.next();

		if (a.equals("F"))
		{
			System.out.println("travel free for F");
		}

		else if (a.equals("M"))
		{
			Scanner s2 = new Scanner(System.in);
			System.out.println("Please enter Age");
			int age=s2.nextInt();

			if (age<12)
			{
				System.out.println("Half ticket");
			}
			if (age>=12 && age<59)
			{
				System.out.println("FUll ticket");
			}
			else
			{
				System.out.println("senior citizen");
			}
			s2.close();
		}

		else
		{

			System.out.println("your option selection is wrong please select F or M");

		}

		s1.close();
	}

}
