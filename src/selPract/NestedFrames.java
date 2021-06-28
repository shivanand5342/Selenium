package selPract;

import java.util.concurrent.TimeUnit;

import org.apache.batik.transcoder.wmf.tosvg.MetaRecord.StringRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "chromedriver.exe"); 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		WebElement topFrame = driver.findElement(By.xpath("//*[@name='frame-top']"));
		//driver.switchTo().frame("frame-top");//argument is id/name
		//driver.switchTo().frame("frame-middle");//argument is id/name
		driver.switchTo().frame(topFrame);
		WebElement middleFrame = driver.findElement(By.xpath("//*[@name='frame-middle']"));
		driver.switchTo().frame(middleFrame);
		String str = driver.findElement(By.xpath("//*[@id='content']")).getText();
		System.out.println(str);
		
		driver.close();
		
 
		
	}
}
