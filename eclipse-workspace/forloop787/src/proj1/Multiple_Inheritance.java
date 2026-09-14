
package proj1;
//To create 5 classes for Multilevel Inheritance
class supergrandparents2{
	 static void one()
		{
		System.out.println("one");}}
class supergrandparents1 extends supergrandparents2{
	static void two()
	{
	System.out.println("two");}}
class grandparents extends supergrandparents1{
	void add(){
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println("adding :" + c);}}
class parents extends grandparents{
	void sub5(){
		System.out.println("subratin");}}
public class Multiple_Inheritance extends parents 
{static void sub(){
		System.out.println("subratin");}
	void multi(){
		System.out.println("multi");}
	
	public static void main(String[] args) {
		Multiple_Inheritance v1= new Multiple_Inheritance();
		
		v1.multi();
		parents p1= new parents();
		p1.sub5();
		sub();
		v1.multi();
		one();
		two();

	}

}

