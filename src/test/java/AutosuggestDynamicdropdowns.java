import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;
public class AutosuggestDynamicdropdowns 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));

		for(WebElement option:options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				option.click();
			}
		}
		driver.manage().window().maximize();
		driver.quit();
		
	}
}
