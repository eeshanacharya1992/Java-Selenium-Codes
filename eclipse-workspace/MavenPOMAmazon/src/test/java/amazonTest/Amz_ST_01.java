package amazonTest;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazonSource.HomePage;
import amazonSource.ProductPage;
import amazonSource.SearchResults;

public class Amz_ST_01 extends LaunchQuit{
  @Test
  public void amazonperform()
  {
	  HomePage h1= new HomePage(driver);
	  h1.searching();
	Assert.assertTrue(h1.buttonsearch(), "It is not enabled");
	 
	  SearchResults s1= new SearchResults(driver);
	  s1.selectingshoe(driver);
	/*  Set<String> parentandchild=driver.getWindowHandles();
	  Iterator<String> pc=parentandchild.iterator();
	  String Parent=pc.next();
	  String child=pc.next();
	  driver.switchTo().window(child);*/
	 ProductPage p1= new ProductPage(driver);
	 p1.wishlist();
	
	
  }
}
