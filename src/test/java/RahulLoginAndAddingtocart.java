import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RahulLoginAndAddingtocart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");

		WebElement a = driver.findElement(By.cssSelector("select.form-control"));
		Select b = new Select(a);
		b.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("navbar-brand")));
		List<WebElement> d = driver.findElements(By.cssSelector("i[class='zmdi zmdi-shopping-cart']"));
		System.out.println(d.size());

		for(WebElement g:d)
		{
			g.click();
		}
		System.out.println("the clicking operation is done");
		Thread.sleep(3000);
		driver.quit();
	}
}
