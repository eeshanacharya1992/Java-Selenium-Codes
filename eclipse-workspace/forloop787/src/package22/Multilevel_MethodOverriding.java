package package22;
class Grandparent
{
	void fitness()
	{
		System.out.println("My grandparent is very fit");
	}
}
class Parent extends Grandparent
{
	void fitness()
	{
		System.out.println("My parent should go on daily work");
		super.fitness();
	}
}
public class Multilevel_MethodOverriding extends Parent {
    void fitness() {
    	System.out.println("Everyone should focus on their fitness");
    	super.fitness();
    }
	public static void main(String[] args) {
		Multilevel_MethodOverriding m1= new Multilevel_MethodOverriding();
        m1.fitness();
	}

}
