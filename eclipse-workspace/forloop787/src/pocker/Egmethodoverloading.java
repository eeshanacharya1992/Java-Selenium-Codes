package pocker;


	public class Egmethodoverloading {

		void add()
		{
			System.out.println("Adding");
		}
		/*void add(int a)
		{
			
			System.out.println("Sub" + a);
		}
		void add(float a, int b)
		{
			float c= a+b;
			String msg1 = "Sub";
			String msg2 = "summation of two num";
			System.out.println("Sub"  );
			System.out.println("Summation of two numbers" );
			System.out.println(msg1.concat(" ").concat(msg2).concat(" ") + c );
		}
		
		void add(int c, int d)
		{
			int f= c+d;
			System.out.println("Integer values"  + f);
		}
		void add(short g, short h)
		{
			short i= g+h;
			System.out.println("Short values"  + i);
		}*/
		void add(boolean x, boolean y)
		{
			if (x==y)
			{
				System.out.println("boolean is true " );
			}
			else 
			{
				System.out.println("boolean is false " );
			}
			boolean z= x;
			boolean o=y;
			System.out.println("Boolean values "  + z +" " + o);
		}
		void add(char l, char m)
		{
			
			System.out.println("Characters are "  + l+ " "+m);
		}
		void add(String p, String q)
		{
			String r = p.concat(" ") .concat(q);
			System.out.println(" String "  + r);
		}
		public static void main(String[] args)
		{
			Egmethodoverloading e1 = new Egmethodoverloading();
			e1.add();
			//e1.add(3);
			//e1.add(2.2f, 5);
		//	e1.add(2,3);
		//	e1.add(4,5);
			e1.add(true, false);
			e1.add(false, false);
			e1.add('A','b');
			e1.add("Sriram", "Ramsree");
			
						
		}
	}

