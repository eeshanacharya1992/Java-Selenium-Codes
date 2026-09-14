package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        try {
            // Open a website with the dropdown
            driver.get("https://www.amazon.in");

            // Locate the dropdown element (replace with the actual locator)
            WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));

            // Create a Select object
            Select dropdown = new Select(dropdownElement);

            // Get all options from the dropdown
            List<WebElement> options = dropdown.getOptions();

            // Specify the option you want to find
            String optionToFind = "Watches";

            // Loop through options to find the desired option and its index
            for (int i = 0; i < options.size(); i++) {
                WebElement option = options.get(i);
                if (option.getText().equals(optionToFind)) {
                    System.out.println("Option: " + optionToFind);
                    System.out.println("Index: " + i);
                    break;
                }
            }

        } finally {
            // Close the browser
            driver.quit();
        }
      }}


