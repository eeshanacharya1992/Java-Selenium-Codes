package Package;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotwithDateFormat {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		TakesScreenshot ts= driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String timestamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File destination= new File("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\Screenshot\\Amazon"+timestamp+".png");
      FileHandler.copy(source, destination);
	}

}
