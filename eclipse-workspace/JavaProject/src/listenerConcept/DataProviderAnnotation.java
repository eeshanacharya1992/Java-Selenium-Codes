package listenerConcept;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;;
public class DataProviderAnnotation {
     @DataProvider(name="Std_details")
     public Object testdata()
     {
    	 Object data[][]= new Object[][] {{10},{20},{30}};
    	 return data;
     }
    	@Test(dataProvider="Std_details")
    	public void scenario (int data)
    	{
    		//int sum=data +100;
    		
    		System.out.println(data);
    	}
     }

