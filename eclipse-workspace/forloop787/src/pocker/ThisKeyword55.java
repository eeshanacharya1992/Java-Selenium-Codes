package pocker;

public class ThisKeyword55 {
	static final double pi=3.14;
	int r1=3,  r2=6;
//	void f1(int r1)
	void f1()
	{  
		this.r1=7;
		//this.r1=r1;
		System.out.println("The value of x is: "+this.r1);
	}
	//void f2(int r2)
	void f2()
	{
		this.r2=14; 
	//	this.r2=r2; 
		//System.out.println("The value of y is: "+this.r2);
	}
	public static void main(String[] args) {
		ThisKeyword55 a= new ThisKeyword55();
		//a.f1(7);
		//a.f2(14);
		a.f1();
		a.f2();
		int x=a.r1;
		int y=a.r2;
		double a1=pi*x*y;
		System.out.println("The area of circle is: "+a1);
		System.out.println("The value of x is: "+x);
		System.out.println("The value of y is: "+y);

	}

}
