package Package;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
   void add()
   {
	   System.out.println("Hellow world");
   }
	public static void main(String[] args) {
	//	List l1= new ArrayList();
	//	String c="f";
	
		ListClass S= new ListClass();//reference variable "S" in upper case
		S.add();
		ListClass s= new ListClass();//reference variable "s" in lower case
		s.add();
		ListClass SuryaDeep= new ListClass();//reference variable "SuryaDeep"camel case
		SuryaDeep.add();
	}

}
