package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    WebElement autosearch=driver.findElement(By.id("twotabsearchtextbox"));
	    autosearch.sendKeys("shoes");
	    Thread.sleep(3000);
	    List <WebElement> autoSugg=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int sizeofaotosugg=  autoSugg.size();
	    System.out.println(sizeofaotosugg);
	  

	   WebElement as= autoSugg.get(1);
	   
	   System.out.println(as.getText());
	   
	   for(int i=0; i<autoSugg.size(); i++)
	   {
		   System.out.println(autoSugg.get(i).getText());
	   }
	
	   autoSugg.get(autoSugg.size()-7).click();
	    
	   Thread.sleep(2000); 
	    Robot r1=new Robot();
	    r1.keyPress(KeyEvent.VK_WINDOWS);
	    r1.keyPress(KeyEvent.VK_PRINTSCREEN);
	    r1.keyRelease(KeyEvent.VK_PRINTSCREEN);
	    r1.keyRelease(KeyEvent.VK_WINDOWS);

	}

}
