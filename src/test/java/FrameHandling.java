import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling 
{
	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	WebElement frame1=driver.findElement(By.cssSelector("frame[name='frame-top']"));
	driver.switchTo().frame(frame1);
	
	WebElement frame3=driver.findElement(By.cssSelector("[name='frame-middle']"));
	driver.switchTo().frame(frame3);
	System.out.println(frame3.getText());	
	driver.quit();
	}

}
