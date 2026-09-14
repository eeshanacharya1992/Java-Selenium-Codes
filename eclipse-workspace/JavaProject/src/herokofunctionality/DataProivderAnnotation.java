package herokofunctionality;

import org.testng.annotations.DataProvider;

public class DataProivderAnnotation {
  @DataProvider(name="login")
  public Object testdata()
  {
	  Object data[][]= new Object[2][2];
	  data[0][0]="eeshan";
	  data[0][1]="eeshan@1992";
	 return data;
	  
  }
}
