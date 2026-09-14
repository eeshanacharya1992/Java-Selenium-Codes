package Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindowhandles {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    // Navigate to the site
    driver.get("https://demoqa.com/browser-windows");

    // Store the parent window handle
    String parentWindow = driver.getWindowHandle();

    // Open 10 new windows by clicking the button 10 times
    for (int i = 0; i < 10; i++) {
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(500); // Small wait to ensure the window opens
    }

    // Get all window handles
    Set<String> allWindows = driver.getWindowHandles();
    Iterator<String> iterator = allWindows.iterator();

    // Loop through all window handles
    while (iterator.hasNext()) {
        String currentWindow = iterator.next();

        // Skip the parent window
        if (currentWindow.equals(parentWindow)) {
            // Switch to child
            driver.switchTo().window(currentWindow);
            System.out.println("Child Window Title: " + driver.getTitle());

            // Perform actions if needed
            // ...

            // Close child window
         //   driver.close();
        }
    }

    // Switch back to parent
    driver.switchTo().window(parentWindow);
    System.out.println("Back to Parent Window Title: " + driver.getTitle());

    // Close the parent window
   // driver.quit();
}
}
