package amazonSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
     WebDriver driver;
     @FindBy(name="submit.add-to-registry.wishlist.unrecognized")
     WebElement addtowishlist;
     @FindBy(id="buy-now-button")
     WebElement buynow;
     @FindBy(id="add-to-cart-button")
     WebElement addtocart;
     
     public void wishlist()
     {
    	 addtowishlist.click();
     }
     public void cart()
     {
    	 addtocart.click();
     }
     public void buy()
     {
    	 buynow.click();
     }
   public ProductPage(WebDriver driver)  
   {  this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
}
