package selPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {

		// System.setProperty("webdriver.Chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// 1. Select any checkbox
		// 2. Grabe the label of the selected checkbox put it into variable

		driver.get("http://qaclickacademy.com/practice.php");

		List<WebElement> checkbox = driver.findElements(By.xpath("//*[text()='Checkbox Example']/..//label"));
		System.out.println("check boxes count : " + checkbox.size());
		for (int i = 0; i < checkbox.size(); i++) {

			String str = checkbox.get(i).getText().trim();
			System.out.println(str);
			//System.out.println(checkbox.get(i).getText());
			Select select=new Select(driver.findElement(By.id("dropdown-class-example")));
			select.selectByVisibleText(str);
			driver.findElement(By.name("enter-name")).sendKeys(str);
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText().contains(str));
			driver.switchTo().alert().accept();
			
		}
	}

}