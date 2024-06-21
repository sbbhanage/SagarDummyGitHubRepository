package RahulShettyAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//fieldset/table/tbody/tr"));
		System.out.println("The total number of rows are " + rows.size());
		List<WebElement> coloumns = driver.findElements(By.xpath("//tbody/tr/th"));
		System.out.println("The total number of coloumsn " + coloumns.size());
		List<WebElement> value = driver.findElements(By.xpath("//fieldset/table/tbody/tr[3]/td"));
		for (WebElement a : value) {
			System.out.println(a.getText());
		}
		driver.quit();
	}
}
