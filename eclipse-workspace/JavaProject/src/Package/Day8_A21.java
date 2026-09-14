package Package;

public class Day8_A21 {
	static int i =10;//static global variable
	int j = 20;// non-static global variable
		
	static void sum() //static method
	{   
			i=200;//updating or re-initializing static global var in static method
			System.out.println(i);//utilizing updated i value
			Day8_A21 d=new Day8_A21();
			d.j=50;//updating or re-initializing non-static global var in static method
			System.out.println(d.j);//utilizing updated j value
	}
	void multiply()//non static method
	{
	    	i= 100;//updating or re-initializing static global var in nonstatic method
	    	j= 500;//updating or re-initializing non-static global var in nonstatic method
	    	System.out.println(i);//utilizing updated i value
	    	System.out.println(j);//utilizing updated j value
	 }
		public static void main(String[] args) 
		{
			//sum();//accessing static method directly inside static method main
			Day8_A21 d5=new Day8_A21();//creating an object
			d5.multiply();//accessing non-static method by ref var inside static method main
		}
}
