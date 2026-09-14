package pocker;

abstract class P998 {
		 P998(){
			 System.out.println("Constructor1 from P998 class");
		 }
		 P998(int a, int b){
			 System.out.println("Constructor2 from P998 class");
		 }
		static void Boom() {
			System.out.println("Happy Deepavalli");
		}
		void Dhoom(){
			System.out.println("Dhoom");
		}
		abstract void walk();
		
	}

	public class P999 extends P998{
		int x=30;
		int y=10;
		int a=12;
		int b=13;
		static int g=100;
		static int h=90;
		P999(){
			this(8);
			System.out.println("Default Constructor");
		}
		P999(int a){
			//super(2,5);  // Super calling statement
		//	this.a=a;
			System.out.println("Constructor1");
			//System.out.println("This key word assigned a value to a "+this.a);
		}
		P999(int a,int b){
		this.a=a;
		this.b=b;
			int sum=a+b;
			System.out.println(sum);
			System.out.println(a);
			System.out.println(b);
			System.out.println("Constructor2");
		}
		static void launch() {
			System.out.println("Launching");
			System.out.println("Global variable static variable"+ g);
			System.out.println("Global variable static variable"+ h);
//			System.out.println("Non static variable and value of x "+ x);
//			System.out.println("Non static variable and value of y"+ y);  we can't access Non static variable inside the Static method
		}
		 void substraction() {
			this.x=x;
			this.y=y;
			System.out.println("Non static variable and value of x "+ x);
			System.out.println("Non static variable and value of y"+ y);
			System.out.println("Global variable static variable"+ g);
			System.out.println("Global variable static variable"+ h);

			System.out.println("Substraction is "+ (x-y));
			
			System.out.println("Static global variable Substarction is "+(g-h));
			
		}

		public static void main(String[] args) {
			
			//new P999(3,7);
			P999 ref=new P999(5,7);
			System.out.println(ref.a);
			System.out.println(ref.b);
			ref.substraction();
			launch();
			

			//ref.Dhoom();
			
			
			 
		}
		@Override
		void walk() {
			System.out.println("Walking fast");
		}
		void Dhoom(){
			System.out.println("Dhoom2");
			super.Dhoom();
		}

	}
	

