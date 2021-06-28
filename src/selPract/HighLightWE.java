package selPract;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HighLightWE{
	static WebDriver driver;
	
public static void main(String args[]) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");

driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys("9449665342");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Flipkart@5342");
driver.findElement(By.xpath("//button//span[text()='Login']")).click();

Thread.sleep(3000);
highlightElement(driver.findElement(By.xpath("//input[@name='q']")));
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("MOBILE"+Keys.ENTER);
WebElement we1 = driver.findElement(By.xpath("(//*[@class='s1Q9rs'])[3]"));
highlightElement(we1);
Thread.sleep(3000);
String str=driver.findElement(By.xpath("(//*[@class='s1Q9rs'])[3]")).getText();
System.out.println(str);

driver.close();


}

static void highlightElement(WebElement we) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js. executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", we);
}
}