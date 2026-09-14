package Package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot {

	public static void main(String[] args) throws IOException   {
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.google.com");

		TakesScreenshot ts= driver;

		File source= ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\Screenshot\\Ehsan"+Math.random()+".png");

		FileHandler.copy(source, destination);

	}

}
