package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountNoOfDropDownandDisplay {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement s2= driver.findElement(By.id("searchDropdownBox"));
        Select s1= new Select(s2);
        List<WebElement> s3= s1.getOptions();
      
        int optionsno=s3.size();
        System.out.println(optionsno);
        for(int i=0;i<optionsno;i++)
        {
        	WebElement sq= s3.get(i);
        	String sw= sq.getText();
        	System.out.println(sw);
        }
        String optiontofind="Furniture";
        for(int i=0;i<s3.size();i++)
        {
        	WebElement option= s3.get(i);
        	if(option.getText().equals(optiontofind))
        	{
        		System.out.println("Option: "+ optiontofind);
        		System.out.println("Index: "+ i);
        		break;
        	}
        }
	}

}
