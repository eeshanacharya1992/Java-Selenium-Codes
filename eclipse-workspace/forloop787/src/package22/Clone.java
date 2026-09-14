package package22;
class TeamPlayer {
	 
    private String name;
 
    public TeamPlayer(String name)
    {
        super();
        this.name = name;
    }
 
    @Override public String toString()
    {
        return "TeamPlayer[Name= " + name + "]";
    }
 
    @Override
    protected Object clone() throws CloneNotSupportedException
       
    {
        return super.clone();
    }
}
public class Clone {

	public static void main(String[] args) {
		  TeamPlayer t1 = new TeamPlayer("Piyush");
	        System.out.println(t1);
	        try {
	             
	             // CloneNotSupportedException will be thrown
	             // because TeamPlayer class not implemented
	             // Cloneable interface.
	              
	            TeamPlayer t2 = (TeamPlayer)t1.clone();
	            System.out.println(t2);
	        }
	 
	        catch (CloneNotSupportedException a) {
	            a.printStackTrace();
	        }
	}

}
