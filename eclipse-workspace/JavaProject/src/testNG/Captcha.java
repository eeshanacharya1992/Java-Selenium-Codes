package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args) {
		ChromeDriver dv= new ChromeDriver();
		dv.get("https://www.amazon.in/");
	//	dv.findElement(By.id("captchacharacters"));
		dv.navigate().refresh();
	}

	}


