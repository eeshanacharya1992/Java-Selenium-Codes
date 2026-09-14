package giii;
class HierarchicalParent
{ static void house()
	{
	   System.out.println("House");
	}

}
class HierarchicalChild extends HierarchicalParent
{ static void name()
	{
	  System.out.println("Name");
	}
void forest()
{
	System.out.println("Forest");
}
	
}
class HierarchicalChild2 extends HierarchicalParent
{ static void home()
	{
	   System.out.println("Home");
	}
	
}
public class HierarchicalLevelInherianceEx extends HierarchicalParent {
   static void game()
   {
	   System.out.println("Game");
   }
	public static void main(String[] args) {
		game();
		house();
		HierarchicalChild2.home();
		HierarchicalChild2.house();
		HierarchicalChild.name();
		HierarchicalChild.house();
		new HierarchicalChild().forest();
	}

}
