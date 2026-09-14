package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(3000);
		List<WebElement> autosuggestion= driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
int noofautosuggestion= autosuggestion.size();

/*System.out.println(noofautosuggestion);
System.out.println(autosuggestion.get(2).getText());
autosuggestion.get(2).click();*/

for(int i=0;i<noofautosuggestion;i++)
{
	WebElement sq= autosuggestion.get(i);
	String sw= sq.getText();
	System.out.println(sw);
}

	}

}
