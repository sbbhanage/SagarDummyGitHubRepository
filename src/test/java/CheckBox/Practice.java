package CheckBox;

import org.openqa.selenium.*; 
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;


public class Practice {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to the ChromeDriver executable

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Correcting the class name to a single class
        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("abc");

        // Correcting the class name to a single class
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");

        driver.findElement(By.id("exampleCheck1")).click();

        WebElement check = driver.findElement(By.id("exampleFormControlSelect1"));

        Select s = new Select(check);
        s.selectByIndex(1);

        driver.findElement(By.id("inlineRadio1")).click();

        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("67832937");

        driver.findElement(By.cssSelector("input.btn.btn-success")).click();
        Thread.sleep(3000);
        WebElement prof=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
        String a=prof.getText();
    System.out.println(a);
    }
}
