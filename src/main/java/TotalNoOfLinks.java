import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNoOfLinks 
{
public static void main(String[] args) {
//commit is added
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.udemy.com/?utm_source=adwords-brand&utm_medium=udemyads&utm_campaign=Brand-Udemy_la.EN_cc.INDIA_dev.&campaigntype=Search&portfolio=BrandDirect&language=EN&product=Course&test=&audience=Keyword&topic=&priority=&utm_content=deal4584&utm_term=_._ag_133043842301_._ad_595460368494_._kw_udemy_._de_c_._dm__._pl__._ti_kwd-296956216253_._li_9050498_._pd__._&matchtype=b&gad_source=1&gclid=CjwKCAjwvIWzBhAlEiwAHHWgvRFsrLdme2384s2hynYQRQTHQI3IWtRRhC_3bteXH6G6gYQylv48mRoC1BMQAvD_BwE");
List<WebElement> links =driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	WebElement footer=driver.findElement(By.className("links-and-language-selector"));
	driver.quit();
	
}
}
