package Package;
public class Variables {
static int i=10;
int j=20;
static void sum()
{
	i=200;
	System.out.println(i);
	Variables s2= new Variables();
	s2.j=50;
	System.out.println(s2.j);
}
void multiply()
{
	i=100;
	j=500;
	System.out.println(i);
	System.out.println(j);
}
	public static void main(String[] args) {
		sum();
		Variables s1= new Variables();
		s1.multiply();

	}

}
