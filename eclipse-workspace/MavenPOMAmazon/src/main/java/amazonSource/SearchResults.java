package amazonSource;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {
WebDriver driver;
@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
WebElement first_shoe;

public void selectingshoe(WebDriver driver)
{this.driver=driver;
	first_shoe.click();
	 Set<String> parentandchild=driver.getWindowHandles();
	  Iterator<String> pc=parentandchild.iterator();
	  String Parent=pc.next();
	  String child=pc.next();
	  driver.switchTo().window(child);
}
public SearchResults(WebDriver driver)
{    this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
