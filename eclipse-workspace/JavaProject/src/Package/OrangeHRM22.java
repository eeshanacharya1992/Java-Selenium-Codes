package Package;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRM22 {

	@DataProvider(name="Different datas")
	public Object testdata()
	{
		Object data[][]= new Object[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Sita";
		data[1][1]="39";
		data[2][0]="";
		data[2][1]="";
		//data[2][2]="Sam";
		return data;
	}
	@Test(dataProvider="Different datas")
	public void testcase(String username, String password)
	{
		ChromeDriver driver= new ChromeDriver();
		//driver.get(" https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
}
