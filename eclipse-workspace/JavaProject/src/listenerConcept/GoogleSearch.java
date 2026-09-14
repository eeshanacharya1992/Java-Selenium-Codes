package listenerConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerConceptClass.class)
public class GoogleSearch extends ListenerConceptClass {
@Test
public static void search()
{
	driver=  new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
	Assert.assertFalse(true);
}
}
