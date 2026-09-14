package paramethod;

public class Constanonsta {
    void add(int a)
    {
    	int sum= a+100;
    	System.out.println(sum);
    }
    static void add(double a, int b)
    {
    	double sum= a+b+100;
    	System.out.println(sum);
    }
    Constanonsta (int c,double d)
    {
    	double sum= c+d+100;
    	System.out.println(sum);
    }
	public static void main(String[] args) {
		Constanonsta c1= new Constanonsta(77,6.77);
		c1.add(44);
		add(6.66,33);

	}

}
