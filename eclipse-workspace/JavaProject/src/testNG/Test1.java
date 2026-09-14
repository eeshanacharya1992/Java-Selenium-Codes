package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends Launch {
@Test
public void ad()
{
	driver.findElement(By.name("q")).sendKeys("India");
}
}
