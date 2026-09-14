package giii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerMapConcept {

	public static void main(String[] args) {
		Map<Long, String>m1= new HashMap<Long, String>();
		Scanner s1= new Scanner(System.in);
		int n= s1.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter account number: ");
			long accountnumber=s1.nextLong();
			System.out.println("Enter account holder name: ");
			String accountholder=s1.next();
			m1.put(accountnumber, accountholder);
		//	System.out.println(m1);
		}
		System.out.println(m1);
	}

}
