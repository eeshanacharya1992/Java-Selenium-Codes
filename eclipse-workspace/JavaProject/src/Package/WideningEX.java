package Package;

import java.util.ArrayList;
import java.util.List;

public class WideningEX {

	public static void main(String[] args) {
		 int weight =12;
		 double weight2= weight;// implicit way of widening because we are not specifically mentioning the name of datatype to which it is converted
		System.out.println(weight2);
         double weight3=(double)weight;//explicit way of widening
         System.out.println(weight3);
         
         int c=12;
         double f=c;
         double g=(double)c;
         int ss=(int)g;
         List a= (List)new ArrayList();
         ArrayList b=(ArrayList)a;
	}

}
