import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePratice 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("svg[class='react-date-picker__calendar-button__icon react-date-picker__button__icon']")).click();
		Thread.sleep(2000);

		for(int i=1;i<3;i++)
		{
			driver.findElement(By.className("react-calendar__navigation__label")).click();
Thread.sleep(2000);
		}
		List<WebElement>year=driver.findElements(By.xpath("//button[@type='button']"));
		System.out.println(year.size());
		for(int i=0;i<year.size();i++)
		{
			Thread.sleep(2000);
			String a=year.get(i).getText();
			
			if(a.contains("2027"))
			{
				System.out.println(a);
				year.get(i).click();
				
				Thread.sleep(2000);
			}
			else if(a.contains("June"))
			{
				System.out.println(a);
				year.get(i).click();
			}
		}
		driver.quit();
	}
}
