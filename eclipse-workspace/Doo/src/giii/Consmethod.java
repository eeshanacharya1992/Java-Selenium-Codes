package giii;

public class Consmethod {
	 Consmethod(byte a, int b)

	 {


	 int sum = a+b;


	 System.out.println("value of sum:" +sum);

	 }

	 Consmethod(int b, long a)

	 {

	 long sum1 = b*a;

	 System.out.println("value of sum1:" +sum1);

	 }


	 void add(double d,double b,byte c)

	 {

	 double s1 = d*b*c;

	 System.out.println("value of addition:" +s1);

	 }

	 static void add(int a, int b)

	 {

	 int sum = a+b;

	 System.out.println("value of addition:" +sum);}

	 public static void main(String[] args)

	 {

	 Consmethod sw=new Consmethod((byte)10,20);

	 new Consmethod( 12,34);

	 new Consmethod(12,(long)34);

	 sw.add(13.56, 5.0,(byte)12);

	 add(20,30);



	 }
}
