package practicePrograms;

public class EncapsulationConcept {
  private String username ="eeshan";
  private int id=234;
  public String getusername()
  {
	  return username;
  }
  public void setusername(String username)
  {
	  this.username=username;
  }
  public int getid()
  {
	  return id;
  }
  public void setid(int id)
  {
	  this.id=id;
  }
	public static void main(String[] args) {
		EncapsulationConcept v2= new EncapsulationConcept();
		v2.setusername("noo");
		System.out.println(v2.getusername());
		v2.setid(5);
		System.out.println(v2.getid());
	}

}
