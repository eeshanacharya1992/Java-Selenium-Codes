package Package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classing {
	public static void main(String[] args) throws IOException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		List<WebElement> links= driver.findElements(By.tagName("a"));

		int nooflinks=links.size();

		System.out.println(nooflinks);

		for(int i=0;i<nooflinks;i++)

		{

		WebElement s1= links.get(i);

		String attribute=s1.getAttribute("href");

		System.out.println(attribute);

		brokenlinks( attribute);

		}

		}

		static void brokenlinks(String attribute2) throws IOException

		{

		URL u1= new URL(attribute2);

		HttpURLConnection u2=(HttpURLConnection)u1.openConnection();

		u2.connect();

		System.out.println(u2.getResponseCode());

		if(u2.getResponseCode()==200)

		{

		System.out.println(attribute2+"Valid Link");

		}

		else

		{

		System.out.println(attribute2+"Invalid Link");

		}

		}
}
