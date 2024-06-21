package RahulShettyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();;

		WebElement op=driver.findElement(By.cssSelector("label[for='benz']"));
		Thread.sleep(2000);
		op.click();
		String o=op.getText();
		System.out.println(op.getText());
		WebElement statticDrop=driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(statticDrop);
		s.selectByVisibleText(o);
		driver.findElement(By.id("name")).sendKeys(o);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String r=driver.switchTo().alert().getText();
		System.out.println(r);
		driver.switchTo().alert().accept();
}

}
