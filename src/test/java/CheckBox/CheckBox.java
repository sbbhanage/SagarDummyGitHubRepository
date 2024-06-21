package CheckBox;

import java.util.List;

import org.openqa.selenium.*; 
import org.openqa.selenium.chrome.*;

public class CheckBox
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement checkBox=driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		System.out.println(checkBox.isSelected());
		checkBox.click();
	
		System.out.println(checkBox.isSelected());
		List<WebElement> totalCheckbox=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(totalCheckbox.size());
		for(WebElement a:totalCheckbox)
		{
			System.out.println(a.getText());
		}
		System.out.println("completed");
	}

}
