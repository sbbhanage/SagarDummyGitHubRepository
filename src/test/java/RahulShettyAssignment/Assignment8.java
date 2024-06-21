package RahulShettyAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	WebElement input=driver.findElement(By.id("autocomplete"));
	input.click();
	input.sendKeys("ind");
	List<WebElement> sug=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	for(WebElement a:sug)
	{
		if(a.getText().equalsIgnoreCase("India"))
		{
			a.click();
		}
	}
	driver.quit();
	
	
}
}
