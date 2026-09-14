package amazonSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
    WebDriver driver;
    @FindBy(id="twotabsearchtextbox")
    WebElement searchtextfield;
    @FindBy(id="nav-search-submit-button")
    WebElement searchbutton;
    
    public void searching()
    {  
    	searchtextfield.sendKeys("shoes");
    	//searchbutton.click();
		searchbutton.isDisplayed();
    	
    }
    public boolean buttonsearch()
    {
    	 return searchbutton.isEnabled();
    	
    }
    
    
   public HomePage(WebDriver driver)
   {   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
}
