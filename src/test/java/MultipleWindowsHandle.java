import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class MultipleWindowsHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		String a = driver.findElement(By.tagName("h3")).getText();
		System.out.println(a);
		System.out.println(driver.switchTo().window(parentid).getTitle());
		driver.switchTo().window(parentid);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();

	}

}
