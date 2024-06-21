package EndToEndTestingOfMakemyTrip;

import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytripUITesting
{

	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		driver.manage().window().maximize();
		
		System.out.println("the driver is working fine");
		WebElement fromcity=driver.findElement(By.xpath("//input[@id='fromCity']"));
		Thread.sleep(2000);
		fromcity.click();
		WebElement a=driver.findElement(By.cssSelector("input[placeholder='From']"));
		a.sendKeys("ban");
		Thread.sleep(2000);

		//List<WebElement> s=driver.findElements(By.xpath("//ul[@role='listbox']//li//p[contains(@class,'font14')]"));
List<WebElement> s=driver.findElements(By.xpath("//div/p/span"));
Thread.sleep(2000);
		System.out.println(s.size());
		
		for(WebElement z:s)
		{
			System.out.println(z.getText());
			if(z.getText().equalsIgnoreCase("MYQ"))
			{
				z.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='toCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("del");
		Thread.sleep(2000);
		List<WebElement> g= driver.findElements(By.xpath("//p/span/span"));
		Thread.sleep(2000);
		System.out.println(g.size());
		for(WebElement j:g)
		{
			if(j.getText().equalsIgnoreCase("New Delhi"))
			{
				j.click();
				break;
			}

		}
		System.out.println("date starts printing here");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--today')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'widgetSearchBtn')]")).click();
		driver.quit();
	}
}
