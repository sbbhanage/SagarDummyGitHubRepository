import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCartFromEcommerce73 {

	public static void main(String[] args) throws InterruptedException {
		int j=0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(2000);
		String search[] = { "Cucumber", "Brocolli", "Beetroot" };
		List<String> a=Arrays.asList(search);
		System.out.println(a.get(1));
		Thread.sleep(2000);
		for(int i=0;i<items.size();i++)
		{
			String[] name=items.get(i).getText().split("-");
			String formatedName=name[0].trim();
			
			if(a.contains(formatedName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
			}
			if(j==3)
			{break;}
			
			
		}

	}

}
