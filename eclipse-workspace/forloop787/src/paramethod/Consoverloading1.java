package paramethod;

public class Consoverloading1 {
	Consoverloading1(int a)
	{
		System.out.println(a);
	}
	void Consoverloading(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void Consoverloading(int i, double j)
	{
		double k= i+j;
		System.out.println(k);
	}
	public static void main(String[] args) {
		Consoverloading1 c1=	new Consoverloading1(33);
		c1.Consoverloading(33, 44);
		Consoverloading(34, 22.64);

	}

}
