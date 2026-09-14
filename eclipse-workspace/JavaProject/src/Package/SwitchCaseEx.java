package Package;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		Scanner sw= new Scanner(System.in);
		//int no=1;
		int no=sw.nextInt();
		switch(no)
		{
		case 1: System.out.println("Launching Chrome Browser");
		//int a=23;
	//	int b=34;
	//	int sum=a+b;
		//System.out.println(sum);
		int a=sw.nextInt();
		int b= sw.nextInt();
		int c=a+b;
		System.out.println(c);
		//break;
		case 2: System.out.println("Launching Firefox Browser");
		//break;
		case 3: System.out.println("Launching Edge Browser");
		//int c=35;
		//int d=45;
		//int diff= d-c;
		//System.out.println(diff);
		case 4: System.out.println("Component");
		//break;
		case 5:System.out.println("Integration");
	//	break;
		
		default:System.out.println("Always print");
		}
		

	}

}
